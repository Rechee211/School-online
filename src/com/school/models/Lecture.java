package com.school.models;

public class Lecture {
    private long IDlecture;

    public long IDkurs;
    public static long counter;
    public String homeWork;
    public String additional_material;

//    public int numberOfTopics;

    public Lecture(long IDlecture, long IDkurs) {
        this.IDlecture = IDlecture;
        IDkurs++;
        this.IDkurs = IDkurs;

//        this.numberOfTopics = numberOfTopics;
//        this.homeWork = homeWork;
//        this.additional_material = additional_material;
        counter++;
    }
}
