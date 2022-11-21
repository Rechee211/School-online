package com.school;

import com.school.models.Kurs;
import com.school.models.Lecture;
import com.school.service.LectureService;
import com.school.service.StudentService;
import com.school.service.TeacherService;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Kurs kurs = new Kurs(10);

        Lecture firstLecture = new Lecture(1, kurs.IDkurs1);
        Lecture secondLecture = new Lecture(2, firstLecture.IDkurs);
        Lecture thirdLecture = new Lecture(3, secondLecture.IDkurs);
        Lecture fourthLecture = new Lecture(4, thirdLecture.IDkurs);
        Lecture fifthLecture = new Lecture(5, fourthLecture.IDkurs);
        Lecture sixthLecture = new Lecture(6, fifthLecture.IDkurs);


        System.out.println("Lecture six = id: " + firstLecture.IDkurs);
        System.out.println("Lecture six = id: " + secondLecture.IDkurs);
        System.out.println("Lecture six = id: " + sixthLecture.IDkurs);
        System.out.println("How many creat lecture: " + Lecture.counter);

    }
}