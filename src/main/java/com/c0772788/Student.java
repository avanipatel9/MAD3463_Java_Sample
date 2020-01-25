package com.c0772788;

import jdk.nashorn.internal.parser.JSONParser;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

enum Gender
{
    Male,
    Female,
    Others
}
public class Student
{
    int studentId;
    String firstName;
    String lastName;
    LocalDate birthDate;
    Gender gender;
    float totalMarks;
    LocalDate localDate = LocalDate.of(1993,02,27);
    LocalDate today = LocalDate.now();

    public void setData(int studentId, String firstName, String lastName, LocalDate birthDate, Gender gender, float totalMarks)
    {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.gender = gender;
        this.totalMarks = totalMarks;
    }

    public void printData()
    {
        System.out.println("Student ID is " + studentId);
        System.out.println("Student First Name is " + firstName);
        System.out.println("Student Last Name is " + lastName);
        System.out.println("Student Birth Date is " + birthDate);
        System.out.println("Student Age is " + getAge());
        System.out.println("Student Gender is " + gender);
        System.out.println("Student Total Marks is " + totalMarks);
    }

   public int  getAge()
    {
        int p = Period.between(localDate, today).getYears();
        return p;
    }
}
