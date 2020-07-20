package com.assignee.assignee.controllers;

import com.assignee.assignee.models.Assignee;
import com.assignee.assignee.services.AssigneeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/todo")
public class AssigneeController {

    private AssigneeService assigneeService;

    public AssigneeController(AssigneeService assigneeService){
        this.assigneeService = assigneeService;

    }

    @GetMapping("/assigneelist")
    public String list(Model model) {
        List<Assignee> assignees = new ArrayList<Assignee>();
        assigneeService.findAll().forEach(assignees::add);
        model.addAttribute("assignees", assignees);
        return "assigneelist";
    }


    @GetMapping("/assigneesearch")
    public String search(Model model, @RequestParam String search) {
        if (search != null) {
            model.addAttribute("assignees", assigneeService.search(search));
            return "assigneelist";
        } else return "redirect:/todo/assigneelist";
    }
    @GetMapping("/edit-assignee/{id}")
    public String editAssigneeGET(Model model, @PathVariable Long id) {
        model.addAttribute("assignee", assigneeService.getAssignee(id));
        return "edit-assignee";
    }

    @PostMapping("/edit-assignee")
    public String editAssigneePOST(@ModelAttribute("assignee") Assignee assignee, @RequestParam(value = "id") Long id) {
        assigneeService.updateAssignee(id, assignee.getName(), assignee.getEmail());
        return "redirect:/todo/assigneelist";
    }

    @GetMapping("/delete-assignee/{id}")
    public String deleteAssignee( @PathVariable Long id) {
        assigneeService.deleteAssignee(id);
        return "redirect:/todo/assigneelist";
    }

    @GetMapping("/add-assignee")
    public String addAssignee(Model model) {
        Assignee assignee = new Assignee();
        model.addAttribute("ass", assignee);
        return "assigneelist";
    }


    @PostMapping("/add-assignee")
    public String saveAssignee(@ModelAttribute Assignee assignee) {
        assigneeService.save(assignee.getName(),assignee.getEmail());
        return "redirect:/todo/assigneelist";
    }

    @GetMapping("/{id}")
    public String getAssignee(Model model, @PathVariable Long id) {
        model.addAttribute("assignee", assigneeService.getAssignee(id));
        return "assignee-todos";
    }
}
