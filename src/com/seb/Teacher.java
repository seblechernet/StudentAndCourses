package com.seb;

import java.util.ArrayList;

public class Teacher extends Person {
    private ArrayList<Course> coursesTeaching = new ArrayList<>();
    private  ArrayList<Teacher> teachers=new ArrayList<>();


    public void add(){
        String anyother="";
    do {
        Teacher aTeacher = new Teacher();
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
        teachers.add(aTeacher);
        aTeacher.teaches();
        System.out.println("Do you have any other teachers?(yes/no)");
        anyother=sc.nextLine();
    }while(anyother.equalsIgnoreCase("yes"));
    }
    public ArrayList<Course> teaches() {
        System.out.println("Enter the courses that the teacher teaches");
        int count = 1;
        String anyOther = "";
        do {
            Course aCourse = new Course();
            System.out.println("Enter course " + count + ".");
            String courseName = sc.nextLine();
            aCourse.setCourseName(courseName);
            System.out.println("Enter course ID:");
            String courseId = sc.nextLine();
            aCourse.setCourseId(courseId);
            coursesTeaching.add(aCourse);
            System.out.println("Any other courses (Yes/No)");
            anyOther = sc.nextLine();
            count++;
        } while (anyOther.equalsIgnoreCase("yes"));

        return coursesTeaching;
    }
    public void listOfTeachers(){
        System.out.println("Teachers:");
        for (Teacher eachTeacher:teachers){
            System.out.println("ID number: " + eachTeacher.getIdNumber() + "\nFirst Name: " + eachTeacher.getFirstName()+ "\nLast Name: "+
                                 eachTeacher.getLastName());
        }
        System.out.print("Teaches");
        for (Course eachCourse:teaches()){
            System.out.print(eachCourse.getCourseName());
        }


    }
}