package app.service;

import app.model.User;

import java.util.List;

public class UserServiceSimpleImpl implements UserServiceSimple {

    private final List<User> users;

    public UserServiceSimpleImpl(List<User> users) {
        this.users = users;
    }

    @Override
    public List<User> getUsers(int count) {
        if (count <= 0 || users.size() < count) {
            count = 5;
        }
        return users.subList(0, count);
    }
}
