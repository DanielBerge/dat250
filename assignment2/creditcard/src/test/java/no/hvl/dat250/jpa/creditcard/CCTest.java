package no.hvl.dat250.jpa.creditcard;

import org.junit.Before;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CCTest {

    private static final String PERSISTENCE_UNIT_NAME = "creditcard";
    private EntityManagerFactory factory;


    @Before
    public void setUp() throws Exception {
        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em = factory.createEntityManager();
    }
}
