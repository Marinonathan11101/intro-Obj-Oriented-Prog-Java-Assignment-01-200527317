package com.example.assignment01;

public class Test {
    public static void main(String[] args) {
        Student Nathan = new Student("nathan","marino",11101);
        Student Nicholas = new Student("Nicholas","Marino",22202);
        System.out.println(Nathan.toString());

        Nathan.activities("Videogames");
        Nathan.activities("Playing");
        Nicholas.activities("Football");
        Nicholas.activities("Running");
        System.out.println(Nicholas.toString());


        String total = Nathan.showactivities();
        System.out.println(total);
        System.out.println(Nicholas.showactivities());




    }
}