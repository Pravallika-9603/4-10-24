package com.neoteric.java.service;

import com.neoteric.java.model.*;

import java.util.Date;
import java.util.UUID;

public class Ride {

    public static void main(String[] args) {

        User user=new User();
        user.name="kiran";
        user.age=90;
        user.gender="F";
        user.userid="1";
        user.mobile="098760987";

        Insurence insurence=new Insurence();
        insurence.id= UUID.randomUUID().toString();
        insurence.dob=new Date();

        Insurence insurence1=new Insurence();
        insurence1.id=UUID.randomUUID().toString();
        insurence1.dob=new Date();

        Location location=new Location();
        location.lat="56789";
        location.lng="45678";

        Location location1=new Location();
        location1.lat="5678967";
        location1.lng="4567887";

        Driver driver=new Driver();
        driver.name="Anil";
        driver.mobileNo="3456789987";
        driver.dinsurence=insurence1;

        Vehical vehical=new Vehical();
        vehical.vinsurence=insurence;
        vehical.type=VehicalTypeEnum.auto;
        vehical.no="5678";
        vehical.driver=driver;

        Task task=new Task();
        task.fromLoc=location;
        task.toLoc=location1;
        task.user=user.userid;

        JobTaskMapping jobTaskMapping=new JobTaskMapping();
        jobTaskMapping.task=task;
        jobTaskMapping.vehical=vehical;
        jobTaskMapping.startTime=new Date();
        jobTaskMapping.endTime=new Date();


        System.out.println(jobTaskMapping.vehical.driver.dinsurence.id);
        System.out.println(jobTaskMapping.vehical.vinsurence.id);
        System.out.println(jobTaskMapping.task.fromLoc);

    }
}
