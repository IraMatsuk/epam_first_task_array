package by.matsukiryna.arraytask.reader;

import by.matsukiryna.arraytask.exception.ArrayException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DataReader {
    static Logger logger = LogManager.getLogger();

    public DataReader() {
    }

    public String readFromFileToString(String FILE_PATH) throws ArrayException {
        Path path = Paths.get(FILE_PATH);
        String numberStr = "";
        try (Stream<String> streamLines = Files.lines(path)) {
            numberStr = streamLines.collect(Collectors.joining());
            logger.info("Data from the file: " + numberStr);
        } catch (IOException e) {
            logger.error(e);
            throw new ArrayException(e.getMessage());
        }
        return numberStr;
    }
}
