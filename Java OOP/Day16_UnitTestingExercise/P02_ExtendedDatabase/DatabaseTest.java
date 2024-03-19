package P02_ExtendedDatabase;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.naming.OperationNotSupportedException;

public class DatabaseTest {
    public Database database;
    private static final Person[] PEOPLE = {new Person(1, "Boris"), new Person(2, "Dido"), new Person(3, "Ivo")};
    private static final int SIZE_MORE_THAN_16 = 17;
    private static final int SIZE_LESS_THAN_1 = 0;
    private static final Person ELEMENT_TO_ADD = new Person(4, "Galin");
    private static final int ID_FOR_ADD_ELEMENT = ELEMENT_TO_ADD.getId();
    private static final String NAME_FOR_ADD_ELEMENT = ELEMENT_TO_ADD.getUsername();
    private static final int ID_FOR_LAST_ELEMENT_AFTER_REMOVE_ELEMENT = PEOPLE[PEOPLE.length - 2].getId();
    private static final String NAME_FOR_LAST_ELEMENT_AFTER_REMOVE_ELEMENT = PEOPLE[PEOPLE.length - 2].getUsername();
    private static final String NOT_VALID_NAME = "Kalin";
    private static final int NOT_VALID_ID = 4;
    private static final String GET_VALID_NAME = PEOPLE[0].getUsername();
    private static final int GET_VALID_ID = PEOPLE[0].getId();
    private static final Person ELEMENT_TO_ADD_DUPLICATE_NAME = new Person(4, "Galin");
    private static final Person ELEMENT_TO_ADD_DUPLICATE_ID = new Person(1, "Boris");

    @Before
    public void prepareDateBase() throws OperationNotSupportedException {
        database = new Database(PEOPLE);
    }

    @Test
    public void testConstructorHasCreateValidObject() {
        Person[] people = database.getElements();
        Assert.assertEquals(people.length, PEOPLE.length);
        for (int i = 0; i < people.length; i++) {
            Assert.assertEquals(people[i], PEOPLE[i]);
        }
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testConstructorThrowWhenMoreThanSixteenElements() throws OperationNotSupportedException {
        Person[] people = new Person[SIZE_MORE_THAN_16];
        new Database(people);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testConstructorThrowWhenLessThanOneElements() throws OperationNotSupportedException {
        Person[] people = new Person[SIZE_LESS_THAN_1];
        new Database(people);
    }

    @Test
    public void testAddShouldAddElement() throws OperationNotSupportedException {
        database.add(ELEMENT_TO_ADD);
        Assert.assertEquals(database.getElements().length, PEOPLE.length + 1);
        Assert.assertEquals(Integer.valueOf(database.getElements()[database.getElements().length - 1].getId()), Integer.valueOf(ID_FOR_ADD_ELEMENT));
        Assert.assertEquals(database.getElements()[database.getElements().length - 1].getUsername(), NAME_FOR_ADD_ELEMENT);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testAddShouldThrowNullParam() throws OperationNotSupportedException {
        database.add(null);
    }

    @Test
    public void testRemoveShouldRemoveLastElement() throws OperationNotSupportedException {
        database.remove();
        Assert.assertEquals(database.getElements().length, PEOPLE.length - 1);
        Assert.assertEquals(Integer.valueOf(database.getElements()[database.getElements().length - 1].getId()), Integer.valueOf(ID_FOR_LAST_ELEMENT_AFTER_REMOVE_ELEMENT));
        Assert.assertEquals(database.getElements()[database.getElements().length - 1].getUsername(), NAME_FOR_LAST_ELEMENT_AFTER_REMOVE_ELEMENT);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testRemoveThrowEmptyDataBase() throws OperationNotSupportedException {
        for (int i = 0; i < PEOPLE.length; i++) {
            database.remove();
        }
        database.remove();
    }

    @Test(expected = OperationNotSupportedException.class)
    public void findByUserNameThrowNullParam() throws OperationNotSupportedException {
        database.findByUsername(null);
    }

    @Test
    public void findByUserName() throws OperationNotSupportedException {
        Person person = database.findByUsername(GET_VALID_NAME);
        Assert.assertEquals(Integer.valueOf(person.getId()), Integer.valueOf(GET_VALID_ID));
        Assert.assertEquals(person.getUsername(), GET_VALID_NAME);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void findByUserNameThrowEmptyDateBase() throws OperationNotSupportedException {
        database = new Database();
        database.findByUsername(GET_VALID_NAME);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void findByUserNameMoreThanOnePerson() throws OperationNotSupportedException {
        database.add(ELEMENT_TO_ADD_DUPLICATE_NAME);
        database.findByUsername(GET_VALID_NAME);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void findByUserNameInvalidName() throws OperationNotSupportedException {
        database.findByUsername(NOT_VALID_NAME);
    }

    @Test
    public void findByUserID() throws OperationNotSupportedException {
        Person person = database.findById(GET_VALID_ID);
        Assert.assertEquals(Integer.valueOf(person.getId()), Integer.valueOf(GET_VALID_ID));
        Assert.assertEquals(person.getUsername(), GET_VALID_NAME);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void findByUserIDThrowEmptyDateBase() throws OperationNotSupportedException {
        database = new Database();
        database.findById(GET_VALID_ID);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void findByUserIDMoreThanOnePerson() throws OperationNotSupportedException {
        database.add(ELEMENT_TO_ADD_DUPLICATE_ID);
        database.findById(GET_VALID_ID);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void findByUserIDInvalidID() throws OperationNotSupportedException {
        database.findById(NOT_VALID_ID);
    }
}