package no.hvl.dat250.jpa.creditcard.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Person {
    @GeneratedValue(strategy = GenerationType.TABLE)
    @Id
    private String id;
    @OneToMany()
    private final List<CreditCard> creditCards = new ArrayList<>();
    @ManyToMany()
    private final List<Address> addresses = new ArrayList<>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<CreditCard> getCreditCards() {
        return creditCards;
    }

    public List<Address> getAddresses() {
        return addresses;
    }
}
