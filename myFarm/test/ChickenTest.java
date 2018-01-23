import com.thoughtworks.Chicken;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChickenTest {

    @Test
    public void testingChickenEmittingSound(){
        Chicken chicken = new Chicken();
        assertEquals("Cocoricó", chicken.greeting());

    }

    @Test
    public void testingSpeedChicken(){
        Chicken chicken = new Chicken();
        assertEquals("Speed Chicken is 5km/h", chicken.run());
    }
}
