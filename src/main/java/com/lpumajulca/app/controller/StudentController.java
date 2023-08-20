package com.lpumajulca.app.controller;

import com.lpumajulca.app.entity.Student;
import com.lpumajulca.app.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class StudentController {

    @Autowired
    private StudentService service;

    @GetMapping({"/students","/"})
    public String listStudents(Model model) {
        model.addAttribute("students", service.listAllStudents());
        return "students"; //nos retorna el archivo estudiante
    }

    @GetMapping("/students/new")
    public String createStudentForm(Model model) {
        Student student = new Student();
        model.addAttribute("student", student);
        return "create_student";
    }

    @PostMapping("/students")
    public String saveStudent(@ModelAttribute("student") Student student) {
        service.saveStudent(student);
        return "redirect:/students";
    }

    @GetMapping("/students/edit/{id}")
    public String updateForm(@PathVariable Long id, Model model) {
        model.addAttribute("student", service.getStudentForId(id));
        return "update_student";
    }

    @PostMapping("/students/{id}")
    public String updateStudent(@PathVariable Long id, @ModelAttribute("student") Student student, Model model)   {
        Student studentExists = service.getStudentForId(id);
        studentExists.setId(id);
        studentExists.setName(student.getName());
        studentExists.setLastName(student.getLastName());
        studentExists.setEmail(student.getEmail());

        service.updateStudent(studentExists);
        return "redirect:/students";
    }

    @GetMapping("/students/{id}")
    public String deleteStudent(@PathVariable Long id) {
        service.deleteStudent(id);
        return "redirect:/students";
    }

}
