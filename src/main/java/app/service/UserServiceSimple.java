package app.service;

import app.model.User;

import java.util.List;

public interface UserServiceSimple {

    List<User> getUsers(int count);

}