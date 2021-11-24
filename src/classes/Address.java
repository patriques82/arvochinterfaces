package classes;

public class Address {
    private final String name;
    private final int postalCode;

    public Address(String name, int postalCode) {
        this.name = name;
        this.postalCode = postalCode;
    }

    public boolean equals(Address other) {
        return other.name == this.name &&
                other.postalCode == this.postalCode;
    }


    public String toString() {
        return this.name + ", " + this.postalCode;
    }
}
