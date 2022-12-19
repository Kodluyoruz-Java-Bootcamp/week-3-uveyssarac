package mediium.controller;

import mediium.model.User;
import mediium.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserController {
    @Autowired // injection işlemi, spring tarafından oluşan objenin bağlanması. Default tanımı singleton.
    private UserService service;

    @GetMapping
    public List<User> getAll() {

        System.out.println("getAll - userService :: " + service);
        return service.getAllUser();
    }

    @PostMapping
    // @ResponseStatus(code = HttpStatus.CREATED)
    public ResponseEntity<User> create(@RequestBody User user) {
        //UserService service = new UserService();
        service.createUser(user);
        // return user;
        System.out.println("create - userService :: " + service);
        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }

}
