package by.matsukiryna.arraytask.service.impl;

import by.matsukiryna.arraytask.entity.ArrayEntity;
import by.matsukiryna.arraytask.exception.ArrayException;
import by.matsukiryna.arraytask.service.ArrayService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class ArrayServiceIntStreamImpl implements ArrayService {
    static Logger logger = LogManager.getLogger();

    @Override
    public double findAverage(ArrayEntity arrayEntity) {
        IntStream intStream = Arrays.stream(arrayEntity.getArrayEntity());
        OptionalDouble result = intStream.average();
        logger.info("Average: " + result.getAsDouble());
        return result.getAsDouble();
    }

    @Override
    public int findMax(ArrayEntity arrayEntity) throws ArrayException {
        IntStream intStream = Arrays.stream(arrayEntity.getArrayEntity());
        OptionalInt result = intStream.max();
        logger.info("Max element: " + result.getAsInt());
        return result.getAsInt();
    }

    @Override
    public int findMin(ArrayEntity arrayEntity) throws ArrayException {
        IntStream intStream = Arrays.stream(arrayEntity.getArrayEntity());
        OptionalInt result = intStream.min();
        logger.info("Min element: " + result.getAsInt());
        return result.getAsInt();
    }

    @Override
    public int sumArray(ArrayEntity arrayEntity) throws ArrayException {
        IntStream intStream = Arrays.stream(arrayEntity.getArrayEntity());
        int result = intStream.sum();
        logger.info("Sum elements of array: " + result);
        return result;
    }

    @Override
    public int countPositiveArrayElement(ArrayEntity arrayEntity) throws ArrayException {
        IntStream intStream = Arrays.stream(arrayEntity.getArrayEntity());
        int result = (int) intStream.filter(var -> var > 0).count();
        logger.info("Number of positive elements: " + result);
        return result;
    }

    @Override
    public int countNegativeArrayElement(ArrayEntity arrayEntity) throws ArrayException {
        IntStream intStream = Arrays.stream(arrayEntity.getArrayEntity());
        int result = (int) intStream.filter(var -> var < 0).count();
        logger.info("Number of negative elements: " + result);
        return result;
    }

    @Override
    public int[] replace(ArrayEntity arrayEntity, int oldNumber, int newNumber) {
        IntStream intStream = Arrays.stream(arrayEntity.getArrayEntity());
        return intStream.toArray();
    }
}
