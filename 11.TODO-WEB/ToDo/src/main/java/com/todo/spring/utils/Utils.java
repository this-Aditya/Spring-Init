package com.todo.spring.utils;

import org.springframework.security.core.context.SecurityContextHolder;

public class Utils {

    public static String getLoggedInUsername() {
        return SecurityContextHolder.getContext().getAuthentication().getName();
    }

}
