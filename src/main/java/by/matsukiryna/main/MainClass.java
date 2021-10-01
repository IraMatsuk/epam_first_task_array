package by.matsukiryna.main;

import by.matsukiryna.creator.ArrayCreator;
import by.matsukiryna.filter.StringFilter;
import by.matsukiryna.reader.InfoReader;
import by.matsukiryna.service.ArrayService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class MainClass {
    static Logger logger = LogManager.getLogger();

    public static void main(String[] args) {
        InfoReader readerFile = new InfoReader();
        String[] stringsFromFile = readerFile.getData();
        StringFilter filter = new StringFilter();
        String[] strNumbers = filter.filterInt(stringsFromFile);
        ArrayCreator creator = new ArrayCreator();
        int[] numbers = creator.factoryArray(strNumbers);
        logger.info(Arrays.toString(numbers));

        ArrayService arrayService = new ArrayService();

        arrayService.sort(numbers);
        logger.info("Sorted array: " + Arrays.toString(numbers));

        int negativeNumbersCounter = arrayService.countNegativeArrayElements(numbers);
        logger.info("Number of negative array elements : " + negativeNumbersCounter);

        int positiveNumbersCounter = arrayService.countPositiveArrayElements(numbers);
        logger.info("Number of positive array elements : " + positiveNumbersCounter);

        int sumIntArray = arrayService.sumArray(numbers);
        logger.info("Sum of all array elements: " + sumIntArray);

        double average = arrayService.findAverage(numbers);
        logger.info("Average from array : " + average);

        int oldNumber = 0;
        int newNumber = 99;
        arrayService.replace(numbers, oldNumber, newNumber);
        logger.info("Replaced array: " + Arrays.toString(numbers));


        // Read from console:
        /*InfoReader reader = new InfoReader();
        String[] strings = reader.readStringArray();
        StringFilter filter = new StringFilter();
        String[] strNumbers = filter.filterInt(strings);
        ArrayCreator creator = new ArrayCreator();
        int[] numbers = creator.factoryArray(strNumbers);
        logger.info(Arrays.toString(numbers));
        logger.info(Arrays.toString(numbers));

        ArraySorting arraySorting = new ArraySorting();
        arraySorting.sort(numbers);
        logger.info("Sorted array: " + Arrays.toString(numbers));

        int negativeNumbersCounter = arraySorting.countNegativeArrayElements(numbers);
        logger.info("Number of negative array elements : " + negativeNumbersCounter);

        int positiveNumbersCounter = arraySorting.countPositiveArrayElements(numbers);
        logger.info("Number of positive array elements : " + positiveNumbersCounter);

        int sumIntArray = arraySorting.sumArray(numbers);
        logger.info("Sum of all array elements: " + sumIntArray);

        double average = arraySorting.findAverage(numbers);
        logger.info("Average from array : " + average);

        int oldNumber = 0;
        int newNumber = 99;
        arraySorting.replace(numbers, oldNumber, newNumber);
        logger.info("Replaced array: " + Arrays.toString(numbers));*/
    }
}
