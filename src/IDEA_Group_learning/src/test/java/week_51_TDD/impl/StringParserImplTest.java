package week_51_TDD.impl;

import org.junit.Assert;
import org.junit.Test;

public class StringParserImplTest {

    @Test
    public void should_return_Work_1_when_given_Work(){
        String s = "Work";

        String result = new WordProcessor(s).split();

        Assert.assertEquals("Work 1", result);
    }

    @Test
    public void should_return_Work_2_when_given_Work(){
        String s = "Work Work";

        String result = new WordProcessor(s).split();

        Assert.assertEquals("Work 2", result);
    }

    @Test
    public void should_return_Work_2_1_when_given_Work(){
        String s = "w  w w a";

        String result = new WordProcessor(s).split();

        Assert.assertEquals("w 3\n" +
                "a 1", result);
    }

}