package no.hvl.dat250.jpa.creditcard.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
@Data
public class CreditCard {

    @Id
    private int number;
    private int limit;
    private int balance;

    @OneToOne()
    private Pincode pincode;

    @ManyToOne()
    private Bank bank;

    @ManyToOne(optional = false)
    private Person people;
}
