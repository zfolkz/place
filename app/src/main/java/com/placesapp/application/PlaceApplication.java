package com.placesapp.application;

import android.app.Application;

import com.karumi.dexter.Dexter;

import io.realm.Realm;
import io.realm.RealmConfiguration;

/**
 * Created by zfolkz on 6/17/2017 AD.
 */

public class PlaceApplication extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        Dexter.initialize(getApplicationContext());
        Realm.init(getApplicationContext());
        initRealm();
    }
    public void initRealm() {
        RealmConfiguration realmConfiguration = new RealmConfiguration.Builder()
                .name("android.realm")
                .schemaVersion(0)
                .deleteRealmIfMigrationNeeded()
                .build();
        Realm.setDefaultConfiguration(realmConfiguration);
    }
}
