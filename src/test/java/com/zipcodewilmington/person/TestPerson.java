package com.zipcodewilmington.person;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/12/18.
 */
public class TestPerson {
    @Test
    public void testDefaultConstructor() {
        // Given
        String expectedName = "";
        Integer expectedAge = Integer.MAX_VALUE;

        // When
        Person person = new Person();

        // Then
        String actualName = person.getName();
        Integer actualAge = person.getAge();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void testConstructorWithName() {
        // Given
        String expected = "Leon";

        // When
        Person person = new Person(expected);

        // Then
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAge() {
        // Given
        Integer expected = 5;

        // When
        Person person = new Person(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithLetter() {
        // Given
        char expected = 'a';

        // When
        Person person = new Person(expected);

        // Then
        char actual = person.getFavoriteLetter();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithNameAndAge() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";

        // When
        Person person = new Person(expectedName, expectedAge);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testConstructorWithNameAndAgeAndLetter() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";
        char expectedLetter = 'z';

        // When
        Person person = new Person(expectedName, expectedAge, expectedLetter);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();
        char actualLetter = person.getFavoriteLetter();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedLetter, actualLetter);
    }

    @Test
    public void testConstructorWithNameAndAgeAndLetterAndFoodAndJob() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";
        char expectedLetter = 'z';
        String expectedFood = "Lasagna";

        // When
        Person person = new Person(expectedName, expectedAge, expectedLetter, expectedFood);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();
        char actualLetter = person.getFavoriteLetter();
        String actualFood = person.getFood();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedLetter, actualLetter);
        Assert.assertEquals(expectedFood, actualFood);
    }

    @Test
    public void testConstructorWithNameAndAgeAndLetterAndFood() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";
        char expectedLetter = 'z';
        String expectedFood = "Lasagna";
        String expectedJob = "Software Developer";

        // When
        Person person = new Person(expectedName, expectedAge, expectedLetter, expectedFood, expectedJob);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();
        char actualLetter = person.getFavoriteLetter();
        String actualFood = person.getFood();
        String actualJob = person.getJob();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedLetter, actualLetter);
        Assert.assertEquals(expectedFood, actualFood);
        Assert.assertEquals(expectedJob, actualJob);
    }

    @Test
    public void testConstructorWithNameAndAgeAndLetterAndFoodAndEmploymentAndBirthday() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";
        char expectedLetter = 'z';
        String expectedFood = "Lasagna";
        String expectedJob = "Software Developer";
        boolean expectedEmployed = true;
        double expectedBirthday = 4.16;

        // When
        Person person = new Person(expectedName, expectedAge, expectedLetter, expectedFood, expectedJob, expectedEmployed, expectedBirthday);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();
        char actualLetter = person.getFavoriteLetter();
        String actualFood = person.getFood();
        String actualJob = person.getJob();
        boolean actualEmployed = person.getEmployed();
        double actualBirthday = person.getBirthday();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedLetter, actualLetter);
        Assert.assertEquals(expectedFood, actualFood);
        Assert.assertEquals(expectedJob, actualJob);
        Assert.assertEquals(expectedEmployed, actualEmployed);
        Assert.assertEquals(expectedBirthday, actualBirthday, 12);
    }

    @Test
    public void testSetName() {
        // Given
        Person person = new Person();
        String expected = "Leon";

        // When
        person.setName(expected);
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetAge() {
        // Given
        Person person = new Person();
        Integer expected = 5;

        // When
        person.setAge(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetHair() {
        // Given
        Person person = new Person();
        char expected = 'a';

        // When
        person.setFavoriteLetter(expected);

        // Then
        char actual = person.getFavoriteLetter();
        Assert.assertEquals(expected, actual);
    }
}
