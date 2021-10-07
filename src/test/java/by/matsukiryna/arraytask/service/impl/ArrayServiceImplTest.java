package by.matsukiryna.arraytask.service.impl;

import by.matsukiryna.arraytask.entity.ArrayEntity;
import by.matsukiryna.arraytask.exception.ArrayException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertThrows;

public class ArrayServiceImplTest {

    private final ArrayServiceImpl service = new ArrayServiceImpl();

   /* @DataProvider(name = "findAverage")
    public Object[][] findAverage(){
        return new Object[][] {
                //{arrayEntity.getArrayEntity(), true}
        };
    }*/

//    @Test
//    public void testReplace() throws ArrayException {
//        final ArrayEntity arrayEntity = new ArrayEntity(new int[] {1, 0, -4, 3, -3});
//        int[] expected = new int[]{1, 99, -4, 3, -3};
//        int[] actual = service.replace(arrayEntity, 0, 99);
//        assertEquals(actual, expected);
//    }

    @Test()
    public void testFindAverage() throws ArrayException {
        final ArrayEntity arrayEntity = new ArrayEntity(new int[] {2, 8, -4, 3, 6, 0});
        double expected = 2.5;
        double actual = service.findAverage(arrayEntity);
        assertEquals(actual, expected);
    }

    @Test
    public void testFindMax() throws ArrayException {
        final ArrayEntity arrayEntity = new ArrayEntity(new int[] {2, 8, -4, 3, 6, 0});
        int actual = service.findMax(arrayEntity);
        int expected = 8;
        assertEquals(actual, expected);
    }

    @Test
    public void testFindMin() throws ArrayException {
        final ArrayEntity arrayEntity = new ArrayEntity(new int[] {1, -8, 0, 1, 12});
        int expected = -8;
        int actual = service.findMin(arrayEntity);
        assertEquals(actual, expected);
    }

    @Test
    public void testSumArray() throws ArrayException{
        final ArrayEntity arrayEntity = new ArrayEntity(new int[] {2, 8, -4, 3, 6, 0});
        int expected = 15;
        int actual = service.sumArray(arrayEntity);
        assertEquals(actual, expected);
    }

   // @Test (expectedExceptions = Exception)
   // public void testSumOfZeroLengthArray() throws ArrayException {
   //     final ArrayEntity arrayEntity = new ArrayEntity(new int[] {});
   //     assertThrows(ArrayException.class, () -> service.sumArray(arrayEntity));
   // }

    @Test
    public void testCountPositiveArrayElement() throws ArrayException {
        final ArrayEntity arrayEntity = new ArrayEntity(new int[] {2, 8, -4, 3, 6, 0});
        int expected = 5;
        int actual = service.countPositiveArrayElement(arrayEntity);
        assertEquals(actual, expected);
    }

    @Test
    public void testCountNegativeArrayElement() throws ArrayException {
        final ArrayEntity arrayEntity = new ArrayEntity(new int[] {2, -8, -4, 3, 6, 0});
        int expected = 2;
        int actual = service.countNegativeArrayElement(arrayEntity);
        assertEquals(actual, expected);
    }
}