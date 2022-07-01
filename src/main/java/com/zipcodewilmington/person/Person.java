package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;
    private String hairColor;

    public Person() {
        this.age = Integer.MAX_VALUE;
        this.name = "";
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, String hairColor) {
        this.name = name;
        this.age = age;
        this.hairColor = hairColor;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
}
