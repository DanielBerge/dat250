package no.hvl.dat250.jpa.creditcard.model;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Person {
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Id
    private String id;

    @OneToMany(mappedBy = "people")
    private final List<CreditCard> creditCards = new ArrayList<>();

    @ManyToMany(mappedBy = "personList")
    private final List<Address> addresses = new ArrayList<>();
}
