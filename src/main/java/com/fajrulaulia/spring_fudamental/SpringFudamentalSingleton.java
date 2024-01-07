package com.fajrulaulia.spring_fudamental;

public class SpringFudamentalSingleton {
    private static SpringFudamentalSingleton ObjectDB; 

    public static SpringFudamentalSingleton InitDb(){
        if (ObjectDB == null) {
            ObjectDB = new SpringFudamentalSingleton();
        }

        return ObjectDB;
    }



}
