package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`

    @Test
    public void addCatTest(){
        CatHouse.clear();
        Cat cat1 = AnimalFactory.createCat(null, null);

        System.out.println("The number of cats in house is " + CatHouse.getNumberOfCats());

        CatHouse.add(cat1);

        System.out.println("The number of cats in house is " + CatHouse.getNumberOfCats() + " after being added");

        Integer expected = 1;

        Assert.assertEquals(expected, CatHouse.getNumberOfCats());


    }




    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void removeByIdTest(){
        CatHouse.clear();
        Cat cat1 = AnimalFactory.createCat(null, null);

        CatHouse.add(cat1);


        Cat cat2 = AnimalFactory.createCat(null, null);

        CatHouse.add(cat2);

        CatHouse.remove(1);


        Integer expected = 1;

        Assert.assertEquals(expected, CatHouse.getNumberOfCats());



    }



    // TODO - Create tests for `void remove(Cat cat)`
    @Test
    public void removeByNameTest(){
        CatHouse.clear();
        Cat cat1 = AnimalFactory.createCat(null, null);

        CatHouse.add(cat1);

        Cat cat2 = AnimalFactory.createCat(null, null);

        CatHouse.add(cat2);


        System.out.println(CatHouse.getNumberOfCats());

        CatHouse.remove(cat1);

        Integer expected = 1;

        Assert.assertEquals(expected, CatHouse.getNumberOfCats());


    }

    // TODO - Create tests for `Cat getCatById(Integer id)`
    @Test
    public void getCatByIDTest(){




        CatHouse.clear();
        Cat cat1 = AnimalFactory.createCat(null, null);

        CatHouse.add(cat1);

        Assert.assertEquals(cat1, CatHouse.getCatById(0));

    }





    // TODO - Create tests for `Integer getNumberOfCats()`


    @Test
    public void getNumberOfCatsTest(){
        Cat cat1 = new Cat(null, null, null);
        CatHouse.clear();

        CatHouse.add(cat1);

        Integer expected = 1;

        Assert.assertEquals(expected , CatHouse.getNumberOfCats());


    }
}
