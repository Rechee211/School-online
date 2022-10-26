package com.school.models;

public class Student {
    private static long ID;
    public static long counter;
    public int groupLesson;
    public String name;
    public String surname;
    public int age;

    public Student(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        ID = counter++;
    }

}
