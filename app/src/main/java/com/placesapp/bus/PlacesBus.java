package com.placesapp.bus;

import com.squareup.otto.Bus;

/**
 * Created by zfolkz on 6/17/2017 AD.
 */
public class PlacesBus extends Bus{
    private static PlacesBus ourInstance = new PlacesBus();

    public static PlacesBus getInstance() {
        return ourInstance;
    }

    private PlacesBus() {
    }
}
