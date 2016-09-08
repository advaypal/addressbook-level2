package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

/**
 * Represents a Person's contact in the address book.
 * Guarantees: immutable; is valid as declared in {@link #isValidEmail(String)}
 */
public class Contact {
    
    public final String value;
    protected Boolean isPrivate;
    
    /**
     * Creates Contact Object
     */
    public Contact(String value, Boolean isPrivate) {
        this.value = value;
        this.isPrivate = isPrivate;
    }

    @Override
    public String toString() {
        return value;
    }
    
    @Override
    public int hashCode() {
        return value.hashCode();
    }

    public boolean isPrivate() {
        return isPrivate;
    }
    
}
