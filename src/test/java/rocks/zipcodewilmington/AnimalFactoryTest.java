package rocks.zipcodewilmington;

import com.sun.jndi.toolkit.ctx.AtomicDirContext;
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
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`

    //Create Dog Test

    @Test
    public void createDogTest() {
        String expected = "orbit";

         Dog testDog = AnimalFactory.createDog(expected, new Date(0001));
         String actual = testDog.getName();

        Assert.assertEquals(expected,actual);

    }

    //Create Cat Test

    @Test
    public void createCatTest() {
        String expected = "Whiskers";

        Cat testCat = AnimalFactory.createCat(expected, new Date(1999));
        String actual = testCat.getName();

        Assert.assertEquals(expected,actual);

    }






}
