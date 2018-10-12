package com.seb;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;
import java.util.Scanner;

public class Course {
    private String courseId;
    private String courseName;
    private ArrayList<Course> courses = new ArrayList<>();


    public Course() {
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String idNumber) {
        this.courseId = idNumber;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    public void add() {
        String anyOther = "";
        do {
            Scanner sc = new Scanner(System.in);
            Course aCourse = new Course();
            System.out.println("Enter Course Name:");
            String courseName = sc.nextLine();
            aCourse.setCourseName(courseName);
            System.out.println("Enter Course ID:");
            String courseId = sc.nextLine();
            aCourse.setCourseId(courseId);
            courses.add(aCourse);
            System.out.println("Any other courses?");
            anyOther=sc.nextLine();
        } while (anyOther.equalsIgnoreCase("yes"));

    }
}

