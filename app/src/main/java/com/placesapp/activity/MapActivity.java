package com.placesapp.activity;


import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.placesapp.R;
import com.placesapp.common.MetadataCommon;
import com.placesapp.fragment.NearbyFragment;
import com.placesapp.model.LocationData;
import com.placesapp.model.NearbyData;
import com.placesapp.model.PlaceData;
import com.placesapp.service.PlacesManager;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MapActivity extends BaseActivity implements OnMapReadyCallback , GoogleMap.OnMapClickListener ,GoogleMap.OnInfoWindowClickListener ,View.OnClickListener
{

    private Toolbar toolbar;
    private GoogleMap mMap;
    private CardView cardView;
    private TextView txtAddress;
    private MapFragment mapFragment;
    private LatLng mLatLng;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
        initInstances();
    }

    private void initInstances() {
        toolbar = (Toolbar) findViewById(R.id.map_toolbar);

        if (toolbar != null) {

            toolbar.setTitle("Select Location");
            setSupportActionBar(toolbar);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
        cardView = (CardView)findViewById(R.id.card_address);
        txtAddress = (TextView) cardView.findViewById(R.id.text_address);
        cardView.setOnClickListener(this);
        mapFragment = (MapFragment) getFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        try {
            mMap.setMyLocationEnabled(true);
        } catch (SecurityException e) {
            e.printStackTrace();
        }

        showAnotherPin();
    }
    private void showAnotherPin(){
        if (getIntent().getExtras()!=null){
            if (getIntent().getExtras().getParcelable("locationData")!=null){
                PlaceData placeData = getIntent().getExtras().getParcelable("locationData");
                cardView.setVisibility(View.VISIBLE);
                txtAddress.setText(placeData.getName());

                LatLng location = new LatLng(placeData.getLat(), placeData.getLng());

                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(location, 12));
                mMap.addMarker(new MarkerOptions()
                        .position(location)
                        .title(placeData.getName())

                );
            }
        }

    }
    @Override
    public void setLocation(Location location) {
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(location.getLatitude(), location.getLongitude()), 12.0f));
        mMap.setOnMapClickListener(this);
        mMap.setInfoWindowAdapter(new GoogleMap.InfoWindowAdapter() {
            @Override
            public View getInfoWindow(Marker marker) {
                View infoWindowsView = getLayoutInflater().inflate(
                        R.layout.info_window, null);
                infoWindowsView.requestLayout();

                return infoWindowsView;
            }

            @Override
            public View getInfoContents(Marker marker) {
               return null;
            }

        });
        mMap.setOnInfoWindowClickListener(this);
    }



    @Override
    public void onMapClick(LatLng latLng) {
            mMap.clear();
            mLatLng = latLng;
            LocationData.getInstance().setLatLng(mLatLng);
            loadServiceWithLocation();
    }

    private void useGeocoder(LatLng latLng){
         Geocoder geocoder = new Geocoder(getBaseContext());
            List<Address> addresses = null;
            mLatLng = latLng;
            String title ="";
            try {
                addresses = geocoder.getFromLocation(latLng.latitude, latLng.longitude, 1);
                for(int i=0;i<addresses.size();i++){
                    Address address = addresses.get(i);
                    String addressText = String.format("%s, %s",address.getMaxAddressLineIndex() > 0 ? address.getAddressLine(0) : "",address.getCountryName());
                    String[] addtx = addressText.split(",");
                    title = addtx[0];
                }
                setPositionWithMarkerClick(latLng,title);

            } catch (Exception e) {
                e.printStackTrace();
            }
    }
    private void setPlaceDetailShow(String textTitle){
        cardView.setVisibility(View.VISIBLE);
        txtAddress.setText(textTitle);
    }
    private void setPositionWithMarkerClick(LatLng latLng , String textTitle){
        setPlaceDetailShow(textTitle);

        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(latLng, 12));
        mMap.addMarker(new MarkerOptions()
                .position(latLng)
                .title(textTitle)
        ).showInfoWindow();
    }

    private void loadServiceWithLocation(){

        final LatLng latLng = LocationData.getInstance().getLatLng();
        Call<NearbyData> call =  PlacesManager.getInstance().getService().getNearbySearch(latLng.latitude+","+latLng.longitude, 1, MetadataCommon.getInstance().getPlaceAPIKey(getApplicationContext()));
        call.enqueue(new Callback<NearbyData>() {
            @Override
            public void onResponse(Call<NearbyData> call, Response<NearbyData> response) {

                try {
                    if (response.body().getStatus().equals("OVER_QUERY_LIMIT")){
                        Toast.makeText(getApplicationContext(),response.body().getStatus(),Toast.LENGTH_SHORT).show();
                        useGeocoder(latLng);
                    }else{
                        if (response.body().getResults()!=null){
                            for (int i = 0; i < response.body().getResults().size(); i++) {
                                NearbyData.ResultsBean resultsBean = response.body().getResults().get(i);
                                setPositionWithMarkerClick(latLng,resultsBean.getName());
                            }
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }

            @Override
            public void onFailure(Call<NearbyData> call, Throwable throwable) {

            }
        });
    }

    @Override
    public void onInfoWindowClick(Marker marker) {
        selectPlaceDetail();
    }

    private void selectPlaceDetail(){
        LocationData.getInstance().setLatLng(mLatLng);
        setResult(NearbyFragment.RESULT_CODE);
        finish();
    }

    @Override
    public void onClick(View view) {
        if (view.getId()==R.id.card_address){
            selectPlaceDetail();
        }
    }
}
