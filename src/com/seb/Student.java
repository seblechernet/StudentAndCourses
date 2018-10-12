package com.seb;

import java.util.ArrayList;
//Student Class Extends person
public class Student extends Person {
  private  ArrayList<Course> coursesTaking = new ArrayList<Course>();
  private ArrayList<Student> students = new ArrayList<Student>();


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

//Create a method that adds students each time called
    public void add() {

        String anyOther = "";
        do {
//Create a new student object and
            Student aStudent = new Student();
// A new Arraylist of course to use it for each student that is created
            ArrayList<Course> cour=new ArrayList<>();
// prompt the user for student name , student id and student email and use the input to set each parameter

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
//Prompt the user for the courses and use the input to set the course name and course id
                Course aCourse = new Course();
                System.out.println("Enter course " + count + ".");
                String courseName = sc.nextLine();
                aCourse.setCourseName(courseName);
                System.out.println("Enter course ID:");
                String courseId = sc.nextLine();
                aCourse.setCourseId(courseId);
// Add each course to the Arraylist of courses for the student
                cour.add(aCourse);
//                aCourse.assignaStudent(aStudent);
                System.out.println("Any other courses for " + aStudent.getFirstName()+ " " +aStudent.getLastName()+" (Yes/No)");
                anyOtherCourse = sc.nextLine();
                count++;

            } while (anyOtherCourse.equalsIgnoreCase("yes"));
            System.out.println("Any Other Students?(yes/no");
            anyOther = sc.nextLine();
//Use the arraylist of the courses to set the list courses taken by the student
            aStudent.setCoursesTaking(cour);
// Add each student to the list of studnts to use it later for listing students
            students.add(aStudent);



        } while (anyOther.equalsIgnoreCase("yes"));




    }






    }



