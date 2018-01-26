import com.thoughtworks.Chicken;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChickenTest {
    @Test
    public void testingCowEmittingSound(){
        Chicken chicken = new Chicken("Bia", 8, 6);
        assertEquals("Cocoricó", chicken.greeting());
    }

    @Test
    public void testingSpeedCow(){
        Chicken chicken = new Chicken("Bia",6, 8);
        assertEquals("Bia is running at 8km/h",chicken.run());
    }

    @Test
    public void testingHoursForDistance(){
        Chicken chicken = new Chicken ("Bia", 7,6);
        assertEquals(10, chicken.run(60));
    }
}