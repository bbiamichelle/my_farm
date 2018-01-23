import com.thoughtworks.Dog;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DogTest {
    @Test
    public void testingDogEmittingSound (){
        Dog dog = new Dog ();
        assertEquals("ruff", dog.greeting());
    }

    @Test
    public void testingSpeedDog (){
        Dog dog = new Dog ();
        assertEquals("Dog run 40km/h", dog.run());
    }

}


