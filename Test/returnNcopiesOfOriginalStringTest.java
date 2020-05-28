import org.junit.Assert;
import org.junit.Test;

public class returnNcopiesOfOriginalStringTest {

    @Test
    public void stringTimes() {
        
        Assert.assertEquals("ZilchZilch", returnNcopiesOfOriginalString.stringTimes("Zilch", 2));
        Assert.assertEquals("ZebraZebraZebra", returnNcopiesOfOriginalString.stringTimes("Zebra", 3));
        Assert.assertEquals("ZooZooZoo", returnNcopiesOfOriginalString.stringTimes("Zoo", 3));
        Assert.assertEquals("ZzZzZzZzZzZzZzZzZzZz", returnNcopiesOfOriginalString.stringTimes("Zz", 10));
        Assert.assertEquals("HiHiHiHiHi", returnNcopiesOfOriginalString.stringTimes("Hi", 5));
    }
}

