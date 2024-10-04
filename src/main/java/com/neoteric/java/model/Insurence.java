package com.neoteric.java.model;

import java.util.Date;

public class Insurence {
    public String id;
    public Date dob;


    @Override
    public String toString() {
        return "Insurence{" +
                "id='" + id + '\'' +
                ", dob=" + dob +
                '}';
    }
}
