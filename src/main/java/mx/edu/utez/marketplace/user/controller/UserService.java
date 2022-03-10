package mx.edu.utez.marketplace.user.controller;

import mx.edu.utez.marketplace.utils.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;

@Service
@Transactional
public class UserService {
    @Autowired
    UserRepository userRepository;
    @Autowired
    PersonRepository personRepository;

    @Transactional(rollbackFor = {SQLException.class})
    public ResponseEntity<Message> save(User user) {
        if (userRepository.existByUsername(user.getUsername()))
            return new ResponseEntity<>(new Message("El usuario ya existe", true, null),HttpStatus.BAD_REQUEST);
            if (userRepository.existByPersonByCurp(user.getPerson().getCurp()))
                return new ResponseEntity<>(new Message("La persona ya existe", true, null), HttpStatus.BAD_REQUEST);
            Person person = personRepository.saveAndFlush(user.getPerson());
            user.setPerson(person);
            return new ResponseEntity<>(new Message("ok", false, userRepository.saveAndFlush(user)), HttpStatus.OK);

    }
}
