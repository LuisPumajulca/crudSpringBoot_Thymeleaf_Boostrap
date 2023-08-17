package com.lpumajulca.app.controller;

import com.lpumajulca.app.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {

    @Autowired
    private StudentService servicio;

    @GetMapping({"/students","/"})
    public String listStudents(Model model) {
        model.addAttribute("students", servicio.listAllStudents());
        return "students"; //nos retorna el archivo estudiante
    }
}
