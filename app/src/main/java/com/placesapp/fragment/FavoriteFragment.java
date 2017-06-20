package com.placesapp.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.placesapp.adapter.NearbyAdapter;
import com.placesapp.interfaces.OnFavCallBack;
import com.placesapp.R;
import com.placesapp.model.PlaceData;

import java.util.ArrayList;

import io.realm.Realm;
import io.realm.RealmResults;
import io.realm.Sort;


public class FavoriteFragment extends Fragment implements OnFavCallBack {

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private RecyclerView recyclerview;
    private Realm realm;
    private RealmResults<PlaceData> query;

    ArrayList<PlaceData> favArrayList = new ArrayList<>();

    LinearLayoutManager layoutManager;

    public FavoriteFragment() {
        // Required empty public constructor
    }

    public static FavoriteFragment newInstance(String param1, String param2) {
        FavoriteFragment fragment = new FavoriteFragment();
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
        realm = Realm.getDefaultInstance();
    }
    @Override
    public void onStart() {
        super.onStart();
        realm = Realm.getDefaultInstance();
    }

    @Override
    public void onStop() {
        super.onStop();
        realm.close();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_favorite, container, false);

        recyclerview = (RecyclerView) view.findViewById(R.id.favorite_recyclerview);
        layoutManager = new LinearLayoutManager(getActivity());
        recyclerview.setLayoutManager(layoutManager);

        return view;
    }

    private void loadData(){
        query = realm.where(PlaceData.class).findAll();
        query = query.sort("name", Sort.ASCENDING);
        query.size();

        try {
            favArrayList = new ArrayList(query);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void setUpAdapter(){
        NearbyAdapter favAdapter = new NearbyAdapter(getActivity(),favArrayList);
        favAdapter.setFavClickListenner(this);
        recyclerview.setAdapter(favAdapter);
    }

    @Override
    public void callbackCall(PlaceData pd, int pos) {
        deletePlaceData(pd);
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
       showed();
    }

    public void showed(){
        loadData();
        setUpAdapter();
    }
}
