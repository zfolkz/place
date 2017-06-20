package com.placesapp.service;


import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by zfolkz on 12/1/16 AD.
 */
public class PlacesManager {

    Retrofit retrofit;
    PlacesService service;
    public static final String BaseUrl = "https://maps.googleapis.com/";

    private static PlacesManager ourInstance = new PlacesManager();

    public static PlacesManager getInstance() {
        return ourInstance;
    }

    private PlacesManager() {
        retrofit = new Retrofit.Builder()
                .baseUrl(BaseUrl)
                .client(getRequestHeader())
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        service = retrofit.create(PlacesService.class);

    }

    public PlacesService getService() {
        return service;
    }

    public void setService(PlacesService service) {
        this.service = service;
    }
    private OkHttpClient getRequestHeader() {
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);
        return new OkHttpClient.Builder()
                .addInterceptor(logging)
                .readTimeout(60, TimeUnit.SECONDS)
                .connectTimeout(60, TimeUnit.SECONDS)
                .build();
    }
}
