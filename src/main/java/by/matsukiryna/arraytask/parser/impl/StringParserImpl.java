package by.matsukiryna.arraytask.parser.impl;

import by.matsukiryna.arraytask.parser.StringParser;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class StringParserImpl implements StringParser {
    static Logger logger = LogManager.getLogger();
    private static final String REGEX_DELIMITER = "\\s+";

    @Override
    public int[] parseToInt(String numbersStr) {
        String[] splitStr = numbersStr.split(REGEX_DELIMITER);
        int[] numbers = new int[splitStr.length];
        int intNumber;
        int i = 0;
        for(String numberStr : splitStr){
            try{
                intNumber = Integer.parseInt(numberStr);
                numbers[i++] = intNumber;
            } catch (NumberFormatException e) {
                logger.error(e);
            }
        }
        return Arrays.copyOf(numbers, i);
    }
}
