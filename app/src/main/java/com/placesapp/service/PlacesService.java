package com.placesapp.service;


import com.placesapp.model.NearbyData;
import com.placesapp.model.PlaceDetailData;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by zfolkz on 11/30/16 AD.
 */
public interface PlacesService {

    @GET("maps/api/place/nearbysearch/json")
    Call<NearbyData> getNearbySearch(@Query("location") String location , @Query("radius") int radius , @Query("key") String apiKey);

    @GET("maps/api/place/details/json")
    Call<PlaceDetailData> getPlaceDetail(@Query("placeid") String placeid , @Query("key") String apiKey);

    @GET("maps/api/place/photo?maxwidth=400")
    Call<PlaceDetailData> getPlacePhoto(@Query("photoreference") String photoreference , @Query("key") String apiKey);
}