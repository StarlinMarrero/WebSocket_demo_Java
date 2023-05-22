package websocketdemo.demo.user.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import lombok.RequiredArgsConstructor;
import websocketdemo.demo.user.model.User;
import websocketdemo.demo.user.repository.UserRepository;

@Repository("UserJPA")
@RequiredArgsConstructor
public class UserDataAccessServices implements UserDao {

    private final UserRepository userRepository;

    @Override
    public List<User> selectAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public void insertUser(User user) {
        userRepository.save(user);
    }

}
