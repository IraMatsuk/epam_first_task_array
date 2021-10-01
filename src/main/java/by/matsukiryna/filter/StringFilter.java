package by.matsukiryna.filter;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class StringFilter {
    static Logger logger = LogManager.getLogger();

    public String[] filterInt(String[] numbers) {
        String[] validStr = new String[numbers.length];
        int i = 0;
        for(String numberStr : numbers){
            try{
                int number = Integer.parseInt(numberStr);
                validStr[i++] = numberStr;
            } catch (NumberFormatException e) {
                logger.error(e);
            }
        }
        return Arrays.copyOf(validStr, i);
    }
}
