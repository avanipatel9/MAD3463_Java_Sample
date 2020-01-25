package com.c0772788;

import java.time.LocalDate;
import java.util.Date;

public class StudentClassMain
{
    public static void main(String[] args)
    {
        Student s1 = new Student();
        LocalDate s1BirthDate = LocalDate.of(1993,02,27);
        s1.setData(1, "Avani", "Patel", s1BirthDate, Gender.Female, 80);
        s1.printData();
    }
}
