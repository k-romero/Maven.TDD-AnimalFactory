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
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
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
        DogHouse.clear();
    }

    @Test
    public void testAddDog() {
        //Given
        String name = "Appa";
        Date deathDate = new Date();
        Dog animal = AnimalFactory.createDog(name, deathDate);
        int yaDead = animal.getId();
        Dog expected = animal;

        //When
        DogHouse.add(animal);


        //Then
        Dog actual = DogHouse.getDogById(yaDead);

        Assert.assertEquals(expected,actual);
        DogHouse.clear();
    }

    //Remove Dog Test

    @Test
    public void testRemoveDogID() {
        //Given
        String name = "Appa";
        Date deathDate = new Date();
        Dog animal = AnimalFactory.createDog(name, deathDate);
        DogHouse.add(animal);
        int yaDead = animal.getId();
        int expected = 0;

        //When
        DogHouse.remove(yaDead);

        //Then
        int actual = DogHouse.getNumberOfDogs();
        Assert.assertEquals(expected,actual);
        DogHouse.clear();
    }

    @Test
    public void testRemoveDogDog(){
        //Given
        String name = "Appa";
        Date deathDate = new Date();
        Dog appa = AnimalFactory.createDog(name,deathDate);
        DogHouse.add(appa);
        int appaID = appa.getId();
        Dog expected = appa;

        //When
        DogHouse.remove(appa);

        //Then
        Dog actual = DogHouse.getDogById(appaID);
        Assert.assertNotEquals(expected,actual);
        DogHouse.clear();
    }

    @Test
    public void testGetDogId(){
        //Given
        String name = "Appa";
        Date deathDate = new Date();
        Dog appa = AnimalFactory.createDog(name,deathDate);
        DogHouse.add(appa);
        int test = appa.getId();

        //When
        Dog actual = DogHouse.getDogById(test);

        //Then
        int expected = test;
        int actual1 = actual.getId();
        Assert.assertEquals(expected, actual1);
        DogHouse.clear();
    }

    @Test
    public void testGetNumberOfDogsTest(){
        //Given
        String name = "Appa";
        Date deathDate = new Date();
        Dog appa = AnimalFactory.createDog(name,deathDate);
        Dog appa2 = AnimalFactory.createDog(name,deathDate);
        Dog appa3 = AnimalFactory.createDog(name,deathDate);
        DogHouse.add(appa);
        DogHouse.add(appa2);
        DogHouse.add(appa3);
        int expected = 3;

        //When
        int actual = DogHouse.getNumberOfDogs();

        //Then
        Assert.assertEquals(expected,actual);
        DogHouse.clear();
    }

}
