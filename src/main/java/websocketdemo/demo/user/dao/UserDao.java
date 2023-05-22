package websocketdemo.demo.user.dao;

import java.util.List;

import websocketdemo.demo.user.model.User;

public interface UserDao {
    List<User> selectAllUsers();

    void insertUser(User user);
}
