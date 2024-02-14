package com.todo.spring.login.auth;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    public boolean authenticate(String username, String password) {
        boolean isValidUsername = username.equalsIgnoreCase("aditya");
        boolean isValidPassword = password.equalsIgnoreCase("pass");
        return isValidUsername && isValidPassword;
    }
}
