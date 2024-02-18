package com.todo.spring.service;

import com.todo.spring.entities.Todo;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class TodoService {
    static Set<Todo> todos;
    public static int id = 0 ;

    static {
        todos = new LinkedHashSet<>();
        todos.add(new Todo(++id, "abhay", "Buy S24 Ultra", LocalDate.now(), true));
        todos.add(new Todo(++id, "abhay", "Become CA", LocalDate.now(), true));
        todos.add(new Todo(++id, "aditi", "Become Doctor", LocalDate.now().plusYears(3), false));
        todos.add(new Todo(++id, "aditya", "Become Software Developer", LocalDate.now().plusMonths(6), false));
        todos.add(new Todo(++id, "aditya", "Get RE Chrome Bronze", LocalDate.now().plusMonths(6), false));
    }

    public List<Todo> getTodos() {
        return todos.stream().sorted((o1, o2) ->  Integer.compare(o1.getId(), o2.getId())).collect(Collectors.toList());
    }

    public Set<Todo> getTodosByName(String username) {
        return todos.stream()
                .filter(todo -> todo.getUsername().equalsIgnoreCase(username))
                .collect(Collectors.toSet());
    }

    public void addNewTodo(String username, String description, LocalDate targetDate, boolean isCompleted) {
        todos.add(new Todo(++id, username, description, targetDate, isCompleted));
    }

    public void addNewTodo(Todo todo) {
        todos.add(todo);
    }

    public void deleteTodo(int todoId) {
        todos.removeIf(todo -> todo.getId() == todoId);
    }

    public Todo getTodoById(int todoId) {
         Optional<Todo> needed = todos.stream().filter(todo -> todo.getId() == todoId).findFirst();
        return needed.orElse(null);
    }

    public void updateTodo(Todo updatedTodo) {
        todos.removeIf(todo -> todo.getId() == updatedTodo.getId());
        todos.add(updatedTodo);
    }
}


