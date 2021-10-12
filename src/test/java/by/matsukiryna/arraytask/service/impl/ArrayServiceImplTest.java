package by.matsukiryna.arraytask.service.impl;

import by.matsukiryna.arraytask.entity.ArrayEntity;
import by.matsukiryna.arraytask.exception.ArrayException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertThrows;

public class ArrayServiceImplTest {
    ArrayServiceImpl service;
    ArrayEntity arrayEntity;


    @BeforeClass
    public void setArrayService() throws ArrayException {
        service = new ArrayServiceImpl();
        arrayEntity  = new ArrayEntity(new int[] {2, 8, -4, 3, 6, 0});
    }

    @Test
    public void testFindAverage() {
        double expected = 2.5;
        double actual = service.findAverage(arrayEntity);
        assertEquals(actual, expected);
    }

    @Test
    public void testFindMax() throws ArrayException {
        int expected = 8;
        int actual = service.findMax(arrayEntity);
        assertEquals(actual, expected);
    }

    @Test(expectedExceptions = ArrayIndexOutOfBoundsException.class)
    public void testFindMaxWhenArrayIsEmpty() throws ArrayException {
        service.findMax(new ArrayEntity(new int[]{}));
    }

    @Test(expectedExceptions = NullPointerException.class)
    public void testFindMaxWhenNull() throws ArrayException {
        service.findMax(new ArrayEntity(null));
    }

    @Test
    public void testFindMin() throws ArrayException {
        int expected = -4;
        int actual = service.findMin(arrayEntity);
        assertEquals(actual, expected);
    }

    @Test
    public void testFindMinWhenArrayIsNull() {
        assertThrows(Exception.class, () -> service.findMin(null));
    }

    @Test
    public void testSumArray() {
        int expected = 15;
        int actual = service.sumArray(arrayEntity);
        assertEquals(actual, expected);
    }

    @Test
    public void testCountPositiveArrayElement() {
        int expected = 4;
        int actual = service.countPositiveArrayElement(arrayEntity);
        assertEquals(actual, expected);
    }

    @Test
    public void testCountNegativeArrayElement() {
        int expected = 1;
        int actual = service.countNegativeArrayElement(arrayEntity);
        assertEquals(actual, expected);
    }

    @Test
    public void testReplaceElements() {
        int oldElement = 0;
        int newElement = 99;
        int[] expected = new int[] {2, 8, -4, 3, 6, 99};
        int[] actual = service.replace(arrayEntity, oldElement, newElement);
        assertEquals(actual, expected);
    }

    @AfterClass
    public void tierDown() {
        service = null;
        arrayEntity = null;
    }
}