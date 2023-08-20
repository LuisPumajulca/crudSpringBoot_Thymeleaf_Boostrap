package com.lpumajulca.app.service;

import com.lpumajulca.app.entity.Student;

import java.util.List;

public interface StudentService {

    public List<Student> listAllStudents();

    public Student saveStudent(Student student);

    public Student getStudentForId(Long id);

    public Student updateStudent(Student student);

    public void deleteStudent(Long id);
}
