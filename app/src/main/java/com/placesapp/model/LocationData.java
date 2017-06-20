package com.placesapp.model;

import android.location.Location;

import com.google.android.gms.maps.model.LatLng;

/**
 * Created by zfolkz on 6/20/17.
 */

public class LocationData {
    private LatLng latLng;
    private Location location;

    private static final LocationData ourInstance = new LocationData();

    public static LocationData getInstance() {
        return ourInstance;
    }

    private LocationData() {
    }


    public LatLng getLatLng() {
        return latLng;
    }

    public void setLatLng(LatLng latLng) {
        this.latLng = latLng;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
        setLatLng(new LatLng(location.getLatitude(),location.getLongitude()));
    }
}
