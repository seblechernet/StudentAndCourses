package com.seb;

import java.util.Scanner;

public class Menu {

    Scanner sc=new Scanner(System.in);
    Student newStudent=new Student();
    Teacher newTeacher=new Teacher();
    Course newCourse=new Course();
    public  void menu() {

        String exit="";
        do {
            System.out.println("Choose what you want to do \n1. Add a student\n2.Add a teacher\n3.Add a course\n4.List of courses\n5.List of Students\n6.List of Teachers\n7.Exit");
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

        newTeacher.listOfTeachers();
    }
    public void listOfStudents(){

        for (Student eachStudent:newStudent.getStudents()){
            System.out.println("ID number: " + eachStudent.getIdNumber() + "\nFirst Name: " + eachStudent.getFirstName()+ "\nLast Name: "+
                    eachStudent.getLastName());
        }
        System.out.println("Takes :");

        for (Course eachCourse:newStudent.getCoursesTaking()){
            System.out.print(eachCourse.getCourseName()+",");
        }

    }
    public void listOfCourses(){

    }
}

