package com.workintech.model;

public class Person {
    String firstName;
    String lastName;
    int age;
    String[] pet;
    boolean isMarried;

    public Person(String firstName, String lastName, int age){
        this.firstName= firstName;
        this.lastName= lastName;
        this.age= age;
    }

    public Person(String firstName, String lastName, int age, String[] pet, boolean isMarried){
        this(firstName, lastName,age);
        this.pet= pet;
        this.isMarried= isMarried;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean isTeen(){
        return age >= 13 && age <= 19;
    }
}
