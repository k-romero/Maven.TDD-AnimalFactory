package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;

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
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


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

    // Name Tests

    @Test
    public void testSetName() {
        String giveNewName = "Luna";
        Date giveNewDate = new Date();
        Integer giveNewId = 0;

        Cat newCat = new Cat(giveNewName,giveNewDate,giveNewId);

        String setNewName = "Meghan";
        newCat.setName(setNewName);
        String retrieveNewName = newCat.getName();

        Assert.assertEquals(setNewName,retrieveNewName);

    }


    @Test
    public void testSetNameFalse() {
        String giveNewName = "Luna";
        Date giveNewDate = new Date();
        Integer giveNewId = 0;

        Cat newCat = new Cat(giveNewName,giveNewDate,giveNewId);

        String setNewName = "Meghan";
        newCat.setName(setNewName);
        String retrieveNewName = newCat.getName();

        Assert.assertNotEquals(giveNewName,retrieveNewName);

    }

    //Speak Tests

    @Test
    public void testSpeak() {
        String giveNewName = "Luna";
        Date giveNewDate = new Date();
        Integer giveNewId = 0;

        Cat newCat = new Cat(giveNewName,giveNewDate,giveNewId);
        String expected = "meow!";
        String actual = newCat.speak();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testSpeakFalse() {
        String giveNewName = "Luna";
        Date giveNewDate = new Date();
        Integer giveNewId = 0;

        Cat newCat = new Cat(giveNewName,giveNewDate,giveNewId);
        String expected = "woof!";
        String actual = newCat.speak();

        Assert.assertNotEquals(expected,actual);
    }

    //BirthDate Tests

    @Test
    public void testSetDate() {
        String giveNewName = "Luna";
        Date giveNewDate = new Date();
        Integer giveNewId = 0;

        Cat testCat = new Cat(giveNewName,giveNewDate,giveNewId);

        Date expected = new Date(02142020);
        testCat.setBirthDate(expected);
        Date actual = testCat.getBirthDate();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testSetDateFalse() {
        String giveNewName = "Luna";
        Date giveNewDate = new Date();
        Integer giveNewId = 0;

        Cat testCat = new Cat(giveNewName,giveNewDate,giveNewId);

        Date expected = new Date(02142020);
        testCat.setBirthDate(expected);
        Date actual = testCat.getBirthDate();

        Assert.assertNotEquals(giveNewDate,actual);
    }






}
