package com.school.service;

import com.school.models.Student;

public class StudentService extends Student {
    private static long ID;
    public static long counter;

    public StudentService(String name, String surname, int age) {
        super(name, surname, age);
        ID = counter++;
    }

    public void nameCurs(String nameOfCurs){
        System.out.println(nameOfCurs);
    }

    public void teacherStudy(String nameOfTeacher){
        System.out.println(nameOfTeacher);
    }

    public void groupLesson(int groupLesson, char charValue){
        System.out.println(groupLesson + "" + charValue);
    }

}
