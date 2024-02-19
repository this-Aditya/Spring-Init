package com.todo.spring.todo_page;

import com.todo.spring.entities.Todo;
import com.todo.spring.service.TodoRepository;
import com.todo.spring.service.TodoService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UpdateTodoController {

//    TodoService todoService;
//
//    public UpdateTodoController(TodoService todoService) {
//        this.todoService = todoService;
//    }


    TodoRepository repository;

    public UpdateTodoController(TodoRepository repository) {
        this.repository = repository;
    }

    // For the sake of not complicating it, resuing the add-todo page again
    @RequestMapping(value = "update-todo", method = RequestMethod.GET)
    public String updateTodo(@RequestParam("id") int todoId, ModelMap modelMap) {
//        Todo toUpdate = todoService.getTodoById(todoId);
        Todo toUpdate = repository.findById(todoId).get();
        modelMap.put("updateTodo", toUpdate);
        return "updateTodo";
    }

    @RequestMapping(value = "update-todo", method = RequestMethod.POST)
    public String updateTodo(@Valid @ModelAttribute("updateTodo") Todo todo, BindingResult bindingResult) {
        if(bindingResult.hasErrors()) {
            return "updateTodo";
        }
        System.out.println(todo);
//        todoService.updateTodo(todo);
        repository.save(todo);
        return "redirect:todos";
    }
}
