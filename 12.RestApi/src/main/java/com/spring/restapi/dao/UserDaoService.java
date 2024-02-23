package com.spring.restapi.dao;

import com.spring.restapi.entities.User;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

@Component
public class UserDaoService {

    private static int id = 0;

    static Set<User> users = new LinkedHashSet<>();

    static {
        users.add(new User.Builder().setId(++id).setName("Abhay").setBirthDate(LocalDate.now().minusYears(30)).build());
        users.add(new User.Builder().setId(++id).setName("Aditi").setBirthDate(LocalDate.now().minusYears(25)).build());
        users.add(new User.Builder().setId(++id).setName("Aditya").setBirthDate(LocalDate.now().minusYears(20)).build());
    }

    public List<User> findAllUsers() {
        return users.stream().sorted((u1, u2) -> u1.getId() - u2.getId()).toList();
    }

    public User findUserById(int id) {
        return users.stream().filter(user -> user.getId() == id).findFirst().orElse(null);
    }

    public User addUser(User newUser) {
        if (users.add(new User.Builder().setId(++id).setName(newUser.getNaam()).setBirthDate(newUser.getBirthDate()).build())) {
            return findUserById(id);
        }
        id--;
        return null;
    }

    public boolean deleteUser(int id) {
        return users.removeIf(user -> user.getId() == id);
    }
}
