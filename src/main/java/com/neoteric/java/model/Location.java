package com.neoteric.java.model;

public class Location {

    public String lat;

    public String lng;

    @Override
    public String toString() {
        return "Location{" +
                "lat='" + lat + '\'' +
                ", lng='" + lng + '\'' +
                '}';
    }
}
