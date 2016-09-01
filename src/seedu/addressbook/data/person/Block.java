package seedu.addressbook.data.person;
/**
 * Represents Block in the Address
 * @author advaypal
 *
 */
public class Block {
    private final String value;
    /**
     * Constructor: creates blog object
     * @param block
     */
    public Block(String block) {
        this.value = block;
    }
    /**
     * Get value of block
     * @return String value of block
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
                || (other instanceof Block // instanceof handles nulls
                && this.value.equals(((Block) other).value)); // state check
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }


}
