package no.hvl.dat250.jpa.creditcard.model;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Person {
    @GeneratedValue(strategy = GenerationType.TABLE)
    @Id
    private String id;
    @OneToMany()
    private final List<CreditCard> creditCards = new ArrayList<>();
    @ManyToMany()
    private final List<Address> addresses = new ArrayList<>();
}
