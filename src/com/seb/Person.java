package com.seb;

import java.util.Scanner;

public class Person {
    static Scanner sc=new Scanner(System.in);
    private String firstName;
    private String lastName;
    private String idNumber;
    private String email;

    public Person(String firstName, String lastName, String idNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber= idNumber;
        this.email = email;
    }

    public Person() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNo(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
