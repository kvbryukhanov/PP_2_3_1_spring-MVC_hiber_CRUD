package app.service;

import app.model.User;

import java.util.List;

public interface UserService {
    List<User> index();

    User show(int id);

    void save(User user);

    void update(int id, User user);

    void delete(int id);
}