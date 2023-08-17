package com.lpumajulca.app.service;

import com.lpumajulca.app.entity.Student;
import com.lpumajulca.app.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> listAllStudents() {
        return studentRepository.findAll();
    }
}
