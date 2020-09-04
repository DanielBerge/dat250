package no.hvl.dat250.jpa.creditcard.model;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
@Data
public class Address {

    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Id
    private String id;
    private String street;
    private int number;

    @ManyToMany()
    private final List<Person> personList = new ArrayList<>();
}
