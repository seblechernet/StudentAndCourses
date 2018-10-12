package com.seb;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class Reception {

    Scanner sc=new Scanner(System.in);
    Student newStudent=new Student();
    Teacher newTeacher=new Teacher();
    Course newCourse=new Course();

    public  void menu() {
//Menu for what tasks to perform
        String exit="";
        do {
            System.out.println("\nChoose what you want to do \n1. Add a student\n2.Add a teacher\n3.Add a course\n4.List of courses\n5.List of Students\n6.List of Teachers\n7.Exit");
            String choice = sc.nextLine();
            switch (choice) {
                case "1": {
                    addaStudent();
                    break;
                }
                case "2": {
                    addaTeacher();
                    break;
                }
                case "3": {
                    addaCourse();
                    break;
                }
                case "4": {
                    listOfCourses();
                    break;
                }
                case "5": {
                    listOfStudents();
                    break;
                }
                case "6": {
                    listOfTeachers();
                    break;
                }
                case "7": {
                    exit="yes";
                    break;
                }
            }

        }while(!exit.equalsIgnoreCase("yes"));
    }
    public  void addaStudent(){
        newStudent.add();

    }
    public void addaTeacher(){

        newTeacher.add();

    }
    public void addaCourse(){
        newCourse.add();
    }

    public void listOfTeachers(){
// Print each of teachers and each teacher may have many courses under it
        System.out.println("***Teachers***");
        for (Teacher eachTeacher:newTeacher.getTeachers()){
            System.out.println("\nID number: " + eachTeacher.getIdNumber() + "\nFirst Name: " + eachTeacher.getFirstName()+ "\nLast Name: "+
                    eachTeacher.getLastName()+"\nEmail: "+eachTeacher.getEmail());
            System.out.print("Teaches :");
            for (Course eachCourse:eachTeacher.getCoursesTeaching()){
                System.out.print(eachCourse.getCourseName()+",");
            }
        }
    }
// Print each of Students and each student may have many courses under it
    public void listOfStudents(){
        System.out.println("***Students***");
        for (Student eachStudent:newStudent.getStudents()){
            System.out.println("\nID number: " + eachStudent.getIdNumber() + "\nFirst Name: " + eachStudent.getFirstName()+ "\nLast Name: "+
                    eachStudent.getLastName()+"\nEmail: "+ eachStudent.getEmail());
            System.out.print("Takes :");
            for (Course eachCourse:eachStudent.getCoursesTaking()){
                System.out.print(eachCourse.getCourseName()+",");
            }
        }


    }
// Print list of courses
    public void listOfCourses(){

        System.out.println("***Courses***");
        for(Course eachCourse:newCourse.getCourses()){
            System.out.println("Course Name:" + eachCourse.getCourseName()+"\nCourse ID:" + eachCourse.getCourseId());

        }
    }
}

