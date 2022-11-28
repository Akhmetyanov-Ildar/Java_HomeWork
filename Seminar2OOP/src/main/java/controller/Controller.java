package controller;

import data.*;
import service.GroupService;
import service.UserService;
import view.StudentView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Controller {

    private final UserService userService = new UserService();
    private final StudentView studentView = new StudentView();
    private final GroupService groupService = new GroupService();

    public void createUser(String firstName, String lastName, String patronymic) {
        userService.createUser(firstName, lastName, patronymic);
        List<User> students = userService.getAll();
//        studentView.sendOnConsole(students);
    }

    public void createTeacher(String firstName, String lastName, String patronymic) {
        userService.createTeacher(firstName, lastName, patronymic);

    }

    public List<Student> getStudents(Long[] ids) {
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < ids.length; i++) {
            Student s = userService.getStudent(ids[i]);
            if (s != null) {
                students.add(s);
            }
        }

        return students;
    }

    private Teacher getTeacher(Long id) {
        return userService.getTeacher(id);
    }


    public Group createGroup(Long teacherId, Long[] studentIds, String groupName) {
        return groupService.createGroup(getTeacher(teacherId), getStudents(studentIds), groupName);
    }

    public void showSortStudentGroup(List<Student> students) {
        Collections.sort(students, new StudyGroupComparator());
        studentView.showStudents(students);
    }

    public void showSortedStudentsInGroups(List<Group> groups) {
        for (Group g : groups) {
            Collections.sort(g.getStudents(), new StudyGroupComparator());
            studentView.showStudents(g.getStudents(), g.getGroupName());
        }
    }

}
