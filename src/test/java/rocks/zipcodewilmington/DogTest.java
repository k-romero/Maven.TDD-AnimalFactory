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

    //Speak Tests

    @Test
    public  void speakTest() {
        Dog testDog = new Dog(null, null,null);
        String expected = "bark!";
        String actual = testDog.speak();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public  void speakTestFalse() {
        Dog testDog = new Dog(null, null,null);
        String expected = "woof!";
        String actual = testDog.speak();
        Assert.assertNotEquals(expected,actual);
    }

    //Eat Tests

    @Test
    public  void eatTest() {
        Dog testDog = new Dog(null, null,null);
        Food chow = new Food();
        testDog.eat(chow);
        int expected = 1;
        int actual = testDog.getNumberOfMealsEaten();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public  void eatTestFalse() {
        Dog testDog = new Dog(null, null,null);
        Food chow = new Food();
        testDog.eat(chow);
        testDog.eat(chow);
        testDog.eat(chow);
        int expected = 1;
        int actual = testDog.getNumberOfMealsEaten();
        Assert.assertNotEquals(expected,actual);
    }

    //ID Tests

    @Test
    public void idTest() {
        Dog testDog = new Dog(null, null,17);
        int expected = 17;
        int actual = testDog.getId();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void idTestFalse() {
        Dog testDog = new Dog(null, null,988);
        int expected = 17;
        int actual = testDog.getId();
        Assert.assertNotEquals(expected,actual);
    }

    //Inheritance Tests

    @Test
    public void inheritanceTest() {
        Dog testDog = new Dog(null, null,null);
        Assert.assertTrue(testDog instanceof Animal);
    }

    @Test
    public void inheritanceTest2() {
        Dog testDog = new Dog(null, null,null);
        Assert.assertTrue(testDog instanceof Mammal);
    }

}
