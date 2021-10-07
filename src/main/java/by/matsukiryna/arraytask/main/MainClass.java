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
    public static final String FILE_PATH = "src/main/resources/data/arraydata.txt";

    public static void main(String[] args) throws ArrayException {
        DataReader readerFile = new DataReader();
        String stringsFromFile = readerFile.readFromFileToString(FILE_PATH);
        StringParser filter = new StringParser();
        int[] strNumbers = filter.parseString(stringsFromFile);
        ArrayFactory arrayFactory = new ArrayFactory();
        ArrayEntity numbers = arrayFactory.createArray(strNumbers);
        logger.info(Arrays.toString(numbers.getArrayEntity()));
        ArrayServiceImpl arrayService = new ArrayServiceImpl();
        arrayService.countNegativeArrayElement(numbers);
        arrayService.countPositiveArrayElement(numbers);
        arrayService.sumArray(numbers);
        arrayService.findAverage(numbers);
        arrayService.replace(numbers, OLD_NUMBER, NEW_NUMBER);
        ArraySortServiceImpl arraySortService = new ArraySortServiceImpl();
        arraySortService.selectionSort(numbers);
        logger.info("Selection sort: " + numbers);
    }
}
