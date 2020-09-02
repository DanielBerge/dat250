package no.hvl.dat250.jpa.creditcard.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class CreditCard {

    private int number;
    private int limit;
    private int balance;

    @Id
    public int getId() {
        return number;
    }

    public void setId(int number) {
        this.number = number;
    }
}
