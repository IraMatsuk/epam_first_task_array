package by.matsukiryna.arraytask.factory;

import by.matsukiryna.arraytask.entity.ArrayEntity;
import by.matsukiryna.arraytask.exception.ArrayException;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ArrayFactoryTest {

    @Test(groups = "mainGroup", priority = 2)
    public void testCreateArray() throws ArrayException {
        int[] expected = {10, 4, 0, -2, 20};
        ArrayFactory arrayFactory = new ArrayFactory();
        ArrayEntity actual = arrayFactory.createArray(expected);
        assertEquals(actual.getArrayEntity(), expected);
    }
}