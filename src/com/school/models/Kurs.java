package com.school.models;

public class Kurs{
    public long IDkurs1;
    public static long counter;
    private Teacher lastNameTeacher;
    private Student lastNameStudent;
    private Lecture NameLecture;

    public Kurs(long IDkurs1) {
        this.IDkurs1 = IDkurs1;
        counter++;
    }
}
