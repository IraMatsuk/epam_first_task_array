package by.matsukiryna.arraytask.main;

import by.matsukiryna.arraytask.entity.ArrayEntity;
import by.matsukiryna.arraytask.exception.ArrayException;
import by.matsukiryna.arraytask.factory.ArrayFactory;
import by.matsukiryna.arraytask.parser.StringParser;
import by.matsukiryna.arraytask.reader.DataReader;
import by.matsukiryna.arraytask.service.impl.ArrayServiceImpl;
import by.matsukiryna.arraytask.service.impl.ArraySortServiceImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class MainClass {
    static Logger logger = LogManager.getLogger();
    private static final int OLD_NUMBER = 0;
    private static final int NEW_NUMBER = 99;

    public static void main(String[] args) throws ArrayException {
        DataReader readerFile = new DataReader();
        String stringsFromFile = readerFile.readFromFileToString();
        StringParser filter = new StringParser();
        int[] strNumbers = filter.parseString(stringsFromFile);
        ArrayFactory arrayFactory = new ArrayFactory();
        ArrayEntity numbers = arrayFactory.createArray(strNumbers);
        logger.info(Arrays.toString(numbers.getArrayEntity()));
        ArrayServiceImpl arrayService = new ArrayServiceImpl();
        int negativeNumbersCounter = arrayService.countNegativeArrayElement(numbers);
        logger.info("Number of negative array elements : " + negativeNumbersCounter);

        int positiveNumbersCounter = arrayService.countPositiveArrayElement(numbers);
        logger.info("Number of positive array elements : " + positiveNumbersCounter);

        int sumIntArray = arrayService.sumArray(numbers);
        logger.info("Sum of all array elements: " + sumIntArray);

        double average = arrayService.findAverage(numbers);
        logger.info("Average from array : " + average);

        arrayService.replace(numbers, OLD_NUMBER, NEW_NUMBER);
        logger.info("Replaced array: " + Arrays.toString(numbers.getArrayEntity()));

        ArraySortServiceImpl arraySortService = new ArraySortServiceImpl();

    }
}
