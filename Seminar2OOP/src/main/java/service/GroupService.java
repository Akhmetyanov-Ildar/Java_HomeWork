package service;

import data.Group;
import data.Student;
import data.Teacher;

import java.util.List;

public class GroupService {
    public Group createGroup (Teacher teacher, List<Student> students) {
        return new Group(teacher, students);
    }
}
