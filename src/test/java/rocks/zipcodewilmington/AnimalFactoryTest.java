package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;



/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    @Test
    public void createDogTest(){
        String givenName = "My Dog1";
        Date givenBirthDay = new Date(1,1,1);

        //AnimalFactory dog1 = new AnimalFactory(givenName, givenBirthDay);

        Dog dog1 = AnimalFactory.createDog(givenName, givenBirthDay);

        String retrievedName = dog1.getName();
        Date actualDate = dog1. getBirthDate();



        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDay, actualDate);



    }






    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`


    @Test
    public void createCatTest() {
        String givenName = "my cat 1";
        Date givenDate = new Date(1, 1,1);

        Cat cat1 = AnimalFactory.createCat(givenName, givenDate);

        String retrievedName = cat1.getName();
        Date retrievedDate = cat1.getBirthDate();

        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenDate, retrievedDate);
    }

}