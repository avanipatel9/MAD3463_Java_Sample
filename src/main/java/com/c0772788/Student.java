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
    private int studentId;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private Gender gender;
    /*private int marks1;
    private int marks2;
    private int marks3;
    private int marks4;
    private int marks5; */
    private int marks[];
    private float totalMarks;
    private float percentage;
    private String result;
    private LocalDate localDate = LocalDate.of(1993,02,27);
    private LocalDate today = LocalDate.now();

    public Student(int studentId, String firstName, String lastName, LocalDate birthDate, Gender gender, int[] marks) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.gender = gender;
        this.marks = marks;
    }

    public int getStudentId() {
        return studentId;
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

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }


    /*public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }*/

    public void printData()
    {
        System.out.println("Student ID : " + studentId);
        System.out.println("Student First Name : " + firstName);
        System.out.println("Student Last Name :" + lastName);
        System.out.println("Student Birth Date : " + birthDate);
        System.out.println("Student Age : " + getAge());
        System.out.println("Student Gender : " + gender);
        for(int i=0;i<marks.length;i++)
        {
            System.out.println("Subject " +(i+1) + " : " + marks[i]);
        }


        System.out.println("Student Total Marks is " + totalMarks);
        System.out.println("Percentage is " + percentage);
        System.out.println("Result is " + result);
    }

   public int  getAge()
    {
        int age = Period.between(localDate, today).getYears();
        return age;
        //LocalDate today = LocalDate.now();
        //age = today.getYear() - birthDate.getYear();
        //return age;
    }



    public void calculateTotalMarks()
    {
        float total = 0.0f;
        for(float mark : marks)
        {
            total = total + mark;
        }
        this.totalMarks = total;
    }

    public void calculatePercentage()
    {
        this.percentage = this.totalMarks / 5.0f;
    }

    public void calculateResult()
    {
        this.result = this.percentage >=50.0 ? "PASS" : "FAIL";
    }

}
