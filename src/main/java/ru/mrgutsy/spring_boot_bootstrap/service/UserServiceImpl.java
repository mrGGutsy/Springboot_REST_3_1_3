package ru.mrgutsy.spring_boot_bootstrap.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.mrgutsy.spring_boot_bootstrap.repository.UserRepository;
import ru.mrgutsy.spring_boot_bootstrap.model.User;


import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void addUser(User user) {
        userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public void updateUser(User user) {
        userRepository.save(user);
    }

    @Override
    public void deleteUserById(long id) {
        userRepository.deleteById(id);
    }

    @Override
    public User getUserById(long id) {
        return userRepository.getUserById(id);
    }

    @Override
    public User getUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public User getUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    @Override
    public boolean existsUserById(long id) {
        if (userRepository.existsById(id)) {
            return true;
        } else {
            return false;
        }
    }
}
