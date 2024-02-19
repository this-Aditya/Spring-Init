package com.todo.spring.todo_page;

import com.todo.spring.service.TodoRepository;
import com.todo.spring.service.TodoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DeleteTodoController {

//    TodoService todoService;
    TodoRepository repository;

    public DeleteTodoController(
//            TodoService service,
            TodoRepository repository
    ) {
//        this.todoService = service;
        this.repository = repository;
    }

    @RequestMapping(value = "delete-todo")
    public String deleteTodoForId(@RequestParam("id") int todoId) {
//        todoService.deleteTodo(todoId);
        repository.deleteById(todoId);
        return "redirect:todos";
    }
}
