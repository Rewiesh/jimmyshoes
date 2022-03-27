package sr.unasat.jimmyshoes.dao;

import sr.unasat.jimmyshoes.entities.User;

import javax.persistence.EntityManager;

public class UserDao {
    private EntityManager entityManager;

    public UserDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void insertUser(User user) {
        entityManager.getTransaction().begin();
        entityManager.persist(user);
        entityManager.getTransaction().commit();
    }
}
