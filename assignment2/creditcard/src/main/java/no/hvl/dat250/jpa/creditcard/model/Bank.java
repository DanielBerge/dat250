package no.hvl.dat250.jpa.creditcard.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Bank {

    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Id
    private String id;
    private String name;
}
