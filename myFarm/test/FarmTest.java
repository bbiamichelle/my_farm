import com.thoughtworks.*;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FarmTest {

//    @Test
//    public void testingAverageAgeCalcutationForType(){
//        Pig pig = new Pig("bia", 8,9);
//        ArrayList<Pig> listPig = new ArrayList();
//        listPig.add(pig);
//        Farm farm = new Farm(listPig);
//        assertEquals(8, farm.ageAverageForType());
//    }
//
//    @Test
//    public void testingAverageAgeForMultiplePigs(){
//        Pig pig1 = new Pig("Bia", 8,9);
//        Pig pig2 = new Pig("Nina", 6,7);
//        ArrayList<Pig> listPig = new ArrayList<Pig>();
//        listPig.add(pig1);
//        listPig.add(pig2);
//        Farm farm = new Farm(listPig);
//        assertEquals(7, farm.ageAverageForType());
//    }

    @Test
    public void testingAverageAgeForMultiplesDogs(){
        Dog dog1 = new Dog("Bia", 8,9);
        Dog dog2 = new Dog("Bruna",10,8);
        ArrayList<Dog> listDog = new ArrayList<Dog>();
        ArrayList<Pig> listPig = new ArrayList<Pig>();
        ArrayList<Chicken> listChicken = new ArrayList<Chicken>();
        ArrayList<Cow> listCow = new ArrayList<Cow>();
        listDog.add(dog1);
        listDog.add(dog2);
        Farm farm = new Farm(listPig,listDog,listChicken,listCow);
        assertEquals(9,farm.ageAverageForType());
    }
}
