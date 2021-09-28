package crudApp.userService;

import crudApp.model.User;

import java.util.List;

public interface UserService {
    void createUser(User user);
    User getUserById( int id);
    void deleteUserById(int id);
    void updateUser(User user);
    List<User> getAllUsers();
}
