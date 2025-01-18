package com.codelabuk.usermgmt.controller;

import com.codelabuk.usermgmt.dto.User;
import com.codelabuk.usermgmt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> getALLUser() {
        return userService.getAllUser();
    }

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable String id) {
        return userService.getUser(id);
    }

    @PostMapping("/addUser")
    public ResponseEntity<Object> addUser(@RequestBody User user) {
        userService.addUser(user);
        URI path = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(user.getId())
                .toUri();

        return ResponseEntity.created(path).build();
    }

    @PostMapping("/updateUser")
    public User updateUser(@RequestBody User user){
        return  userService.updateUser(user);
    }

    @DeleteMapping("/user/{id}")
    public User deleteUser(@PathVariable String id){
        return userService.deleteUser(id);
    }
}
