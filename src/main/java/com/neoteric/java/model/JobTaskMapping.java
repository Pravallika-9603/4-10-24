package com.neoteric.java.model;

import java.util.Date;

public class JobTaskMapping {

    public Date startTime;
    public Date endTime;
    public Task task;
    public Vehical vehical;

    @Override
    public String toString() {
        return "JobTaskMapping{" +
                "startTime=" + startTime +
                ", endTime=" + endTime +
                ", task=" + task +
                ", vehical=" + vehical +
                '}';
    }
}
