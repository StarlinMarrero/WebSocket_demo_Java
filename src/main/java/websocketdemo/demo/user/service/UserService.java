package websocketdemo.demo.user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import websocketdemo.demo.user.dao.UserDao;
import websocketdemo.demo.user.model.User;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserDao userDao;

    public List<User> getAllUsers() {
        List<User> users = userDao.selectAllUsers();
        return users;
    }

    public boolean AddUser(User user) {
        userDao.insertUser(user);
        return true;
    }

}
