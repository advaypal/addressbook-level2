package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Represents a Person's name in the address book.
 * Guarantees: immutable; is valid as declared in {@link #isValidName(String)}
 */
public class Name {

    public static final String EXAMPLE = "John Doe";
    public static final String MESSAGE_NAME_CONSTRAINTS = "Person names should be spaces or alphabetic characters";
    public static final String NAME_VALIDATION_REGEX = "[\\p{Alpha} ]+";

    public final String fullName;

    /**
     * Validates given name.
     *
     * @throws IllegalValueException if given name string is invalid.
     */
    public Name(String name) throws IllegalValueException {
        name = name.trim();
        if (!isValidName(name)) {
            throw new IllegalValueException(MESSAGE_NAME_CONSTRAINTS);
        }
        this.fullName = name;
    }

    /**
     * Returns true if a given string is a valid person name.
     */
    public static boolean isValidName(String test) {
        return test.matches(NAME_VALIDATION_REGEX);
    }

    /**
     * Retrieves a listing of every word in the name, in order.
     */
    public List<String> getWordsInName() {
        return Arrays.asList(fullName.split("\\s+"));
    }

    @Override
    public String toString() {
        return fullName;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Name // instanceof handles nulls
                && this.fullName.equals(((Name) other).fullName)); // state check
    }

    @Override
    public int hashCode() {
        return fullName.hashCode();
    }
    
    /**
     * Checks if other is similar to name of object. Similar is defined as containing at least 1 word in common
     * irrespective of order/case
     * @param other
     * @return
     */
    public boolean isSimilar(Name other) {
        if(other == null) {
            return false;
        }
        String otherName = other.fullName.toLowerCase() + ' ';
        String thisName = fullName.toLowerCase() + ' ';
        HashMap<String, Boolean> wordMap= new HashMap<String, Boolean>();
        //pos stores index of first position of current word in string
        int pos = 0;
        String word;
        for(int i = 0; i < otherName.length(); i++) {
            char ch = otherName.charAt(i);
            if(ch == ' ') {
                word = otherName.substring(pos, i);
                pos = i + 1;
                wordMap.put(word, true);
            }
        }
        pos = 0;
        for(int i = 0; i < thisName.length(); i++) {
            char ch = thisName.charAt(i);
            if(ch == ' ') {
                word = thisName.substring(pos, i);
                pos = i + 1;
                if(wordMap.containsKey(word)) {
                    return true;
                }
            }
        }
        return false;
    }

}
