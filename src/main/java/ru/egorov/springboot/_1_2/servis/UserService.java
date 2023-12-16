package ru.egorov.springboot._1_2.servis;

import ru.egorov.springboot._1_2.model.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    User findById(int id);
    void save(User user);
    void update(User user);
    User deleteById(int id);
}
