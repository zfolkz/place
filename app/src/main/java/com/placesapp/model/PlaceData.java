package com.placesapp.model;

import android.os.Parcel;
import android.os.Parcelable;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by zfolkz on 6/16/2017 AD.
 */

public class PlaceData extends RealmObject implements Parcelable {
    @PrimaryKey
    private String name;
    private String address;
    private String urlLink;
    private String imageRef;
    private boolean fav;
    private double lat;
    private double lng;


    public String getImageRef() {
        return imageRef;
    }

    public void setImageRef(String imageRef) {
        this.imageRef = imageRef;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    public boolean isFav() {
        return fav;
    }

    public void setFav(boolean fav) {
        this.fav = fav;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUrlLink() {
        return urlLink;
    }

    public void setUrlLink(String urlLink) {
        this.urlLink = urlLink;
    }


    public PlaceData() {
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeString(this.address);
        dest.writeString(this.urlLink);
        dest.writeString(this.imageRef);
        dest.writeByte(this.fav ? (byte) 1 : (byte) 0);
        dest.writeDouble(this.lat);
        dest.writeDouble(this.lng);
    }

    protected PlaceData(Parcel in) {
        this.name = in.readString();
        this.address = in.readString();
        this.urlLink = in.readString();
        this.imageRef = in.readString();
        this.fav = in.readByte() != 0;
        this.lat = in.readDouble();
        this.lng = in.readDouble();
    }

    public static final Creator<PlaceData> CREATOR = new Creator<PlaceData>() {
        @Override
        public PlaceData createFromParcel(Parcel source) {
            return new PlaceData(source);
        }

        @Override
        public PlaceData[] newArray(int size) {
            return new PlaceData[size];
        }
    };
}
