package no.hvl.dat250.jpa.creditcard.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Address {

    @GeneratedValue(strategy = GenerationType.TABLE)
    @Id
    private String id;
    private String street;
    private int number;
    @ManyToMany()
    private final List<Person> personList = new ArrayList<>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
