package service.impl;

import dao.UserDao;
import java.util.List;
import java.util.Optional;
import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.UserService;

@Service
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void add(User user) {
        userDao.add(user);
    }

    @Override
    public List<User> listUsers() {
        return userDao.listUsers();
    }

    @Override
    public User get(Long id) {
        Optional<User> optionalUser = userDao.get(id);
        if (optionalUser.isEmpty()) {
            return null;
        }
        return optionalUser.get();
    }
}
