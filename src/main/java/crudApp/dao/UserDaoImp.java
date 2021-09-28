package crudApp.dao;

import crudApp.model.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class UserDaoImp implements UserDao {

    @PersistenceContext
    private EntityManager em;

    @Override
    public void createUser(User user) {
        em.persist(user);
    }

    @Override
    public User getUserById(int id) {
        return em.find(User.class,id);

    }

    @Override
    public void deleteUserById(int id) {
        em.createQuery("delete User where id =:id").setParameter("id",id).executeUpdate();

    }

    @Override
    public void updateUser(User user) {
        em.merge(user);

    }

    @Override
    public List<User> getAllUsers() {
        return em.createQuery("from User", User.class).getResultList();
    }
}
