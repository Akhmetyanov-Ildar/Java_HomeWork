package org.example.service;

import org.example.data.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentService implements IStudentService{
    private List<Student> students;

    public StudentService() {
        this.students = new ArrayList<>();
    }

    @Override
    public void addStudent(Student student) {
        this.students.add(student);
    }

    @Override
    public List<Student> getAll() {
        return students;
    }
}
