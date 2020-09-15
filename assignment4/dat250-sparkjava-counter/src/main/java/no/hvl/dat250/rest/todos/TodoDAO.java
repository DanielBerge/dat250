package no.hvl.dat250.rest.todos;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class TodoDAO {

    private EntityManager em;

    public TodoDAO() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("todos");
        em = factory.createEntityManager();
    }

    public List<Todo> read() {
        Query q = em.createQuery("Select t from Todo t");
        return q.getResultList();
    }

    public Todo read(long id) {
        return em.find(Todo.class, id);
    }

    public void create(Todo todo) {
        em.getTransaction().begin();
        em.persist(todo);
        em.getTransaction().commit();
    }

    public void update(Todo todo) {
        em.getTransaction().begin();
        em.merge(todo);
        em.getTransaction().commit();
    }

    public void delete(long id) {
        Todo todo = em.find(Todo.class, id);
        em.getTransaction().begin();
        em.remove(todo);
        em.getTransaction().commit();
    }
}

