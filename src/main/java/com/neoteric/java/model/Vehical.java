package com.neoteric.java.model;

public class Vehical {
    public VehicalTypeEnum type;
    public String no;
    public Insurence vinsurence;
    public Driver driver;

    @Override
    public String toString() {
        return "Vehical{" +
                "type=" + type +
                ", no='" + no + '\'' +
                ", vinsurence=" + vinsurence +
                ", driver=" + driver +
                '}';
    }
}
