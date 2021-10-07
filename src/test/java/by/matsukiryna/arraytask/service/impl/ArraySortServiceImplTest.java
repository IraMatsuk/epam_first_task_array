package by.matsukiryna.arraytask.service.impl;

import by.matsukiryna.arraytask.entity.ArrayEntity;
import by.matsukiryna.arraytask.exception.ArrayException;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ArraySortServiceImplTest {

    @Test
    public void testBubbleSort() throws ArrayException {
        //given
        ArraySortServiceImpl sortService = new ArraySortServiceImpl();
        int[] startArray = {10, 4, 0, -2, 20};
        int[] sortedArray = {-2, 0, 4, 10, 20};
        ArrayEntity arrayEntity = new ArrayEntity(startArray);
        ArrayEntity toBeCompared = new ArrayEntity(sortedArray);

        //when
        sortService.bubbleSort(arrayEntity);

        //then
        Assert.assertEquals(toBeCompared, arrayEntity);
    }

    @Test
    public void testInsertionSort() throws ArrayException {
        //given
        ArraySortServiceImpl sortService = new ArraySortServiceImpl();
        int[] startArray = {10, 4, 0, -2, 20};
        int[] sortedArray = {-2, 0, 4, 10, 20};
        ArrayEntity arrayEntity = new ArrayEntity(startArray);
        ArrayEntity toBeCompared = new ArrayEntity(sortedArray);

        //when
        sortService.insertionSort(arrayEntity);

        //then
        Assert.assertEquals(toBeCompared, arrayEntity);
    }

    @Test
    public void testSelectionSort() throws ArrayException {
        //given
        ArraySortServiceImpl sortService = new ArraySortServiceImpl();
        int[] startArray = {10, 4, 0, -2, 20};
        int[] sortedArray = {-2, 0, 4, 10, 20};
        ArrayEntity arrayEntity = new ArrayEntity(startArray);
        ArrayEntity toBeCompared = new ArrayEntity(sortedArray);

        //when
        sortService.selectionSort(arrayEntity);

        //then
        Assert.assertEquals(toBeCompared, arrayEntity);
    }
}