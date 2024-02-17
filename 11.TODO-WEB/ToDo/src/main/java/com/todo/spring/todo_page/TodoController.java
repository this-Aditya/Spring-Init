package com.todo.spring.todo_page;

import com.todo.spring.service.TodoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("naam")
public class TodoController {

    TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    /*
     It is only comping from redirection just after login is succeeded, after refreshing. 'name' will noy
     be available...
    @RequestMapping("todos")
    public String todos(@ModelAttribute("name") String name, ModelMap modelMap) {
     This won't work if request is refreshed, it would not be coming from redirection after the refresh!
        modelMap.put("todos", todoService.getTodos());
        modelMap.put("naam", name);
        return "home";
    }
     */

    // Doing the work we did via RedirectAttrivute with the SessionAttributes
    @RequestMapping(value = "todos", method = RequestMethod.GET)
    public String todos(ModelMap modelMap) {
//        System.out.println("Todos: name -> "+modelMap.get("naam"));
        modelMap.put("todos", todoService.getTodos());
        System.out.println("Querying Todos:");
        System.out.println(todoService.getTodos());
        return "todos";
    }
}
