package rocks.zipcodewilmington;

import com.sun.jndi.toolkit.ctx.AtomicDirContext;
import org.junit.Assert;
import org.junit.Test;
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

         Dog testDog = AnimalFactory.createDog(expected, new Date(02343));
         String actual = testDog.getName();

        Assert.assertEquals(expected,actual);

    }





    //Create Cat Test
}
