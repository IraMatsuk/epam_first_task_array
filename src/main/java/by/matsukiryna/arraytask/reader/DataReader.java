package by.matsukiryna.arraytask.reader;

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
    public static final String FILE_PATH = "src/main/resources/data/arraydata.txt";

    public String readFromFileToString() {
        Path path = Paths.get(FILE_PATH);
        String numberStr = "";
        try (Stream<String> streamLines = Files.lines(path)) {
            numberStr = streamLines.collect(Collectors.joining());
            logger.info(numberStr);
        } catch (IOException e) {
            e.printStackTrace();
            logger.error(e);
        }
        return numberStr;
    }
}
