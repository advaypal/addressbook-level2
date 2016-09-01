/**
 * 
 */
package seedu.addressbook.data.person;

/**
 * Represents Street in Address Book
 * @author advaypal
 */
public class Street {
    private final String value;
    /**
     * Constructor: Creates Street object
     * @param street
     */
    public Street(String street) {
        this.value = street;
    }
    /**
     * Get value of Street
     * @return String value of Street
     */
    public String getValue() {
        return value;
    }
    
    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Street // instanceof handles nulls
                && this.value.equals(((Street) other).value)); // state check
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }


}
