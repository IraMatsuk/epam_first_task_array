package by.matsukiryna.arraytask.service;

import by.matsukiryna.arraytask.entity.ArrayEntity;
import by.matsukiryna.arraytask.exception.ArrayException;

public interface ArrayService {
    int[] replace(ArrayEntity arrayEntity, int oldNumber, int newNumber);

    double findAverage(ArrayEntity arrayEntity);

    int findMax(ArrayEntity arrayEntity) throws ArrayException;

    int findMin(ArrayEntity arrayEntity) throws ArrayException;

    int sumArray(ArrayEntity arrayEntity) throws ArrayException;

    int countPositiveArrayElement(ArrayEntity arrayEntity) throws ArrayException;

    int countNegativeArrayElement(ArrayEntity arrayEntity) throws ArrayException;
}

