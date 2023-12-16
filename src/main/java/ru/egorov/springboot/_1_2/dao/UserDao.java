package ru.egorov.springboot._1_2.dao;


import ru.egorov.springboot._1_2.model.User;

import java.util.List;

public interface UserDao {
    List<User> findAll ();
    User findById(int id);
    void update(User user);
    void save(User user);
    User deleteById(int id);
}
