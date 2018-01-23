import com.thoughtworks.Pig;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PigTest {
    @Test
    public void testingPigEmittingSound(){
        Pig pig = new Pig();
        assertEquals("Ronc", pig.greeting());
    }

    @Test
    public void testingSpeedPig(){
        Pig pig = new Pig();
        assertEquals("Pig speed is 10km/h", pig.run());
    }
}
