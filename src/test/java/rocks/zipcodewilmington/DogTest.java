package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
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

    //Names Tests

    @Test
    public void  setNameTest2() {
        Dog testDog = new Dog("Ripley", null, null);
        String expectedName = "Skip";
        testDog.setName(expectedName);
        String actual = testDog.getName();
        Assert.assertEquals(expectedName,actual);
    }

    @Test
    public void  setNameTestFalse() {
        Dog testDog = new Dog("Ripley", null, null);
        String expectedName = "Skip";
        testDog.setName("Buck");
        String actual = testDog.getName();
        Assert.assertNotEquals(expectedName,actual);
    }

    //BirthDate Tests

    @Test
    public void  setBirthDateTest() {
        Date giveBirthdate = new Date(02142020);
        Dog testDog = new Dog("Ripley", giveBirthdate, null);
        Date expected = new Date(02012020);
        testDog.setBirthDate(expected);
        Date actual = testDog.getBirthDate();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void  setBirthDateTestFalse() {
        Date giveBirthdate = new Date(02142020);
        Dog testDog = new Dog("Ripley", giveBirthdate, null);
        Date expected = new Date(02012020);
        testDog.setBirthDate(giveBirthdate);
        Date actual = testDog.getBirthDate();
        Assert.assertNotEquals(expected,actual);
    }
}
