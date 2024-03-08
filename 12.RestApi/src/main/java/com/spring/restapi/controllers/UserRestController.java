package com.spring.restapi.controllers;

import com.spring.restapi.dao.UserDaoService;
import com.spring.restapi.entities.User;
import com.spring.restapi.utils.exceptions.UserNotFoundException;
import jakarta.validation.Valid;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@Deprecated
public class UserRestController { // Analogus To UserResource

    private final UserDaoService dao;

    public UserRestController(UserDaoService dao) {
        this.dao = dao;
    }

    @GetMapping("users")
    public List<User> findAll() {
        return dao.findAllUsers();
    }

    @PostMapping("users")
    public ResponseEntity<User> addUser(@Valid @RequestBody User newUser) {
//        User addedUser = dao.addUser(newUser);
        User addedUser = null; // Making it of no use because userDao Service is deprecated
        if (addedUser != null) {
            URI location = ServletUriComponentsBuilder.fromCurrentContextPath()
                    .path("{id}")
                    .buildAndExpand(addedUser.getId()).toUri();
            return ResponseEntity.created(location).build();
        } else throw new RuntimeException("User Already present");
    }

    @GetMapping("users/{id}")
    public EntityModel<User> getUserById(@PathVariable int id) {
        User byId = dao.findUserById(id);
        if (byId == null) {
            throw new UserNotFoundException("User with id "+ id +" does not exists.");
        }
        EntityModel<User> entityModel = EntityModel.of(byId);
        WebMvcLinkBuilder linkBuilder = WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(this.getClass()).findAll());
        entityModel.add(linkBuilder.withRel("base-link"));
        return entityModel;
    }

    @DeleteMapping("users/{id}")
    public void deleteUser(@PathVariable int id) {
        if (!dao.deleteUser(id)) {
            throw new UserNotFoundException("Can't delete user with id "+ id + ". User doesn't exists..");
        }
    }
}
