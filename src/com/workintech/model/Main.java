package com.workintech.model;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       Person person = new Person("John", "Doe", 20 );
       person.pet = new String[3];
       person.pet[0]= "dog";
       person.pet[1]= "cat";
       person.pet[2]= "bird";


        System.out.println("FirstName: " + person.getFirstName());
        System.out.println("LastName: " + person.getLastName());
        System.out.println("Age: " + person.getAge());
        System.out.println(Arrays.toString(person.pet));

        System.out.println("--WALL--");
        Wall wall = new Wall(5,4);
        System.out.println("area= " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());
    }
}