package sr.unasat.jimmyshoes.dao;

import sr.unasat.jimmyshoes.entities.User;
import sr.unasat.jimmyshoes.entities.UserType;
import sr.unasat.jimmyshoes.jpaconfig.JPAConfiguration;

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
        String jpql = "select u from User u";
        TypedQuery<User> query = entityManager.createQuery(jpql, User.class);
        List<User> userList = query.getResultList();
        entityManager.getTransaction().commit();
        return userList;
    }

    public User getUserById( Long userId) {
        entityManager.getTransaction().begin();
        String jpql = "select u from User u where u.userId = :userId";
        TypedQuery<User> query = entityManager.createQuery(jpql, User.class);
        query.setParameter("userId", userId);
        User user = query.getSingleResult();
        entityManager.getTransaction().commit();
        return user;
    }

    public void insertUser(User user) {
        entityManager.getTransaction().begin();
        entityManager.persist(user);
        entityManager.getTransaction().commit();
    }
}
