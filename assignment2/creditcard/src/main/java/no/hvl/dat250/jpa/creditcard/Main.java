package no.hvl.dat250.jpa.creditcard;

import no.hvl.dat250.jpa.creditcard.model.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    private static final String PERSISTENCE_UNIT_NAME = "creditcard";

    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em = factory.createEntityManager();
        em.clear();

        em.getTransaction().begin();

        Person person = new Person();
        Address address = createAddress(person);
        person.getAddresses().add(address);
        Pincode pincode = createPincode();
        Bank bank = createBank();
        CreditCard creditCard = createCreditcard(bank, pincode, person);

        person.getCreditCards().add(creditCard);

        em.persist(person);
        em.persist(creditCard);
        em.persist(pincode);
        em.persist(address);
        em.persist(bank);

        em.getTransaction().commit();
        em.close();
    }

    public static CreditCard createCreditcard(Bank bank, Pincode pincode, Person person) {
        CreditCard creditCard = new CreditCard();
        creditCard.setNumber(123123131);
        creditCard.setBank(bank);
        creditCard.setBalance(1000);
        creditCard.setLimit(2000);
        creditCard.setPincode(pincode);
        creditCard.setPeople(person);
        return creditCard;
    }

    public static Address createAddress(Person person) {
        Address address = new Address();
        address.setNumber(30);
        address.setStreet("Dataveien");
        address.getPersonList().add(person);
        return address;
    }

    public static Pincode createPincode() {
        Pincode pincode = new Pincode();
        pincode.setCount(1);
        pincode.setPincode("4332");
        return pincode;
    }

    public static Bank createBank() {
        Bank bank = new Bank();
        bank.setName("DNB");
        return bank;
    }
}
