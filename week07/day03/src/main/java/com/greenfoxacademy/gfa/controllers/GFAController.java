package com.greenfoxacademy.gfa.controllers;

import com.greenfoxacademy.gfa.models.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GFAController {
    @Autowired
    StudentService studentList = new StudentService();

    @GetMapping("/gfa")
    public String mainPage(Model model) {
        model.addAttribute("count", studentList.count());
        return "index";
    }


    @GetMapping("/gfa/list")
    public String listStudents(Model model) {
        model.addAttribute("list", studentList.findAll());
        model.addAttribute("count", studentList.count());
        return "list";
    }

    @GetMapping("/gfa/add")
    public String addStudent(Model model) {
        model.addAttribute("count", studentList.count());
        return "add";
    }

    @PostMapping("/gfa/save")
    public String savedStudent(Model model, @RequestParam String newStudent) {
        model.addAttribute("saved", newStudent);
        model.addAttribute("count", studentList.count());
        this.studentList.save(newStudent);
        return "saved";
    }

    @GetMapping("/gfa/check")
    public String check(Model model) {
        model.addAttribute("count", studentList.count());
        return "check";
    }

    @PostMapping("/gfa/checked")
    public String checked(Model model, @RequestParam  String search) {
        model.addAttribute("checked", studentList.checkResults(search));
        model.addAttribute("count", studentList.count());
        return "checked";
    }

}
