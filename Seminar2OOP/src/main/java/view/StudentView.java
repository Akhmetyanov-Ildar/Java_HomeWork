package view;

import data.Student;
import data.User;

import java.util.List;
import java.util.logging.Logger;

public class StudentView {

    public void sendOnConsole(List<User> users) {
        Logger logger = Logger.getAnonymousLogger();

        for (User user : users) {

            logger.info(user.toString());

        }
    }

    public void showStudents(List<Student> students) {
        Logger logger = Logger.getLogger(StudentView.class.getName());
        for (Student group : students) {
            logger.info(group.toString());

        }
    }

    public void showStudents(List<Student> students, String groupName) {
        Logger logger = Logger.getLogger(StudentView.class.getName());
        for (Student student : students) {
            logger.info(student.toString() + " " + "Group: " + groupName);
        }
    }

}
