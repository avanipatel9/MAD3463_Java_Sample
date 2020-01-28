package com.c0772788;

import java.time.LocalDate;
import java.util.Date;

public class StudentClassMain
{
    public static void main(String[] args)
    {
        Student s1;

        LocalDate s1BirthDate = LocalDate.of(1993,02,27);
        s1 = new Student(1, "Avani", "Patel", s1BirthDate, Gender.Female, new int[]{90,80,70,85,95});
        //s1.setData(1, "Avani", "Patel", s1BirthDate, Gender.Female, 80);

        s1.calculateTotalMarks();
        s1.calculatePercentage();
        s1.calculateResult();
        s1.printData();
    }
}
