package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    @Test
    public void addTestDogDog(){
        Dog dog = new Dog(null, null, null);
        DogHouse.clear();
        DogHouse.add(dog);

        Integer expected = 1;
        Assert.assertEquals(expected, DogHouse.getNumberOfDogs());
        DogHouse.clear();

    }


    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void removeIdTest(){
        DogHouse.clear();

        Dog dog1 = AnimalFactory.createDog(null, null);
        DogHouse.add(dog1);

        Dog dog2 = AnimalFactory.createDog(null, null);


        DogHouse.add(dog2);

        System.out.println(DogHouse.getNumberOfDogs());

        DogHouse.remove(1);


        System.out.println(dog2.getId());
        System.out.println(dog1.getId());

        Integer expected = 1;

        System.out.println(DogHouse.getNumberOfDogs());

        Assert.assertEquals(expected, DogHouse.getNumberOfDogs());

        DogHouse.clear();


    }





    // TODO - Create tests for `void remove(Dog dog)`
    @Test
    public void testRemoveByName(){
        DogHouse.clear();

        Dog dog1 = AnimalFactory.createDog(null, null);

        DogHouse.add(dog1);
        System.out.println(DogHouse.getNumberOfDogs());

        DogHouse.remove(dog1);

        Integer expected = 0;

        Assert.assertEquals(expected, DogHouse.getNumberOfDogs());

    }



    // TODO - Create tests for `Dog getDogById(Integer id)`
    @Test
    public void getDogByIDTest(){
        DogHouse.clear();

        Dog dog1 = AnimalFactory.createDog(null, null);
        DogHouse.add(dog1);


        DogHouse.getDogById(0);

        System.out.println(DogHouse.getDogById(0));


        Assert.assertEquals(dog1,DogHouse.getDogById(0));
    }



    // TODO - Create tests for `Integer getNumberOfDogs()`



    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();

        Integer expected = 1;

        Assert.assertEquals(expected, DogHouse.getNumberOfDogs());
    }
}
