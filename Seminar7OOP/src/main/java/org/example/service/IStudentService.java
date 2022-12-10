package org.example.service;

import org.example.data.Student;

import java.util.List;

public interface IStudentService {
    void addStudent(Student student);

    List<Student> getAll();
}
