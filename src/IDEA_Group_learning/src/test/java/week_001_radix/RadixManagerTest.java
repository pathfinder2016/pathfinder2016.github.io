package week_001_radix;

import junit.framework.Assert;
import org.junit.Test;

public class RadixManagerTest {


    @Test
    public void convert_deci_to_binary() throws Exception {
        RadixManager radixManager = new RadixManager();

        Assert.assertTrue(radixManager.convertDeciToBinary(8).equals("1000"));
        Assert.assertTrue(radixManager.convertDeciToBinary(15).equals("1111"));
        Assert.assertTrue(radixManager.convertDeciToBinary(-8).equals("11000"));
        Assert.assertTrue(radixManager.convertDeciToBinary(-16).equals("110000"));
        System.out.print(radixManager.convertDeciToBinary(-128));
    }

}