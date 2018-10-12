package com.seb;

import java.util.ArrayList;

public class Student extends Person {
   ArrayList<Course> coursesTaking = new ArrayList<Course>();
   ArrayList<Student> students = new ArrayList<Student>();


    public void setCoursesTaking(ArrayList<Course> coursesTaking) {
        this.coursesTaking = coursesTaking;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Course> getCoursesTaking() {
        return coursesTaking;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }


    public void add() {

        String anyOther = "";
        do {
           Student aStudent = new Student();
            ArrayList<Course> cour=new ArrayList<>();
            System.out.println("Enter first name of the student:");
            String firstName = sc.nextLine();
            aStudent.setFirstName(firstName);
            System.out.println("Enter last name of the student:");
            String lastName = sc.nextLine();
            aStudent.setLastName(lastName);
            System.out.println("Enter ID number of the student:");
            String idNumber = sc.nextLine();
            aStudent.setIdNo(idNumber);
            System.out.println("Enter Email of the student:");
            String email = sc.nextLine();
            aStudent.setEmail(email);

            System.out.println("Enter the courses that the student takes");
            int count = 1;
            String anyOtherCourse = "";
            do {
                Course aCourse = new Course();
                System.out.println("Enter course " + count + ".");
                String courseName = sc.nextLine();
                aCourse.setCourseName(courseName);
                System.out.println("Enter course ID:");
                String courseId = sc.nextLine();
                aCourse.setCourseId(courseId);
                cour.add(aCourse);
                System.out.println("Any other courses for this student(Yes/No)");
                anyOtherCourse = sc.nextLine();
                count++;
            } while (anyOtherCourse.equalsIgnoreCase("yes"));
            System.out.println("Any Other Students?(yes/no");
            anyOther = sc.nextLine();

            aStudent.setCoursesTaking(cour);
            students.add(aStudent);
        } while (anyOther.equalsIgnoreCase("yes"));


    }






    }



