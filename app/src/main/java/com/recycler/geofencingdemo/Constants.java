package com.recycler.geofencingdemo;

import com.google.android.gms.maps.model.LatLng;

import java.util.HashMap;

/**
 * Created by Manu on 11/24/2017.
 */

public class Constants {

//Location
    public static final String GEOFENCE_ID = "GIZA";
//    public static final String GEOFENCE_ID_GIZA = "TACME";

//    public static final float GEOFENCE_RADIUS_IN_METERS = 100;
    public static final float GEOFENCE_RADIUS_IN_METERS = 20000;


    /**
     * Map for storing information about tacme in the dubai.
     */
    public static final HashMap<String, LatLng> AREA_LANDMARKS = new HashMap<String, LatLng>();

    static {
        // Tacme
//        AREA_LANDMARKS.put(GEOFENCE_ID, new LatLng(25.116354, 55.390398));


        //Giza
        AREA_LANDMARKS.put(GEOFENCE_ID, new LatLng(29.9839756, 31.1815977));



    }
}