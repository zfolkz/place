package com.placesapp.common;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;

/**
 * Created by zfolkz on 6/20/17.
 */

public class MetadataCommon {

    private static MetadataCommon ourInstance = new MetadataCommon();

    public static MetadataCommon getInstance() {
        return ourInstance;
    }

    private MetadataCommon() {
    }

    public String getPlaceAPIKey(Context context){
        ApplicationInfo ai;
        String myApiKey = "";
        try {
            ai = context.getPackageManager().getApplicationInfo(context.getPackageName(), PackageManager.GET_META_DATA);
            Bundle bundle = ai.metaData;
            myApiKey = bundle.getString("com.google.android.place.API_KEY");
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }

        return myApiKey;
    }
}
