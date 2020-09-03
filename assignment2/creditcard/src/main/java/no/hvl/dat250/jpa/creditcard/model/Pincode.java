package no.hvl.dat250.jpa.creditcard.model;

import javax.persistence.*;

@Entity
public class Pincode {

    @GeneratedValue(strategy = GenerationType.TABLE)
    @Id
    private String id;
    private String pincode;
    private int count;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    @OneToOne(optional = false)
    private CreditCard creditCard;

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }
}
