package com.school;

import com.school.models.Lecture;
import com.school.service.LectureService;
import com.school.service.StudentService;
import com.school.service.TeacherService;

public class Main {
    public static void main(String[] args) {

        LectureService serviceFirst = new LectureService();
        LectureService serviceSecond = new LectureService();
        LectureService serviceThird = new LectureService();

        //Add new objects from 5 task for git
        LectureService serviceFourth = new LectureService();
        LectureService serviceFifth = new LectureService();

        Lecture lectureFirst = new Lecture(1 ,"Book A2, exersise 1, 2-A, 3 and 4", "You can see more information on 273 page, how can you do this homework");
        Lecture lectureSecond = new Lecture(1,"Book A2, exersise 5, 6-A-B , 7 and 9", "You can see more information on 276 page, how can you do this homework");
        Lecture lectureThird = new Lecture(2,"Book A2, exersise 2, 1-A-B-C, 3-7", "You can see more information on 295 page, how can you do this " +
                "homework and i sent on email additional information");

        //Add new objects from 5 task for git
        Lecture lectureFourth = new Lecture(1,"Book A3, exersise 2, 6-A-B , 7 and 9", "You can see more information on 271 page, how can you do this homework");
        Lecture lectureFifth = new Lecture(1,"Book A2, exersise 2, 1-A-B-C, 3-7", "You can see more information on 297 page, how can you do this " +
                "homework and i sent on email additional information");

        System.out.println("-----------------");
        System.out.println("Topic of number: " + lectureFourth.numberOfTopics + "\n" + "Homework: " + lectureFourth.homeWork + "\n" + "Additional material: " + lectureFourth.additional_material);
        System.out.println("-----------------");

        System.out.println("-----------------");
        System.out.println("Topic of number: " + lectureFifth.numberOfTopics + "\n" + "Homework: " + lectureFifth.homeWork + "\n" + "Additional material: " + lectureFifth.additional_material);
        System.out.println("-----------------");

        //------------------------------------------------

        System.out.println("-----------------");
        serviceFirst.lectureLanguge("English");
        System.out.println("-----------------");
        System.out.println("Topic of number: " + lectureFirst.numberOfTopics + "\n" + "Homework: " + lectureFirst.homeWork + "\n" + "Additional material: " + lectureFirst.additional_material);
        System.out.println("-----------------");
        serviceSecond.lectureLanguge("English");
        System.out.println("-----------------");
        System.out.println("Topic of number: " + lectureSecond.numberOfTopics + "\n" + "Homework: " + lectureSecond.homeWork + "\n" + "Additional material: " + lectureSecond.additional_material);
        System.out.println("-----------------");
        serviceThird.lectureLanguge("Spanish");
        System.out.println("-----------------");
        System.out.println("Topic of number: " + lectureThird.numberOfTopics + "\n" + "Homework: " + lectureThird.homeWork + "\n" + "Additional material: " +   lectureThird.additional_material);
        System.out.println("-----------------");
        System.out.println("Value of counter: " + Lecture.counter);
        System.out.println("-----------------");
        System.out.println("Value of counter servers for Lecture: " + LectureService.counter);

        System.out.println("-----------------" + "\n" + "-----------------" + "\n" + "Parameters for students" + "\n" + "-----------------");

        StudentService studentFirst = new StudentService("Vova", "Kozlov", 21);
        System.out.println("Student: " + studentFirst.name + " " + studentFirst.surname + " " + studentFirst.age);
        System.out.println("Language studying:");
        studentFirst.nameCurs("English");
        System.out.println("Teacher name:");
        studentFirst.teacherStudy("Lusy");
        System.out.println("Number group of lesson: ");
        studentFirst.groupLesson(11, 'C');

        System.out.println("-----------------");

        StudentService studentSecond = new StudentService(
                "Anastasia", "Lubinska", 18);
        System.out.println("Student: " + studentSecond.name + " " + studentSecond.surname + " " + studentSecond.age);
        System.out.println("Language studying:");
        studentSecond.nameCurs("English");
        System.out.println("Teacher name:");
        studentSecond.teacherStudy("Violetta");
        System.out.println("Number group of lesson: ");
        studentFirst.groupLesson(22, 'B');

        System.out.println("-----------------");

        StudentService studentThird = new StudentService("Petr", "Jakubowski", 25);
        System.out.println("Student: " + studentThird.name + " " + studentThird.surname + " " + studentThird.age);
        System.out.println("Language studying:");
        studentThird.nameCurs("Spanish");
        System.out.println("Teacher name:");
        studentThird.teacherStudy("Marta");
        System.out.println("Number group of lesson: ");
        studentFirst.groupLesson(13, 'A');

        System.out.println("-----------------");
        System.out.println("Value of counter servers for Student: " + LectureService.counter);

        System.out.println("-----------------" + "\n" + "-----------------" + "\n" + "Parameters for teacher" + "\n" + "-----------------");

        TeacherService teacherFirst = new TeacherService("Lusy", "English");
        System.out.println("Teacher: " + teacherFirst.name + " " + teacherFirst.teachLanguage );
        System.out.println("Number group for teaching: ");
        teacherFirst.groupTeach(11, 'C');

        System.out.println("-----------------");

        TeacherService teacherSecond = new TeacherService("Violetta", "English");
        System.out.println("Teacher: " + teacherSecond.name + " " + teacherSecond.teachLanguage );
        System.out.println("Number group for teaching: ");
        teacherFirst.groupTeach(22, 'B');

        System.out.println("-----------------");

        TeacherService teacherThird = new TeacherService("Marta", "Spanish");
        System.out.println("Teacher: " + teacherThird.name + " " + teacherThird.teachLanguage );
        System.out.println("Number group for teaching: ");
        teacherFirst.groupTeach(13, 'A');

        System.out.println("-----------------");
        System.out.println("Value of counter servers for Teacher: " + TeacherService.counter);
    }
}