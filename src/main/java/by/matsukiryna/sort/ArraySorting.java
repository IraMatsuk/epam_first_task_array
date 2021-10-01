package by.matsukiryna.sort;

import java.util.Arrays;

public class ArraySorting {
    public void sort(int[] numbers) {
        Arrays.sort(numbers);
    }

    public void replace(int[] numbers, int oldNumber, int newNumber) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == oldNumber) {
                numbers[i] = newNumber;
            }
        }
    }

    public double findAverage(int[] numbers) {
        double sumAllArraysElements = 0.0;
        double average;
        for (int i = 0; i < numbers.length; i++) {
            sumAllArraysElements += numbers[i];
        }
        average = sumAllArraysElements / numbers.length;
        return average;
    }

    public int sumArray(int[] numbers) {
        int sumAllArraysElements = 0;
        for (int i = 0; i < numbers.length; i++) {
            sumAllArraysElements += numbers[i];
        }
        //return Arrays.stream(numbers).sum();
        return sumAllArraysElements;
    }

    public int countPositiveArrayElements(int[] numbers) {
        int counter = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] >= 0 && numbers[i] <= Integer.MAX_VALUE) {
                counter++;
            }
        }
        return counter;
    }

    public int countNegativeArrayElements(int[] numbers) {
        int counter = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] >= Integer.MIN_VALUE && numbers[i] < 0) {
                counter++;
            }
        }
        return counter;
    }
}
