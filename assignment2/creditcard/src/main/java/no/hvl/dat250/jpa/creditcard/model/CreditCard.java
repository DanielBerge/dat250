package no.hvl.dat250.jpa.creditcard.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
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

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
