package com.c0772788;

public class Arithmetic
{
    public int add(int a, int b)
    {
       return a+b;
    }

    public float add(float a, float b)
    {
        return a+b;
    }

    public String add(String a, String b)
    {
        return a+b;
    }

    public String add(String a, int b)
    {
        return a+b;
    }

    public String add(int a, String b)
    {
        return a+b;
    }

    public int add(int a, int b, int c)
    {
        return a + b + c;

    }

    public float add(int a, int b, float c)
    {
        return (float)a+b +c;
    }

    public float add(float a, int b)
    {
        return a+b;
    }

    public float add(float a, int b, int c) {
        return a +(float)add(b,c);
    }

    public String add(String a, int b, float c)
    {
        return a + add(0,b, c);
    }

    public double add(int a, double b)
    {
        return a + b;
    }

    public float add(int a, float b)
    {
        return a + b;
    }


}
