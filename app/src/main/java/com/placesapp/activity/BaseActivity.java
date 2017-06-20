package com.placesapp.activity;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;

import com.karumi.dexter.Dexter;
import com.karumi.dexter.MultiplePermissionsReport;
import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.PermissionDeniedResponse;
import com.karumi.dexter.listener.PermissionGrantedResponse;
import com.karumi.dexter.listener.PermissionRequest;
import com.karumi.dexter.listener.multi.MultiplePermissionsListener;
import com.placesapp.R;

import java.util.List;

import io.nlopez.smartlocation.OnLocationUpdatedListener;
import io.nlopez.smartlocation.SmartLocation;


abstract class BaseActivity extends AppCompatActivity implements OnLocationUpdatedListener{
    private boolean locationEnable = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        checkPermission();
    }

    public void checkPermission(){
        if (Build.VERSION.SDK_INT >= 23) {
            callPermissionLocation();
        } else {
            locationEnable = true;
            statusCheck();
        }
    }
    public void statusCheck() {
        final LocationManager manager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);

        if (!manager.isProviderEnabled(LocationManager.GPS_PROVIDER)) {
            startActivity(new Intent(android.provider.Settings.ACTION_LOCATION_SOURCE_SETTINGS));
        }
    }

    public void callPermissionLocation(){

        Dexter.checkPermissions(new MultiplePermissionsListener() {
            @Override
            public void onPermissionsChecked(MultiplePermissionsReport report) {
                List<PermissionGrantedResponse> permissionGrantedResponses = report.getGrantedPermissionResponses();
                List<PermissionDeniedResponse> permissionDeniedResponses = report.getDeniedPermissionResponses();

                for(PermissionGrantedResponse grantedResponse : permissionGrantedResponses)
                {
                    grantedResponse.getPermissionName();
                }

                if (report.areAllPermissionsGranted()){
                    locationEnable = true;
                    statusCheck();
                }

            }

            @Override
            public void onPermissionRationaleShouldBeShown(List<PermissionRequest> permissions, PermissionToken token) {
                token.continuePermissionRequest();
            }
        }, Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.ACCESS_COARSE_LOCATION);
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (locationEnable) {
            try {
                SmartLocation.with(this)
                        .location()
                        .start(this);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        ConnectivityManager connectivityManager =  (ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo netInfo = connectivityManager.getActiveNetworkInfo();
        if (netInfo == null){

            new AlertDialog.Builder(this)
                    .setTitle(getResources().getString(R.string.error))
                    .setMessage(getResources().getString(R.string.cannot_connect_internet))
                    .setPositiveButton("OK", null).show();
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (locationEnable) {
            try {
                SmartLocation.with(this)
                        .location()
                        .stop();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    @Override
    public void onLocationUpdated(Location location) {
        setLocation(location);
    }
   abstract void setLocation(Location location);
}
