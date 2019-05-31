package rocks.zipcodewilmington;


import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.*;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void inheritanceAnimalTest() {
        Cat cat = new Cat(null, null, null);

        Assert.assertEquals(true, cat instanceof Animal);
    }



    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`

    @Test
    public void inheritanceMammalTest(){
        Cat cat = new Cat(null, null, null);
        Assert.assertEquals(true, cat instanceof Mammal);
    }



    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void speakTest() {
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        Cat cat = new Cat(givenName, givenBirthDate, givenId);



        String expected = "meow!";
        String actual = cat.speak();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void setNameTest() {
        String givenName = "";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        Cat cat = new Cat(givenName, givenBirthDate, givenId);
        cat.setName("Testy McTesterFace");

        String expected = "Testy McTesterFace";

        String actual = cat.getName();

        Assert.assertEquals(expected, actual);
    }


    @Test
    public void setBirthDateTest() {
        String givenName = "Testy McTesterFace";
        Date givenBirthDate = null;
        Integer givenId = 0;

        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        cat.setBirthDate(new Date(66, 0, 11));

        Date expected = new Date(66, 0, 11);


        Date actual = cat.getBirthDate();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void eatTest() {
        String givenName = "Testy McTesterFace";
        Date givenBirthDate = new Date();
        Integer givenId = 0;


        Cat cat = new Cat(givenName, givenBirthDate, givenId);
        Food myFood = new Food();
        cat.eat(myFood);

        Integer expected = 1;
        Integer actual = cat.getNumberOfMealsEaten();

        Assert.assertEquals(expected, actual);


    }

    @Test
    public void getIdTest(){
        String givenName = "Testy McCat";
        Date givenBirthDate = new Date();
        Integer givenId = 9001;

        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        Integer expected = givenId;
        Integer actual = cat.getId();

        Assert.assertEquals(expected, actual);
    }

}
