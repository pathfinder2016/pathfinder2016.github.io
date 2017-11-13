package week_001_radix;

import junit.framework.Assert;
import org.junit.Test;

public class SuperRadixManagerTest {
    @Test
    public void transform_any_radix_to_any_radix() throws Exception {
        SuperRadixManager superRadixManager = new SuperRadixManager();

        Assert.assertTrue(superRadixManager.transform("221", 3, 2).equals("11001"));
        Assert.assertTrue(superRadixManager.transform("11001", 2, 3).equals("221"));
    }

    @Test
    public void should_get_decimalism_value(){
        SuperRadixManager superRadixManager = new SuperRadixManager();

        Assert.assertEquals(25, superRadixManager.getDecimalismValue("221", 3));
        org.junit.Assert.assertEquals(100, superRadixManager.getDecimalismValue("100", 10));
    }

    @Test
    public void should_get_specific_radix_value(){
        SuperRadixManager superRadixManager = new SuperRadixManager();

        org.junit.Assert.assertEquals("221", superRadixManager.getSpecificRadixValue(25, 3));
    }
}