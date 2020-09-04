package no.hvl.dat250.jpa.creditcard.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Pincode {

    @GeneratedValue(strategy = GenerationType.TABLE)
    @Id
    private String id;
    private String pincode;
    private int count;
}
