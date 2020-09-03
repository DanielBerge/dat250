package no.hvl.dat250.jpa.creditcard;

import no.hvl.dat250.jpa.creditcard.model.*;
import org.junit.Before;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CCTest {

    private static final String PERSISTENCE_UNIT_NAME = "creditcard";
    private EntityManagerFactory factory;

    @Test
    public void testCreateTables() {
        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em = factory.createEntityManager();
        em.clear();

        em.getTransaction().begin();

        Person person = new Person();
        CreditCard creditCard = new CreditCard();
        Pincode pincode = new Pincode();
        pincode.setCount(1);
        pincode.setPincode("4332");
        Address address = new Address();
        address.setNumber(30);
        address.setStreet("Dataveien");
        Bank bank = new Bank();
        bank.setName("DNB");

        creditCard.setId(123123131);
        creditCard.setBank(bank);
        creditCard.setBalance(1000);
        creditCard.setLimit(2000);
        creditCard.setPincode(pincode);
        person.getCreditCards().add(creditCard);

        em.persist(person);
        em.persist(creditCard);
        em.persist(pincode);
        em.persist(address);
        em.persist(bank);

        em.getTransaction().commit();
        em.close();
    }
}
