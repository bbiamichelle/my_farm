import com.thoughtworks.Cow;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CowTest {
    @Test
    public void testingCowEmittingSound(){
        Cow cow = new Cow();
        assertEquals("Mooom", cow.greeting());
    }

    @Test
    public void testingSpeedCow(){
        Cow cow = new Cow();
        assertEquals("Speed is 30km/h", cow.run());
    }
}
