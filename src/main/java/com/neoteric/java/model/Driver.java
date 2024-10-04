package com.neoteric.java.model;

public class Driver {
    public String name;
    public String mobileNo;
    public Insurence dinsurence;

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                ", dinsurence=" + dinsurence +
                '}';
    }
}
