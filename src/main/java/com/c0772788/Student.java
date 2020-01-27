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
    private int marks1;
    private int marks2;
    private int marks3;
    private int marks4;
    private int marks5;
    private float totalMarks;
    private float percentage;
    private String result;
    private LocalDate localDate = LocalDate.of(1993,02,27);
    private LocalDate today = LocalDate.now();

    public Student()
    {

    }

    public Student(int studentId, String firstName, String lastName, LocalDate birthDate, Gender gender, int marks1, int marks2, int marks3, int marks4, int marks5) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.gender = gender;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
        this.marks4 = marks4;
        this.marks5 = marks5;
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

    public int getMarks1() {
        return marks1;
    }

    public void setMarks1(int marks1) {
        this.marks1 = marks1;
    }

    public int getMarks2() {
        return marks2;
    }

    public void setMarks2(int marks2) {
        this.marks2 = marks2;
    }

    public int getMarks3() {
        return marks3;
    }

    public void setMarks3(int marks3) {
        this.marks3 = marks3;
    }

    public int getMarks4() {
        return marks4;
    }

    public void setMarks4(int marks4) {
        this.marks4 = marks4;
    }

    public int getMarks5() {
        return marks5;
    }

    public void setMarks5(int marks5) {
        this.marks5 = marks5;
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
        int age = Period.between(localDate, today).getYears();
        return age;
        //LocalDate today = LocalDate.now();
        //age = today.getYear() - birthDate.getYear();
        //return age;
    }

}
