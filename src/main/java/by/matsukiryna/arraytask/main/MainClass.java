package by.matsukiryna.arraytask.main;

import by.matsukiryna.arraytask.entity.ArrayEntity;
import by.matsukiryna.arraytask.exception.ArrayException;
import by.matsukiryna.arraytask.factory.ArrayFactory;
import by.matsukiryna.arraytask.parser.impl.StringParserImpl;
import by.matsukiryna.arraytask.reader.DataReader;
import by.matsukiryna.arraytask.service.impl.ArrayServiceImpl;
import by.matsukiryna.arraytask.service.impl.ArrayServiceIntStreamImpl;
import by.matsukiryna.arraytask.service.impl.ArraySortServiceImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MainClass {
    static Logger logger = LogManager.getLogger();
    private static final int OLD_NUMBER = 0;
    private static final int NEW_NUMBER = 99;
    private static final String FILE_PATH = "data/arraydata.txt";

    public static void main(String[] args) throws ArrayException {
        DataReader readerFile = new DataReader();
        String stringFromFile = readerFile.readFromFileToString(FILE_PATH);
        StringParserImpl stringParser = new StringParserImpl();
        int[] strNumbers = stringParser.parseToInt(stringFromFile);
        ArrayFactory arrayFactory = new ArrayFactory();
        ArrayEntity numbers = arrayFactory.createArray(strNumbers);
        ArrayServiceImpl arrayService = new ArrayServiceImpl();
        arrayService.countNegativeArrayElement(numbers);
        arrayService.countPositiveArrayElement(numbers);
        arrayService.sumArray(numbers);
        arrayService.findAverage(numbers);
        arrayService.findMin(numbers);
        arrayService.findMax(numbers);
        arrayService.replace(numbers, OLD_NUMBER, NEW_NUMBER);

        ArraySortServiceImpl arraySortService = new ArraySortServiceImpl();
        arraySortService.selectionSort(numbers);
        logger.info("Selection sort: " + numbers);

        ArrayServiceIntStreamImpl arrayServiceIntStream = new ArrayServiceIntStreamImpl();
        arrayServiceIntStream.countNegativeArrayElement(numbers);
        arrayServiceIntStream.countPositiveArrayElement(numbers);
        arrayServiceIntStream.sumArray(numbers);
        arrayServiceIntStream.findAverage(numbers);
        arrayServiceIntStream.findMax(numbers);
        arrayServiceIntStream.findMin(numbers);
        arrayServiceIntStream.replace(numbers, OLD_NUMBER, NEW_NUMBER);
    }
}
