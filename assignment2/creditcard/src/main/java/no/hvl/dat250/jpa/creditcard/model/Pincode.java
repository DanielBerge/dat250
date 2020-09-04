package no.hvl.dat250.jpa.creditcard.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Pincode {

    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Id
    private String id;
    private String pincode;
    private int count;
    @OneToOne(mappedBy = "pincode", optional = false)
    private CreditCard creditCard;
}
