package app.service;

import app.model.User;
import app.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class UsersService {

    private final UsersRepository usersRepository;

    @Autowired
    public UsersService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public List<User> findAll() {
        return usersRepository.findAll();
    }

    public User findById(int id) {
        Optional<User> foundUser = usersRepository.findById(id);
        return foundUser.orElse(null);
    }

    @Transactional
    public User save(User user) {
        return usersRepository.save(user);
    }

    @Transactional
    public void update(int id, User user) {
        user.setId(id);
        usersRepository.save(user);
    }

    @Transactional
    public void delete(int id) {
        usersRepository.deleteById(id);
    }
}
