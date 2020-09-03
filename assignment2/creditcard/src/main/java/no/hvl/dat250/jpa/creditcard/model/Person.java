package no.hvl.dat250.jpa.creditcard.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Person {
    @GeneratedValue(strategy = GenerationType.TABLE)
    private String id;
    @OneToMany(mappedBy = "person")
    private final List<CreditCard> creditCards = new ArrayList<>();
    @ManyToMany(mappedBy = "person")
    private final List<Address> addresses = new ArrayList<>();

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<CreditCard> getCreditCards() {
        return creditCards;
    }
}
