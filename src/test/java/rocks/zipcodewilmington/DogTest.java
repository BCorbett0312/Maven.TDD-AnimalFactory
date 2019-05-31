package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`

    @Test
    public void newDogTest() {
        String nameIGaveDog = "Clever Dog Name";
        Date birfDate = new Date(1, 1, 1);
        Integer Id = null;

        Dog dog = new Dog(nameIGaveDog, birfDate, Id);

        String actualName = dog.getName();
        Date actualBirfDate = dog.getBirthDate();
        Integer actualId = dog.getId();

        Assert.assertEquals(nameIGaveDog, actualName);
        Assert.assertEquals(birfDate, actualBirfDate);
        Assert.assertEquals(Id, actualId);
    }



    // TODO - Create tests for `speak`

    @Test
    public void testSpeak(){
        Dog dog = new Dog (null, null, null);

        String expected = "bark!";

        Assert.assertEquals(expected, dog.speak());


    }



    // TODO - Create tests for `setBirthDate(Date birthDate)`

    @Test
    public void setBirthDateTest() {

        Dog dog = new Dog(null, null, null);
        Date givenBirfDate = new Date();

        dog.setBirthDate(givenBirfDate);

        Date expected = givenBirfDate;

        Assert.assertEquals(expected, dog.getBirthDate());

    }








    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void eatFoodTest(){
        Dog dog = new Dog(null, null, null);
        Food newFood = new Food();
        dog.eat(newFood);

        Integer expected = 1;

        Assert.assertEquals(expected, dog.getNumberOfMealsEaten());

    }








    // TODO - Create tests for `Integer getId()`
    @Test
    public void getIdTest() {

        Integer givenId = 6000;
        Dog dog = new Dog(null, null, givenId);

        Integer expected = givenId;

        Assert.assertEquals(givenId, dog.getId());
    }







    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void inheritanceAnimalTest() {

        Dog dog = new Dog(null, null, null);


        Assert.assertEquals(true, dog instanceof Animal);
    }










    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void inheritanceMammalTest(){
        Dog dog = new Dog(null, null, null);

        Assert.assertEquals(true, dog instanceof Mammal);
    }










    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }




}
