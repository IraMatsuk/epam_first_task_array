package by.matsukiryna.arraytask.service.impl;

import by.matsukiryna.arraytask.entity.ArrayEntity;
import by.matsukiryna.arraytask.exception.ArrayException;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ArraySortServiceImplTest {

    @Test
    public void testBubbleSortAscending() throws ArrayException {
        //given
        ArraySortServiceImpl sortService = new ArraySortServiceImpl();
        int[] startArray = {10, 4, 0, -2, 20};
        int[] sortedArray = {-2, 0, 4, 10, 20};
        ArrayEntity expected = new ArrayEntity(sortedArray);

        //when
        ArrayEntity actual = new ArrayEntity(startArray);
        sortService.bubbleSort(actual);

        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testInsertionSortAscending() throws ArrayException {
        //given
        ArraySortServiceImpl sortService = new ArraySortServiceImpl();
        int[] startArray = {10, 4, 0, -2, 20};
        int[] sortedArray = {-2, 0, 4, 10, 20};
        ArrayEntity expected = new ArrayEntity(sortedArray);

        //when
        ArrayEntity actual = new ArrayEntity(startArray);
        sortService.insertionSort(actual);

        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSelectionSortAscending() throws ArrayException {
        //given
        ArraySortServiceImpl sortService = new ArraySortServiceImpl();
        int[] startArray = {10, 4, 0, -2, 20};
        int[] sortedArray = {-2, 0, 4, 10, 20};
        ArrayEntity expected = new ArrayEntity(sortedArray);

        //when
        ArrayEntity actual = new ArrayEntity(startArray);
        sortService.selectionSort(actual);

        //then
        Assert.assertEquals(expected, actual);
    }
}