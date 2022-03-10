package mx.edu.utez.marketplace.user.controller;

import mx.edu.utez.marketplace.utils.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
@CrossOrigin(origins = {"*"})
public class UserController {
    @Autowired
    UserService userService;
    @Autowired
    PasswordEncoder passwordEncoder;

    @PostMapping("/")
    public ResponseEntity<Message> save(@RequestBody UserDTO userDTO) {
        return userService.save(new User(
                userDTO.getUsername(),
                passwordEncoder.encode(userDTO.getPassword()),
                userDTO.getRoles(),
                userDTO.getPerson()
        ));
    }
}
