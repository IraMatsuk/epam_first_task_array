package by.matsukiryna.arraytask.service.impl;

import by.matsukiryna.arraytask.entity.ArrayEntity;
import by.matsukiryna.arraytask.exception.ArrayException;
import by.matsukiryna.arraytask.service.ArrayService;

public class ArrayServiceImpl implements ArrayService {

    @Override
    public int[] replace(ArrayEntity arrayEntity, int oldNumber, int newNumber) {
        int[] tmpArray = arrayEntity.getArrayEntity();
        for (int i = 0; i < tmpArray.length; i++) {
            if (tmpArray[i] == oldNumber) {
                tmpArray[i] = newNumber;
            }
        }
        return tmpArray;
    }

    @Override
    public double findAverage(ArrayEntity arrayEntity) {
        int[] tmpArray = arrayEntity.getArrayEntity();
        double sumAllArraysElements = 0.0;
        double average;
        for (int i = 0; i < tmpArray.length; i++) {
            sumAllArraysElements += tmpArray[i];
        }
        average = sumAllArraysElements / tmpArray.length;
        return average;
    }

    @Override
    public int findMax(ArrayEntity arrayEntity) throws ArrayException {
        if (isEmpty(arrayEntity) || arrayEntity == null) {
            throw new ArrayException("Array is empty");
        }
        int[] tmpArray = arrayEntity.getArrayEntity();
        int max = tmpArray[0];
        for (int i = 0; i < tmpArray.length; i++) {
            if (tmpArray[i] > max) {
                max = tmpArray[i];
            }
        }
        return max;
    }

    @Override
    public int findMin(ArrayEntity arrayEntity) throws ArrayException {
        if (isEmpty(arrayEntity) || arrayEntity == null) {
            throw new ArrayException("Array is empty");
        }
        int[] tmpArray = arrayEntity.getArrayEntity();
        int min = tmpArray[0];
        for (int i = 0; i < tmpArray.length; i++) {
            if (tmpArray[i] <= min) {
                min = tmpArray[i];
            }
        }
        return min;
    }

    private boolean isEmpty(ArrayEntity arrayEntity) {
        if (arrayEntity.getArrayEntity().length <= 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int sumArray(ArrayEntity arrayEntity) {
        int[] tmpArray = arrayEntity.getArrayEntity();
        int sumAllArraysElements = 0;
        for (int i = 0; i < tmpArray.length; i++) {
            sumAllArraysElements += tmpArray[i];
        }
        return sumAllArraysElements;
    }

    @Override
    public int countPositiveArrayElement(ArrayEntity arrayEntity) {
        int[] tmpArray = arrayEntity.getArrayEntity();
        int counter = 0;
        for (int i = 0; i < tmpArray.length; i++) {
            if (tmpArray[i] >= 0) {
                counter++;
            }
        }
        return counter;
    }

    @Override
    public int countNegativeArrayElement(ArrayEntity arrayEntity) {
        int[] tmpArray = arrayEntity.getArrayEntity();
        int counter = 0;
        for (int i = 0; i < tmpArray.length; i++) {
            if (tmpArray[i] < 0) {
                counter++;
            }
        }
        return counter;
    }
}
