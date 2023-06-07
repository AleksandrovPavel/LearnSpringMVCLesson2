package org.growUpToMiddle.dao;

import org.growUpToMiddle.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();

    void saveUser(User user);

    User getUserById(Long id);

    void updateUser(Long id, User updateUser);

    void deleteUser(Long id);
}
