package com.seb;

import java.util.ArrayList;

public class Teacher extends Person {
    private ArrayList<Course> coursesTeaching = new ArrayList<>();
    private  ArrayList<Teacher> teachers=new ArrayList<>();

    public void setCoursesTeaching(ArrayList<Course> coursesTeaching) {
        this.coursesTeaching = coursesTeaching;
    }

    public ArrayList<Course> getCoursesTeaching() {
        return coursesTeaching;
    }

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(ArrayList<Teacher> teachers) {
        this.teachers = teachers;
    }

    public void add(){
        String anyother="";
    do {
        Teacher aTeacher = new Teacher();
        ArrayList<Course> cour=new ArrayList<>();
        System.out.println("Enter first name of the teacher:");
        String firstName = sc.nextLine();
        aTeacher.setFirstName(firstName);
        System.out.println("Enter last name of the teacher:");
        String lastName = sc.nextLine();
        aTeacher.setLastName(lastName);
        System.out.println("Enter ID number of the teacher:");
        String idNumber = sc.nextLine();
        aTeacher.setIdNo(idNumber);
        System.out.println("Enter Email of the teacher:");
        String email = sc.nextLine();
        aTeacher.setEmail(email);

        System.out.println("Enter the courses that the teacher teaches");
        int count = 1;
        String anyOtherCourses = "";
        do {
            Course aCourse = new Course();
            System.out.println("Enter course " + count + ".");
            String courseName = sc.nextLine();
            aCourse.setCourseName(courseName);
            System.out.println("Enter course ID:");
            String courseId = sc.nextLine();
            aCourse.setCourseId(courseId);
            cour.add(aCourse);
            System.out.println("Any other courses for this teacher (Yes/No)");
            anyOtherCourses = sc.nextLine();
            count++;
        } while (anyOtherCourses.equalsIgnoreCase("yes"));

        System.out.println("Any other teachers?(yes/no)");
        anyother=sc.nextLine();
        aTeacher.setCoursesTeaching(cour);
        teachers.add(aTeacher);
    }while(anyother.equalsIgnoreCase("yes"));
    }




}