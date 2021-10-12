package by.matsukiryna.arraytask.parser.impl;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StringParserImplTest {
    @Test(groups = "mainGroup", priority = 1)
    public void testParseStringImpl() {
        StringParserImpl parser = new StringParserImpl();
        int[] actual = parser.parseToInt("10  4 0   -2 hello  & 20");
        int[] expected = {10, 4, 0, -2, 20};
        Assert.assertEquals(actual, expected);
    }
}