package com.example.oop_lab.lab1.Exercises;

public class Student {
    private int year;
    private String name;
    public Student(String name, int year) {
        this.year = year;
        this.name = name;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
}
