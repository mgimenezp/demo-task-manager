
package com.martha.taskmanager.controller;

import com.martha.taskmanager.model.Task;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@Controller
public class TaskController {
    private List<Task> tasks = new ArrayList<>();

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("tasks", tasks);
        model.addAttribute("newTask", new Task());
        return "index";
    }

    @PostMapping("/add")
    public String addTask(@ModelAttribute Task newTask) {
        tasks.add(newTask);
        return "redirect:/";
    }

    @PostMapping("/complete/{index}")
    public String completeTask(@PathVariable int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.get(index).setCompleted(true);
        }
        return "redirect:/";
    }
}
