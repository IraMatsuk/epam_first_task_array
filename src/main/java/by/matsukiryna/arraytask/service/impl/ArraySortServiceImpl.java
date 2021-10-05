package by.matsukiryna.arraytask.service.impl;

import by.matsukiryna.arraytask.entity.ArrayEntity;
import by.matsukiryna.arraytask.exception.ArrayException;
import by.matsukiryna.arraytask.service.ArraySortService;

public class ArraySortServiceImpl implements ArraySortService {
    @Override
    public void bubbleSort(ArrayEntity arrayEntity) throws ArrayException {
        int[] tmpArray = arrayEntity.getArrayEntity();
        int tmp;
        for (int i = 1; i < tmpArray.length; i++) {
            for (int j = tmpArray.length - 1; j >= i; j--) {
                if (tmpArray[j - 1] > tmpArray[j]) {
                    tmp = tmpArray[j - 1];
                    tmpArray[j - 1] = tmpArray[j];
                    tmpArray[j] = tmp;
                }
            }
        }
        arrayEntity.setArrayEntity(tmpArray);
    }

    @Override
    public void insertionSort(ArrayEntity arrayEntity) {
        int[] tmpArray = arrayEntity.getArrayEntity();
        for (int i = 1; i < tmpArray.length; i++) {
            int current = tmpArray[i];
            int j = i;
            while (j > 0 && tmpArray[j - 1] > current) {
                tmpArray[j] = tmpArray[j - 1];
                --j;
            }
            tmpArray[j] = current;
        }
    }

    @Override
    public void selectionSort(ArrayEntity arrayEntity) {
        int[] tmpArray = arrayEntity.getArrayEntity();
        for (int i = 0; i < tmpArray.length; i++) {
            int min = tmpArray[i];
            int minId = i;
            for (int j = i + 1; j < tmpArray.length; j++) {
                if (tmpArray[j] < min) {
                    min = tmpArray[j];
                    minId = j;
                }
            }
            if (i != minId) {
                int tmp = tmpArray[i];
                tmpArray[i] = tmpArray[minId];
                tmpArray[minId] = tmp;
            }
        }
    }
}
