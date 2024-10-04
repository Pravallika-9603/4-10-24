package com.neoteric.java.model;

public class Task {
    public Location fromLoc;
    public Location toLoc;
    public String user;

    @Override
    public String toString() {
        return "Task{" +
                "fromLoc=" + fromLoc +
                ", toLoc=" + toLoc +
                ", user='" + user + '\'' +
                '}';
    }
}
