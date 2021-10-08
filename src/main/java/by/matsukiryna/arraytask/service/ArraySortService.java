package by.matsukiryna.arraytask.service;

import by.matsukiryna.arraytask.entity.ArrayEntity;
import by.matsukiryna.arraytask.exception.ArrayException;

public interface ArraySortService {
    void bubbleSort(ArrayEntity arrayEntity) throws ArrayException;

    void insertionSort(ArrayEntity arrayEntity) throws ArrayException;

    void selectionSort(ArrayEntity arrayEntity) throws ArrayException;
}
