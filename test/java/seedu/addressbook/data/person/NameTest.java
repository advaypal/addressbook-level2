package seedu.addressbook.data.person;

import static org.junit.Assert.*;
import static seedu.addressbook.common.Messages.MESSAGE_INVALID_COMMAND_FORMAT;

import org.junit.Before;
import org.junit.Test;

import seedu.addressbook.commands.HelpCommand;
import seedu.addressbook.data.exception.IllegalValueException;


public class NameTest {
    
    /*
     * Tests for the isSimilar method
     */

    @Test
    public void checkifSimilarTestWithEqual() throws IllegalValueException {
        Name firstPersonName = new Name("John Doe");
        Name secondPersonName = new Name("John Doe");
        assertTrue(firstPersonName.isSimilar(secondPersonName));
    }
    
    @Test
    public void checkifSimilarTestWithExtraSpace() throws IllegalValueException {
        Name firstPersonName = new Name("John Doe");
        Name secondPersonName = new Name("John  Doe");
        assertTrue(firstPersonName.isSimilar(secondPersonName));
    }
    
    @Test
    public void checkifSimilarTestWithSubstring() throws IllegalValueException {
        Name firstPersonName = new Name("John Doe");
        Name secondPersonName = new Name("John");
        assertTrue(firstPersonName.isSimilar(secondPersonName));
    }
    
    @Test
    public void checkifSimilarTestWithDifferentCase() throws IllegalValueException {
        Name firstPersonName = new Name("John Doe");
        Name secondPersonName = new Name("john doe");
        assertTrue(firstPersonName.isSimilar(secondPersonName));
    }
    
    @Test
    public void checkifSimilarTestWithNull() throws IllegalValueException {
        Name firstPersonName = new Name("John Doe");
        Name secondPersonName = null;
        assertFalse(firstPersonName.isSimilar(secondPersonName));
    }
    
    @Test
    public void checkifSimilarTestWithDifferentNames() throws IllegalValueException {
        Name firstPersonName = new Name("John Doe");
        Name secondPersonName = new Name("Sean Paul");
        assertFalse(firstPersonName.isSimilar(secondPersonName));
    }
    
    @Test
    public void checkifSimilarTestWithDifferentOrder() throws IllegalValueException {
        Name firstPersonName = new Name("John Doe");
        Name secondPersonName = new Name("Doe John");
        assertTrue(firstPersonName.isSimilar(secondPersonName));
    }

}
