package com.todo.spring.todo_page;

import com.todo.spring.service.TodoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DeleteTodoController {

    TodoService todoService;

    public DeleteTodoController(TodoService service) {
        this.todoService = service;
    }

    @RequestMapping(value = "delete-todo")
    public String deleteTodoForId(@RequestParam("id") int todoId) {
        todoService.deleteTodo(todoId);
        return "redirect:todos";
    }
}
