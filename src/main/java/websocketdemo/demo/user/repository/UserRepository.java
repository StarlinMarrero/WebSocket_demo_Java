package websocketdemo.demo.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import websocketdemo.demo.user.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}
