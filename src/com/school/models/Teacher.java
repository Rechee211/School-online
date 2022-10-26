package com.school.models;

public class Teacher {
    private static long ID;
    public static long counter;

    public String name;
    public String teachLanguage;

    public Teacher(String name, String teachLanguage) {
        this.name = name;
        this.teachLanguage = teachLanguage;
        ID = counter++;
    }
}

