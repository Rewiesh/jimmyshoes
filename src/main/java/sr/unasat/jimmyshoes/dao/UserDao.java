package sr.unasat.jimmyshoes.dao;

import sr.unasat.jimmyshoes.entities.User;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class UserDao {
    private EntityManager entityManager;

    public UserDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public List<User> getAllUsers() {
        entityManager.getTransaction().begin();
        String jpql = "select u from user u";
        TypedQuery<User> query = entityManager.createQuery(jpql, User.class);
        List<User> userList = query.getResultList();
        entityManager.getTransaction().commit();
        return userList;
    }
    public void insertUser(User user) {
        entityManager.getTransaction().begin();
        entityManager.persist(user);
        entityManager.getTransaction().commit();
    }
}
