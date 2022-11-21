package com.school.service;

public class LectureService{
    private static long ID;
    public static long counter;

    public LectureService() {
        ID = counter++;
    }


    public void lectureLanguge(String typeOfLanguage){

        System.out.println(typeOfLanguage);
    }

}
