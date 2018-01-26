import com.thoughtworks.Pig;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PigTest {
    @Test
    public void testingPigEmittingSound(){
        Pig pig = new Pig("Bia", 8, 6);
        assertEquals("Ronc", pig.greeting());
    }

    @Test
    public void testingSpeedCow(){
        Pig pig = new Pig("Bia",6, 8);
        assertEquals("Bia is running at 8km/h", pig.run());
    }

    @Test
    public void testingHoursForDistance(){
        Pig pig = new Pig ("Bia", 7,6);
        assertEquals(10, pig.run(60));
    }


}
