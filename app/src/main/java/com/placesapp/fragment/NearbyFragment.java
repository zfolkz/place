package com.placesapp.fragment;


import android.app.ProgressDialog;
import android.content.Intent;
import android.location.Address;
import android.location.Geocoder;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.google.android.gms.maps.model.LatLng;
import com.google.gson.Gson;
import com.placesapp.model.OverQueryLimit;
import com.squareup.otto.Subscribe;
import com.placesapp.adapter.NearbyAdapter;
import com.placesapp.bus.PlacesBus;
import com.placesapp.common.MetadataCommon;
import com.placesapp.interfaces.OnFavCallBack;
import com.placesapp.R;
import com.placesapp.activity.MapActivity;
import com.placesapp.model.LocationData;
import com.placesapp.model.NearbyData;
import com.placesapp.model.PlaceData;
import com.placesapp.service.PlacesManager;

import java.util.ArrayList;
import java.util.List;

import io.realm.Realm;
import io.realm.RealmResults;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class NearbyFragment extends Fragment implements View.OnClickListener , OnFavCallBack {
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    public static int REQUEST_CODE = 100;
    public static int RESULT_CODE = 777;
    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private RecyclerView recyclerview;

    ArrayList<PlaceData> placeArrayList = new ArrayList<>();
    private NearbyAdapter nearbyAdapter;
    Realm realm;
    private RealmResults<PlaceData> query;
    private PlaceData place;
    private ProgressDialog progressBar;
    private boolean over_limit = false;
    public NearbyFragment() {
        // Required empty public constructor
    }
    @Override
    public void onStart() {
        super.onStart();
        realm = Realm.getDefaultInstance();
        PlacesBus.getInstance().register(this);
    }

    @Override
    public void onStop() {
        super.onStop();
        realm.close();
        PlacesBus.getInstance().unregister(this);
    }

    public boolean isOver_limit() {
        return over_limit;
    }

    public void setOver_limit(boolean over_limit) {
        this.over_limit = over_limit;
    }

    public static NearbyFragment newInstance(String param1, String param2) {
        NearbyFragment fragment = new NearbyFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    public void setUpAdapter(){
        if (nearbyAdapter!=null){
            nearbyAdapter.notifyDataSetChanged();
        }else{
            nearbyAdapter = new NearbyAdapter(getActivity(), placeArrayList);
            nearbyAdapter.setFavClickListenner(this);
            recyclerview.setAdapter(nearbyAdapter);
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_nearby, container, false);

        recyclerview = (RecyclerView) view.findViewById(R.id.nearby_recyclerview);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerview.setLayoutManager(layoutManager);
        recyclerview.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
            }

            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
            }
        });
        FloatingActionButton floatingActionButton = (FloatingActionButton)view.findViewById(R.id.fabBtn);
        floatingActionButton.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View view) {
        if (view.getId()==R.id.fabBtn){

            Intent i = new Intent(getActivity(),MapActivity.class);
            startActivityForResult(i,REQUEST_CODE);
        }
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_CODE && resultCode == RESULT_CODE){
            loadServiceWithLocation();
        }
    }

    @Override
    public void callbackCall(PlaceData pd,int pos) {

        if (pd.isFav()){
            deletePlaceData(pd);
        }else{
            insertPlaceData(pd);
        }
        checkFavState(pd,pos);
    }

    private void insertPlaceData(PlaceData pd) {
        Gson gson = new Gson();
        pd.setFav(true);
        String jsonInString = gson.toJson(pd);
        try {
            realm.beginTransaction();
            PlaceData placeData = realm.createObjectFromJson(PlaceData.class, jsonInString);
            realm.copyToRealm(placeData);
            realm.commitTransaction();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void checkFavState(final PlaceData pd , final int pos){
        if (isFav(pd)){
            pd.setFav(true);
            placeArrayList.set(pos,pd);
        }else{
            pd.setFav(false);
            placeArrayList.set(pos,pd);
        }
        setUpAdapter();
    }

    public void deletePlaceData(final PlaceData pd){
        realm.executeTransaction(new Realm.Transaction() {
            @Override
            public void execute(Realm realm) {
                query = realm.where(PlaceData.class).equalTo("name", pd.getName()).findAll();
                if (query.size()>0) {
                    query.deleteAllFromRealm();
                }
            }
        });
    }

    public void showed(){
        if (over_limit){
            clearList();
            over_limit = false;
            useGeocoder(LocationData.getInstance().getLatLng());
        }

        for (int i = 0; i < placeArrayList.size(); i++) {
            checkFavState(placeArrayList.get(i),i);
        }
    }
    public boolean isFav(final PlaceData p){
        try {
            realm.executeTransaction(new Realm.Transaction() {
                @Override
                public void execute(Realm realm) {
                    query = realm.where(PlaceData.class).equalTo("name", p.getName()).findAll();
                }
            });
            if (query.size()>0){
                return true;
            }else{
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Subscribe
    public void setUpLocation(LocationData location){
        loadServiceWithLocation();
    }


    private void loadServiceWithLocation(){
        progressBarShow();
        final LatLng latLng = LocationData.getInstance().getLatLng();
        Call<NearbyData> call =  PlacesManager.getInstance().getService().getNearbySearch(latLng.latitude+","+latLng.longitude, 500, MetadataCommon.getInstance().getPlaceAPIKey(getContext()));
        call.enqueue(new Callback<NearbyData>() {
            @Override
            public void onResponse(Call<NearbyData> call, Response<NearbyData> response) {
                progressBarDismiss();
                clearList();
                try {
                    if (response.body().getStatus().equals("OVER_QUERY_LIMIT")){
                        Toast.makeText(getContext(),response.body().getStatus(),Toast.LENGTH_SHORT).show();
                        useGeocoder(latLng);
                    }else{
                        setListFromResponse(response);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                setUpAdapter();
            }
            @Override
            public void onFailure(Call<NearbyData> call, Throwable throwable) {
                progressBarDismiss();
            }
        });
    }

    private void useGeocoder(LatLng latLng){
        Geocoder geocoder = new Geocoder(getContext());
        List<Address> addresses = null;
        try {
            addresses = geocoder.getFromLocation(latLng.latitude, latLng.longitude, 1);
            for(int i=0;i<addresses.size();i++){
                Address address = addresses.get(i);
                String add = addresses.get(i).getAddressLine(0); // If any additional address line present than only, check with max available address lines by getMaxAddressLineIndex()
                place = new PlaceData();
                place.setName(add);
                place.setLat(address.getLatitude());
                place.setLng(address.getLongitude());
                place.setUrlLink(address.getUrl());
                placeArrayList.add(place);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void clearList(){
        placeArrayList.clear();
    }
    private void setListFromResponse(Response<NearbyData> response){
        if (response.body().getResults()!=null){
            for (int i = 0; i < response.body().getResults().size(); i++) {
                NearbyData.ResultsBean resultsBean = response.body().getResults().get(i);
                place = new PlaceData();
                place.setName(resultsBean.getName());
                place.setLat(resultsBean.getGeometry().getLocation().getLat());
                place.setLng(resultsBean.getGeometry().getLocation().getLng());
                if (isFav(place)){
                    place.setFav(true);
                }else{
                    place.setFav(false);
                }
                if (resultsBean.getPhotos()!=null) {
                    place.setImageRef(resultsBean.getPhotos().get(0).getPhoto_reference());
                }

                placeArrayList.add(place);
            }
        }

    }
    private void progressBarDismiss(){
        if (progressBar.isShowing()){
            progressBar.dismiss();
        }
    }
    private void progressBarShow(){
        progressBar = ProgressDialog.show(getContext(), null, "Loading...");
    }
}
