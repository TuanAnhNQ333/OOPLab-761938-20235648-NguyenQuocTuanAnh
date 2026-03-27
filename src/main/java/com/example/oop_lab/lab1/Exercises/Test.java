package com.example.oop_lab.lab1.Exercises;

public class Test {
    public static void change(Student std){
        std.setYear(2000);
    }
    public static void main(String[] args) {
        Student std = new Student("Nam", 1990);
        System.out.println(std.getYear());
        change(std);
        System.out.println(std.getYear());
    }
}