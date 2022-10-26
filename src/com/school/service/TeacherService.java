package com.school.service;

import com.school.models.Teacher;

public class TeacherService extends Teacher {
    private static long ID;
    public static long counter;

    public TeacherService(String name, String teachLanguage) {
        super(name, teachLanguage);
        ID = counter++;
    }

    public void groupTeach(int groupLesson, char charValue){
        System.out.println(groupLesson + "" + charValue);
    }
}
