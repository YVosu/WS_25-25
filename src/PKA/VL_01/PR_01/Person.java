package PKA.VL_01.PR_01;

import java.util.Objects;

public class Person {
    private final String name;
    private final String city;
    private String street;
    private String zipcode;

    public Person(final String name, final String city, final String street, final String zipcode) {
        Objects.requireNonNull(name, "parameter 'name' must not be null!");
        Objects.requireNonNull(city, "parameter 'city' must not be null!");

        this.name = name;
        this.city = city;

        this.street = street;
        this.zipcode = zipcode;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, city, street, zipcode);
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return name.equals(person.name) &&
                city.equals(person.city) &&
                Objects.equals(street, person.street) &&
                Objects.equals(zipcode, person.zipcode);
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", zipcode='" + zipcode + '\'' +
                '}';
    }
}
