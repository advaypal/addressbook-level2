/**
 * 
 */
package seedu.addressbook.data.person;

/**
 * Represents Postal Code in Address
 * @author advaypal
 */
public class PostalCode {
    private final String value;
    /**
     * Constructor creates PostalCode object
     * @param postalCode
     */
    public PostalCode(String postalCode) {
        this.value = postalCode;
    }
    /**
     * Get value of Postal Code
     * @return String value of Postal Code
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
                || (other instanceof PostalCode // instanceof handles nulls
                && this.value.equals(((PostalCode) other).value)); // state check
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }


}

