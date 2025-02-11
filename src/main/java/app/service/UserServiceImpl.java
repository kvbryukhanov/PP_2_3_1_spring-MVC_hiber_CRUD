package app.service;

import app.DAO.UserDao;
import app.DAO.UserDaoImpl;
import app.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private final UserDao userDao;

    public UserServiceImpl(UserDao UserDaoImpl) {
        this.userDao = UserDaoImpl;
    }

    @Override
    public List<User> index() {
        return userDao.index();
    }

    @Override
    public User show(int id) {
        return null;
    }

    @Override
    public void save(User user) {

    }

    @Override
    public void update(int id, User user) {

    }

    @Override
    public void delete(int id) {

    }
}
