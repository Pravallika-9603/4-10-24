package com.neoteric.java.model;

public class User {

        public String name;
        public String mobile;
        public String gender;
        public int age;
        public String userid;

        @Override
        public String toString() {
            return "User{" +
                    "name='" + name + '\'' +
                    ", mobile='" + mobile + '\'' +
                    ", gender='" + gender + '\'' +
                    ", age=" + age +
                    ", userid='" + userid + '\'' +
                    '}';
        }
    }


