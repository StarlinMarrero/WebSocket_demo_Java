package websocketdemo.demo.user.api;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import websocketdemo.demo.user.model.User;
import websocketdemo.demo.user.service.UserService;
import websocketdemo.demo.user.service.UserService;

@RestController
@CrossOrigin
@ResponseBody
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @GetMapping("/")
    public List<User> getAllUser() {
        return userService.getAllUsers();
    }

    @PostMapping("/")
    public ResponseEntity<?> addUser(@RequestBody User user) {
        userService.AddUser(user);
        Map<String, Object> jsonData = new HashMap<>();
        jsonData.put("message", "Created User");
        jsonData.put("status", "OK");
        return ResponseEntity.ok().body(jsonData);
    }
}
