package com.school.models;

public class Lecture {
    private static long ID;
    public static long counter;
    public String homeWork;
    public String additional_material;

    public int numberOfTopics;

    public Lecture(int numberOfTopics, String homeWork, String additional_material) {
        this.numberOfTopics = numberOfTopics;
        this.homeWork = homeWork;
        this.additional_material = additional_material;
        ID = counter++;
    }
}
