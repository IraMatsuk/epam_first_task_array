package by.matsukiryna.arraytask.reader;

import by.matsukiryna.arraytask.exception.ArrayException;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class DataReaderTest {
    static final String CORRECT_PATH = "data/arraydata.txt";
    static final String INCORRECT_PATH = "data/array.txt";

    @Test(groups = "mainGroup")
    public void testReadFromFileWhenFilePathIsCorrect() throws ArrayException {
        DataReader dataReader = new DataReader();
        String actual = dataReader.readFromFileToString(CORRECT_PATH);
        String expected = "10  4 0   -2 hello  & 20";
        assertEquals(actual, expected);
    }

    @Test(groups = "arrayException")
    public void testReadFromFileWhenFilePathIsNotCorrect() {
        DataReader dataReader = new DataReader();
        Assert.assertThrows(NullPointerException.class, () -> dataReader.readFromFileToString(INCORRECT_PATH));
    }
}