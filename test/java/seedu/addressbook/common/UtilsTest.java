package seedu.addressbook.common;

import static org.junit.Assert.*;
import static seedu.addressbook.common.Messages.MESSAGE_INVALID_COMMAND_FORMAT;
import static seedu.addressbook.common.Messages.MESSAGE_INVALID_PERSON_DISPLAYED_INDEX;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import seedu.addressbook.parser.Parser;

public class UtilsTest {
    
    private Utils utils;
    
    @Before
    public void setup() {
        utils = new Utils();
    }
    /**
     * Check the elementsAreUnique method
     */
    
    @Test
    public void checkElementsAreUniqueWithoutDuplicates() {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.addAll(Arrays.asList(1, 2, 3, 4, 5));
        assertTrue(utils.elementsAreUnique(arr));
    }
    
    @Test
    public void checkElementsAreUniqueWithDuplicates() {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.addAll(Arrays.asList(1, 2, 3, 4, 4));
        assertFalse(utils.elementsAreUnique(arr));
    }
    
    /**
     * Check the isAnyNull method
     */
    
    @Test
    public void checkIsAnyNullWithoutNull() {
        assertFalse(utils.isAnyNull(1, 2, 3, 4));
    }
    
    @Test
    public void checkIsAnyNullWithNull() {
        assertTrue(utils.isAnyNull(1, 2, null, 3));
        
    }
    
}
