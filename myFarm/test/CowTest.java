import com.thoughtworks.Cow;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CowTest {
    @Test
    public void testingCowEmittingSound(){
        Cow cow = new Cow("Bia", 8, 6);
        assertEquals("Mom", cow.greeting());
    }

    @Test
    public void testingSpeedCow(){
        Cow cow = new Cow("Bia",6, 8);
        assertEquals("Bia is running at 8km/h", cow.run());
    }

    @Test
    public void testingHoursForDistance(){
        Cow cow = new Cow ("Bia", 7,6);
        assertEquals(10, cow.run(60));
    }
}