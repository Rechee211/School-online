package com.school.models;

public class Kurs{
    private static long ID;
    public static long counter;
    public String nameOfKurs;

    public Kurs(String nameOfKurs) {
        this.nameOfKurs = nameOfKurs;
        ID = counter++;
    }
}
