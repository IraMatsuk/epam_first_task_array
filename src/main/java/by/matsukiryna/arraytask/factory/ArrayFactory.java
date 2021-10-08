package by.matsukiryna.arraytask.factory;

import by.matsukiryna.arraytask.entity.ArrayEntity;
import by.matsukiryna.arraytask.exception.ArrayException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArrayFactory {
    static Logger logger = LogManager.getLogger();

    public ArrayEntity createArray(int[] numbers) throws ArrayException {
        ArrayEntity arrayEntity = new ArrayEntity(numbers);
        logger.info("Object is created: " + arrayEntity);
        return arrayEntity;
    }
}
