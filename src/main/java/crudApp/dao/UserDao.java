package crudApp.dao;

import crudApp.model.User;

import java.util.List;

public interface UserDao {
    void createUser(User user);
    User getUserById( int id);
    void deleteUserById(int id);
    void updateUser( User user);
    List<User> getAllUsers();

}
