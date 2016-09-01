package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

/**
 * Represents a Person's address in the address book.
 * Guarantees: immutable; is valid as declared in {@link #isValidAddress(String)}
 */
public class Address {

    public static final String EXAMPLE = "123, some street";
    public static final String MESSAGE_ADDRESS_CONSTRAINTS = "Person addresses need to be in the form BLOCK, STREET, UNIT, POSTAL_CODE";;
    public static final String ADDRESS_VALIDATION_REGEX = ".+?, .+?, .+?, .+";
    
    private final Block block;
    private final Street street;
    private final Unit unit;
    private final PostalCode postalCode;

    private boolean isPrivate;

    /**
     * Validates given address.
     *
     * @throws IllegalValueException if given address string is invalid.
     */
    public Address(String address, boolean isPrivate) throws IllegalValueException {
        this.isPrivate = isPrivate;
        if (!isValidAddress(address)) {
            throw new IllegalValueException(MESSAGE_ADDRESS_CONSTRAINTS);
        }
        String[] addressPartsList = address.split(", ");
        this.block = new Block(addressPartsList[0]);
        this.street = new Street(addressPartsList[1]);
        this.unit = new Unit(addressPartsList[2]);
        this.postalCode = new PostalCode(addressPartsList[3]);
    }
    
    public Block getBlock() {
        return block;
    }
    
    public Street getStreet() {
        return street;
    }
    
    public Unit getUnit() {
        return unit;
    }
    
    public PostalCode getpostalCode() {
        return postalCode;
    }
    
    public String getAddressValue() {
        return block.getValue() + ", " + street.getValue() + ", " + unit.getValue() + ", " + postalCode.getValue();
    }


    /**
     * Returns true if a given string is a valid person email.
     */
    public static boolean isValidAddress(String test) {
        return test.matches(ADDRESS_VALIDATION_REGEX);
    }

    @Override
    public String toString() {
        return this.getAddressValue();
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Address // instanceof handles nulls
                && getAddressValue().equals(((Address) other).getAddressValue())); // state check
    }

    @Override
    public int hashCode() {
        return this.getAddressValue().hashCode();
    }

    public boolean isPrivate() {
        return isPrivate;
    }
}