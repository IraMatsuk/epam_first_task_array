package by.matsukiryna.reader;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class InfoReader {
    private static final String REGEX_DELIMITER = "\\s+";
    static Logger logger = LogManager.getLogger();
    final String FILE_PATH = "file.txt";

    public String[] getDataFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))){
            String source = reader.readLine();
            source = source.trim();
            String[] numbers = source.split(REGEX_DELIMITER);
            return numbers;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
