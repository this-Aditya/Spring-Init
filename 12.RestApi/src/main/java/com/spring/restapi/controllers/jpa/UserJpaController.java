package com.spring.restapi.controllers.jpa;

import com.spring.restapi.entities.Post;
import com.spring.restapi.entities.User;
import com.spring.restapi.jpa.PostRepository;
import com.spring.restapi.jpa.UserRepository;
import com.spring.restapi.utils.exceptions.UserNotFoundException;
import jakarta.validation.Valid;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
public class UserJpaController {

    private final UserRepository repository;
    private final PostRepository postRepository;

    public UserJpaController(UserRepository repository, PostRepository postRepository) {
        this.repository = repository;
        this.postRepository = postRepository;
    }

    @GetMapping("/jpa/users")
    public List<User> findAll() {
        return repository.findAll();
    }

    @PostMapping("/jpa/users")
    public ResponseEntity<User> addUser(@Valid @RequestBody User newUser) {
        User addedUser = repository.save(newUser);
            URI location = ServletUriComponentsBuilder.fromCurrentContextPath()
                    .path("{id}")
                    .buildAndExpand(addedUser.getId()).toUri();
            return ResponseEntity.created(location).build();
    }

    @GetMapping("/jpa/users/{id}")
    public EntityModel<User> getUserById(@PathVariable int id) {
        Optional<User> byId = repository.findById(id);
        if (byId.isEmpty()) {
            throw new UserNotFoundException("User with id "+ id +" does not exists.");
        }
        User user = byId.get();
        EntityModel<User> entityModel = EntityModel.of(user);
        WebMvcLinkBuilder linkBuilder = WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(this.getClass()).findAll());
        entityModel.add(linkBuilder.withRel("base-link"));
        return entityModel;
    }

    @DeleteMapping("/jpa/users/{id}")
    public void deleteUser(@PathVariable int id) {
        Optional<User> byId = repository.findById(id);
        if (byId.isEmpty()) {
            throw new UserNotFoundException("Can't delete user with id "+ id + ". User doesn't exists..");
        }
        User toDelete = byId.get();
        repository.delete(toDelete);
        // simply use delete by id directly
    }

    /* Request Mappings for Posts */
    @GetMapping("/jpa/users/{id}/posts")
    public List<Post> getPostsOfUser(@PathVariable int id) {
        Optional<User> optUser = repository.findById(id);
        if (optUser.isEmpty()) {
            throw new UserNotFoundException("No User present with id "+ id);
        }
        return optUser.get().getPosts();
    }

    @PostMapping("/jpa/users/{id}/posts")
    public ResponseEntity<Post> addPost(@PathVariable int id, @Valid @RequestBody Post post) {
        Optional<User> optUser = repository.findById(id);
        if (optUser.isEmpty()) {
            throw new UserNotFoundException("User not present");
        }
        post.setUser(optUser.get());
        postRepository.save(post);
        URI location = ServletUriComponentsBuilder.fromCurrentContextPath()
                .path("{id}")
                .buildAndExpand(optUser.get().getId()).toUri();
        return ResponseEntity.created(location).build();
    }

}
