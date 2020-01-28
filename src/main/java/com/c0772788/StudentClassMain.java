package com.c0772788;

import java.time.LocalDate;
import java.util.Date;

public class StudentClassMain
{
    public static void main(String[] args)
    {
        Student[] listOfStudents = new Student[2];

        Student s1;
        LocalDate s1BirthDate = LocalDate.of(1993,02,27);
        s1 = new Student(1, "Avani", "Patel", s1BirthDate, Gender.Female, new int[]{90,80,70,85,95});
        listOfStudents[0] = s1;

        Student s2;
        LocalDate s2BirthDate = LocalDate.of(1995,11,27);
        s2 = new Student(2, "Parth", "Patel", s2BirthDate, Gender.Male, new int[]{20,40,70,55,35});
        listOfStudents[1] = s2;

        for (Student s : listOfStudents)
        {
            s.calculateTotalMarks();
            s.calculatePercentage();
            s.calculateResult();
            s.printData();
        }

        Arithmetic arithmetic = new Arithmetic();
        System.out.println(arithmetic.add(10,2));
        System.out.println(arithmetic.add(10,5.0));
        System.out.println(arithmetic.add(10,2.0f));
        System.out.println(arithmetic.add("Hello",2));
        System.out.println(arithmetic.add("Hello",2,2.0f));



    }
}
