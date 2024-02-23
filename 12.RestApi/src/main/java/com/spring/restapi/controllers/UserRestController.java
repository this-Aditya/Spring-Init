package com.spring.restapi.controllers;

import com.spring.restapi.dao.UserDaoService;
import com.spring.restapi.entities.User;
import com.spring.restapi.utils.exceptions.UserNotFoundException;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class UserRestController {

    private UserDaoService dao;

    public UserRestController(UserDaoService dao) {
        this.dao = dao;
    }

    @GetMapping("users")
    public List<User> findAll() {
        return dao.findAllUsers();
    }

    @PostMapping("users")
    public ResponseEntity<User> addUser(@Valid @RequestBody User newUser) {
        User addedUser = dao.addUser(newUser);
        URI location = ServletUriComponentsBuilder.fromCurrentContextPath()
                .path("{id}")
                .buildAndExpand(addedUser.getId()).toUri();
        return ResponseEntity.created(location).build();
    }

    @GetMapping("users/{id}")
    public User getUserById(@PathVariable int id) {
        User byId = dao.findUserById(id);
        if (byId == null) {
            throw new UserNotFoundException("User with id "+ id +" does not exists.");
        }
        return byId;
    }

    @DeleteMapping("users/{id}")
    public void deleteUser(@PathVariable int id) {
        if (!dao.deleteUser(id)) {
            throw new UserNotFoundException("Can't delete user with id "+ id + ". User doesn't exists..");
        }
    }
}
