package app.DAO;

import app.model.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    @Override
    public List<User> index() {
        return entityManager.createQuery("from User", User.class).getResultList();
    }

    @Transactional
    @Override
    public User show(int id) {
        return null;
    }

    @Transactional
    @Override
    public void save(User user) {

    }

    @Transactional
    @Override
    public void update(int id, User user) {

    }

    @Transactional
    @Override
    public void delete(int id) {

    }
}
