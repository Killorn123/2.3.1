package crudApp.userService;

import crudApp.dao.UserDao;
import crudApp.dao.UserDaoImp;
import crudApp.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImp implements UserService{


    private final UserDao userDao;

    @Autowired
    public UserServiceImp(UserDao userDao) {
        this.userDao = userDao;
    }



    @Override
    public void createUser(User user) {
        userDao.createUser(user);

    }


    @Override
    public User getUserById(int id) {
        return userDao.getUserById(id);
    }

    @Override
    public void deleteUserById(int id) {
        userDao.deleteUserById(id);

    }

    @Override
    public void updateUser( User user) {
        userDao.updateUser(user);

    }

    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }
}
