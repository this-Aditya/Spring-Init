package com.todo.spring.service;

import com.todo.spring.entities.Todo;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class TodoService {
    static Set<Todo> todos;

    static {
        todos = new LinkedHashSet<>();
        todos.add(new Todo(1, "abhay", "Buy S24 Ultra", LocalDate.now(), true));
        todos.add(new Todo(2, "aditi", "Become Doctor", LocalDate.now().plusYears(3), false));
        todos.add(new Todo(3, "aditya", "Become Software Developer", LocalDate.now().plusMonths(6), false));
    }

    public Set<Todo> getTodos() {
        return todos;
    }

    public Set<Todo> getTodosByName(String username) {
        return todos.stream()
                .filter(todo -> todo.getUsername().equals(username))
                .collect(Collectors.toSet());
    }

}


