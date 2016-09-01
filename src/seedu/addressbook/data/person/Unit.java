/**
 * 
 */
package seedu.addressbook.data.person;

/**
 * Represents Unit in Address Book
 * @author advaypal
 */
public class Unit {
    private final String value;
    /**
     * Constructor: Creates Unit object
     * @param unit
     */
    public Unit(String unit) {
        this.value = unit;
    }
    /**
     * Get value of Unit
     * @return String value of Unit
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
                || (other instanceof Unit // instanceof handles nulls
                && this.value.equals(((Unit) other).value)); // state check
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }


}
