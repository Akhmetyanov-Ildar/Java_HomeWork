package service;

import data.Student;
import data.Teacher;
import data.User;

import java.util.ArrayList;
import java.util.List;

public class UserService implements DataService {

    private final List<User> users;

    public UserService() {
        this.users = new ArrayList<>();
    }

    @Override
    public void createUser(String firstName,
                           String lastName,
                           String patronymic) {
        Long id = 0L;
        for (User item : this.users) {
            if (item instanceof Student) {
                if (id < ((Student) item).getStudentId()) {
                    id = ((Student) item).getStudentId();
                }
            }
        }
        this.users.add(new Student(firstName, lastName, patronymic, ++id));
    }

    public void createTeacher(String firstName, String lastName, String patronymic) {
        Long id = 0L;
        for (User item : this.users) {
            if (item instanceof Teacher) {
                if (id < ((Teacher) item).getTeacherId()) {
                    id = ((Teacher) item).getTeacherId();
                }
            }
        }
        this.users.add(new Teacher(firstName, lastName, patronymic, ++id));
    }

    @Override
    public List<User> getAll() {
        return this.users;
    }

    @Override
    public void deleteUser(Long id) {
        for (User item : this.users) {
            if (item instanceof Student) {
                if (id.equals(((Student) item).getStudentId())) {
                    this.users.remove(item);
                }
            }
        }
    }

    @Override
    public User getUser(Long id) {
        return null;
    }

    public Student getStudent(Long id) {
        for (User userItem : this.users) {
            if (userItem instanceof Student) {
                if (id.equals(((Student) userItem).getStudentId())) {
                    return (Student) userItem;
                }
            }

        }
        return null;
    }

    public Teacher getTeacher(Long id) {
        for (User userItem : this.users) {
            if (userItem instanceof Teacher) {
                if (id.equals(((Teacher) userItem).getTeacherId())) {
                    return (Teacher) userItem;
                }
            }

        }
        return null;
    }


}
