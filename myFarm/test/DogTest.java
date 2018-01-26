import com.thoughtworks.Dog;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DogTest {
    @Test
    public void testingCowEmittingSound(){
        Dog dog = new Dog("Bia", 8, 6);
        assertEquals("Au au", dog.greeting());
    }

    @Test
    public void testingSpeedCow(){
        Dog dog = new Dog("Bia",6, 8);
        assertEquals("Bia is running at 8km/h", dog.run());
    }

    @Test
    public void testingHoursForDistance(){
        Dog dog = new Dog ("Bia", 7,6);
        assertEquals(10, dog.run(60));
    }
}

