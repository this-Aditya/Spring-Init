package com.todo.spring.todo_page;

import com.todo.spring.entities.Todo;
import com.todo.spring.service.TodoService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@Controller
@SessionAttributes("naam")
public class NewTodoController {

    TodoService todoService;

    public NewTodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @RequestMapping(value = "add-todo", method = RequestMethod.GET)
    public String addTodo(ModelMap modelMap) {
        String username = (String) modelMap.get("naam");
        Todo todo = new Todo(0, username, "..", LocalDate.now().plusYears(1), false);
        modelMap.put("newTodo", todo); // same name newTodo should be used in forms too!!
        return "addTodo";
    }

    @RequestMapping(value = "add-todo", method = RequestMethod.POST)
    public String saveNewTodo(ModelMap modelMap, @Valid @ModelAttribute("newTodo") Todo newTodo, BindingResult bindingResult
//    @RequestParam("description") String desc // replacing this wth (Form Backing Object)
    ) {
        if (bindingResult.hasErrors()) {
            return "addTodo";
        }
        String username = (String) modelMap.get("naam");
        todoService.addNewTodo(username, newTodo.getTaskDescription(), LocalDate.now().plusYears(1), false);
        return "redirect:todos";
    }
}
