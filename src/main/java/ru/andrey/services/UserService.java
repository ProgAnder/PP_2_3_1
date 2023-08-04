package ru.andrey.services;

import ru.andrey.models.User;

import java.util.List;

public interface UserService {

    List<User> findAll();

    User findById(Long id);

    void save(User user);

    void update(Long id, User user);

    void delete(Long id);


}
