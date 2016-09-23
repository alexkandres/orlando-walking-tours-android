package com.codefororlando.orlandowalkingtours.data.model;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

// Schema defined by https://brigades.opendatanetwork.com/resource/aq56-mwpv.json
public class RemoteLandmark {
    public static final String DATA_URL =
            "https://orlando-walking-tours.firebaseio.com/historic-locations.json";

    public String id;
    public String address;
    public String city;
    public String description;
    public Date localRegistryDate;
    public Location location;
    public String name;
    public String type;

    public void setId(String id){
        this.id = id;
    }

    public void setCity(String city){
        this.city = city;
    }

    public static class Location {
        public float latitude;
        public float longitude;
    }
}
