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
    private static final int OLD_NUMBER = 0;
    private static final int NEW_NUMBER = 99;

    public static void main(String[] args) {
        InfoReader readerFile = new InfoReader();
        String[] stringsFromFile = readerFile.getDataFromFile();
        StringFilter filter = new StringFilter();
        String[] strNumbers = filter.filterInt(stringsFromFile);
        ArrayCreator creator = new ArrayCreator();
        int[] numbers = creator.factoryArray(strNumbers);
        logger.info(Arrays.toString(numbers));
        ArrayService arrayService = new ArrayService();

        int negativeNumbersCounter = arrayService.countNegativeArrayElements(numbers);
        logger.info("Number of negative array elements : " + negativeNumbersCounter);

        int positiveNumbersCounter = arrayService.countPositiveArrayElements(numbers);
        logger.info("Number of positive array elements : " + positiveNumbersCounter);

        int sumIntArray = arrayService.sumArray(numbers);
        logger.info("Sum of all array elements: " + sumIntArray);

        double average = arrayService.findAverage(numbers);
        logger.info("Average from array : " + average);

        arrayService.replace(numbers, OLD_NUMBER, NEW_NUMBER);
        logger.info("Replaced array: " + Arrays.toString(numbers));
    }
}
