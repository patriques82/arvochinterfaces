package classes;

public class Person {
    private final Company company;
    private final Address address;

    public Person(Company company, Address address) {
        this.company = company;
        this.address = address;
    }

    public boolean equals(Person other) {
       return this.address.equals(other.address) &&
                this.company.equals(other.company);

    }
}
