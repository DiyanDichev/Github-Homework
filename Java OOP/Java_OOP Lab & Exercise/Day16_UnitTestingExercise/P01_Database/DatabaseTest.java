package Day16_UnitTestingExercise.P01_Database;

import Day16_UnitTestingExercise.p01_Database.Database;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.naming.OperationNotSupportedException;

public class DatabaseTest {
    public Database database;
    private static final Integer[] NUMBERS = {7, 45, 34, 12, 98, 23};

    @Before
    public void prepareDatabase() throws OperationNotSupportedException {
        database = new Database(NUMBERS);
    }

    @Test
    public void testDoConstructorCreateValidObject() {
        Integer[] elements = database.getElements();
        Assert.assertArrayEquals("Arrays are not the same", elements,NUMBERS);

        Assert.assertEquals(elements.length, NUMBERS.length);
        for (int index = 0; index < elements.length; index++) {
            Assert.assertEquals(elements[index], NUMBERS[index]);
        }
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testConstructorThrowWhenMoreThanSixteenElements() throws OperationNotSupportedException {
        Integer[] numbers = new Integer[17];
        new Database(numbers);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testConstructorThrowWhenLessThanOneElement() throws OperationNotSupportedException {
        Integer[] numbers = new Integer[0];
        new Database(numbers);
    }

    @Test
    public void tesAddShouldAddElement() throws OperationNotSupportedException {
        database.add(67);
        Integer[] elements = database.getElements();
        Assert.assertEquals(elements.length, NUMBERS.length + 1);
        Assert.assertEquals(elements[elements.length - 1], Integer.valueOf(67));
    }
    @Test(expected = OperationNotSupportedException.class)
    public  void testShouldThrowNullParam() throws OperationNotSupportedException {
        database.add(null);
    }

    @Test
    public void testRemoveLastElement() throws OperationNotSupportedException {
         database.remove();

         Integer[] elements = database.getElements();
         Assert.assertEquals(elements.length, NUMBERS.length - 1);
         Assert.assertEquals(elements[elements.length - 1], Integer.valueOf(98));
    }
    @Test(expected = OperationNotSupportedException.class)
    public void testRemoveThrowEmptyDatabase() throws OperationNotSupportedException {
        for (int i = 0; i < NUMBERS.length; i++) {
            database.remove();
        }
        database.remove();

    }
}
