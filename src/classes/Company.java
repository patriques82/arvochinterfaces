package classes;

public class Company {
    private final String name;
    private final int orgnr;
    private final int networth;

    public Company(String name, int orgnr, int networth) {
        this.name = name;
        this.orgnr = orgnr;
        this.networth = networth;
    }

    public boolean equals(Company other) {
        return other.name == this.name &&
                other.orgnr == this.orgnr;
    }

    public String toString() {
        return this.name;
    }

}
