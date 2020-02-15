package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`


    //Add Cat Tests

    @Test
    public void addCatTest() {
        CatHouse catShop = new CatHouse();

        Date year2020 = new Date();
        Cat whiskers = AnimalFactory.createCat("Luna", year2020);
        catShop.add(whiskers);
        Cat ripley = AnimalFactory.createCat("Luna", year2020);
        catShop.add(ripley);

        int expected = 2;

        int actual = catShop.getNumberOfCats();

        Assert.assertEquals(expected,actual);
        CatHouse.clear();
    }

    @Test
    public void addCatTestFalse() {
        CatHouse catShop = new CatHouse();

        Date year2020 = new Date();
        Cat whiskers = AnimalFactory.createCat("Luna", year2020);
        catShop.add(whiskers);

        int expected = 5;

        int actual = catShop.getNumberOfCats();

        Assert.assertNotEquals(expected,actual);
        CatHouse.clear();
    }

    //Remove Cat By CatObj

    @Test
    public void removeCatTest(){
        Date year2020 = new Date();
        Cat whiskers = AnimalFactory.createCat("Ripley", year2020);
        CatHouse.add(whiskers);

        CatHouse.remove(whiskers);

        int expected = 0;
        int actual = CatHouse.getNumberOfCats();

        Assert.assertEquals(expected, actual);
        CatHouse.clear();
    }

    @Test
    public void removeCatTestFalse(){
        Date year2020 = new Date();
        Cat cat1 = AnimalFactory.createCat("Ripley", year2020);
        Cat cat2 = AnimalFactory.createCat("Luna", year2020);
        Cat cat3 = AnimalFactory.createCat("Ariel", year2020);
        CatHouse.add(cat1);
        CatHouse.add(cat2);
        CatHouse.add(cat3);
        CatHouse.remove(cat2);

        int expected = 3;
        int actual = CatHouse.getNumberOfCats();

        Assert.assertNotEquals(expected, actual);
        CatHouse.clear();
    }

    //Remove Cat By ID

    @Test
    public void removeCatId() {
        Date year2020 = new Date();
        Cat cat1 = AnimalFactory.createCat("Ripley", year2020);
        Cat cat2 = AnimalFactory.createCat("Ripley", year2020);
        CatHouse.add(cat1);
        CatHouse.add(cat2);
        int yaDead = cat2.getId();
        CatHouse.remove(yaDead);
        int expected = 1;
        int actual = CatHouse.getNumberOfCats();
        Assert.assertEquals(expected,actual);
        CatHouse.clear();
    }

    //Get Cat by ID

    @Test
    public void getCatId() {
        Date year2020 = new Date();
        Cat cat1 = AnimalFactory.createCat("Ripley", year2020);
        Cat cat2 = AnimalFactory.createCat("Ripley", year2020);
        CatHouse.add(cat1);
        CatHouse.add(cat2);
        int yaDead = cat1.getId();
        Cat expected = cat1;
        Cat actual = CatHouse.getCatById(yaDead);
        Assert.assertEquals(expected,actual);
        CatHouse.clear();
    }

    @Test
    public void getCatIdFalse(){
        Date year2020 = new Date();
        Cat cat1 = AnimalFactory.createCat("Lunita", year2020);
        Cat cat2 = AnimalFactory.createCat("Appa", year2020);
        CatHouse.add(cat2);
        CatHouse.add(cat1);

        int yaDead = cat2.getId();
        Cat expected = cat1;
        Cat actual = CatHouse.getCatById(yaDead);

        Assert.assertNotEquals(expected, actual);
        CatHouse.clear();
    }

    //Get Number of Cats Tests

    @Test
    public void  getCatNumberTest(){
        Date year2020 = new Date();
        Cat cat1 = AnimalFactory.createCat("Appa", year2020);
        CatHouse.add(cat1);

        int expected = 1;
        int actual = CatHouse.getNumberOfCats();
        Assert.assertEquals(expected,actual);
        CatHouse.clear();
    }


}
