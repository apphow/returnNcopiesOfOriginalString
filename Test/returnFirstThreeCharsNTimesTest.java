import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class returnFirstThreeCharsNTimesTest {

    @Test
    public void firstThree() {
        Assert.assertEquals("CarCarCar", returnFirstThreeCharsNTimes.firstThree("Caramel", 3));
    }

    @Test
    public void firstThree1() {
        Assert.assertEquals("", returnFirstThreeCharsNTimes.firstThree("Zebra", 0));
    }

    @Test
    public void firstThree2() {
        Assert.assertEquals("ZaZaZaZaZaZaZaZa", returnFirstThreeCharsNTimes.firstThree("Za", 8));
    }

    @Test
    public void firstThree3() {
        Assert.assertEquals("CapCap", returnFirstThreeCharsNTimes.firstThree("Capital", 2));
    }

    @Test
    public void firstThreeNotEqual() {
        Assert.assertNotEquals("z", returnFirstThreeCharsNTimes.firstThree("Xylophone", 8));
    }


}
