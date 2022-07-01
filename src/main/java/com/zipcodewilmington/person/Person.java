package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;
    private char favoriteLetter;
    private String favoriteFood;
    private String job;
    private boolean employed;
    private double birthday;


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

    public Person(char favoriteLetter) {
        this.favoriteLetter = favoriteLetter;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, char favoriteLetter) {
        this.name = name;
        this.age = age;
        this.favoriteLetter = favoriteLetter;
    }

    public Person(String name, int age, char favoriteLetter, String favoriteFood) {
        this.name = name;
        this.age = age;
        this.favoriteLetter = favoriteLetter;
        this.favoriteFood = favoriteFood;
    }

    public Person(String name, int age, char favoriteLetter, String favoriteFood, String job) {
        this.name = name;
        this.age = age;
        this.favoriteLetter = favoriteLetter;
        this.favoriteFood = favoriteFood;
        this.job = job;
    }

    public Person(String name, int age, char favoriteLetter, String favoriteFood, String job, boolean employed, double birthday) {
        this.name = name;
        this.age = age;
        this.favoriteLetter = favoriteLetter;
        this.favoriteFood = favoriteFood;
        this.job = job;
        this.employed = employed;
        this.birthday = birthday;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFavoriteLetter(char favoriteLetter) {
        this.favoriteLetter = favoriteLetter;
    }

    public void setEmployed(boolean employed) {
        this.employed = employed;
    }

    public void setBirthday(double birthday) {
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public String getFood() {
        return favoriteFood;
    }

    public String getJob() {
        return job;
    }

    public Integer getAge() {
        return age;
    }

    public char getFavoriteLetter() {
        return favoriteLetter;
    }

    public boolean getEmployed() {
        return employed;
    }

    public double getBirthday() {
        return birthday;
    }
}
