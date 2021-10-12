package by.matsukiryna.arraytask.service.impl;

import by.matsukiryna.arraytask.entity.ArrayEntity;
import by.matsukiryna.arraytask.exception.ArrayException;
import by.matsukiryna.arraytask.service.ArrayService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class ArrayServiceImpl implements ArrayService {
    static Logger logger = LogManager.getLogger();

    @Override
    public int[] replace(ArrayEntity arrayEntity, int oldNumber, int newNumber) {
        int[] tmpArray = arrayEntity.getArrayEntity();
        for (int i = 0; i < tmpArray.length; i++) {
            if (tmpArray[i] == oldNumber) {
                tmpArray[i] = newNumber;
            }
        }
        logger.info("Replaced array: " + Arrays.toString(tmpArray));
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
        logger.info("Average from array: " + average);
        return average;
    }

    @Override
    public int findMax(ArrayEntity arrayEntity) throws ArrayException {
        int[] tmpArray = arrayEntity.getArrayEntity();
        int max = tmpArray[0];
        for (int i = 0; i < tmpArray.length; i++) {
            if (tmpArray[i] > max) {
                max = tmpArray[i];
            }
        }
        logger.info("Max element from array: " + max);
        return max;
    }

    @Override
    public int findMin(ArrayEntity arrayEntity) throws ArrayException {
        int[] tmpArray = arrayEntity.getArrayEntity();
        int min = tmpArray[0];
        for (int i = 0; i < tmpArray.length; i++) {
            if (tmpArray[i] <= min) {
                min = tmpArray[i];
            }
        }
        logger.info("Min element from array" + min);
        return min;
    }

    @Override
    public int sumArray(ArrayEntity arrayEntity) {
        int[] tmpArray = arrayEntity.getArrayEntity();
        int sumAllArraysElements = 0;
        for (int i = 0; i < tmpArray.length; i++) {
            sumAllArraysElements += tmpArray[i];
        }
        logger.info("Sum of all array elements: " + sumAllArraysElements);
        return sumAllArraysElements;
    }

    @Override
    public int countPositiveArrayElement(ArrayEntity arrayEntity) {
        int[] tmpArray = arrayEntity.getArrayEntity();
        int counter = 0;
        for (int i = 0; i < tmpArray.length; i++) {
            if (tmpArray[i] > 0) {
                counter++;
            }
        }
        logger.info("Number of positive array elements : " + counter);
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
        logger.info("Number of negative array elements : " + counter);
        return counter;
    }
}
