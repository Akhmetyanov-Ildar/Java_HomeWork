import controller.Controller;
import data.Group;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

        Controller controller = new Controller();
        controller.createUser("Ildar", "Akhmetyanov", "Ilshatovich");
        controller.createUser("Aidar", "Akhmetyanov", "Ilshatovich");
        controller.createUser("Stanislav", "Peshkin", "Aleksandrovich");
        controller.createUser("Artur", "Urazbakhtin", "Ildarovich");
        controller.createUser("Sergey", "Bedritckij", "Dmitrievich");


        controller.createTeacher("Bedrickiy", "Sergey", "Yrevich");
        controller.createTeacher("Bedrickiy", "Yurii", "Yrevich");
        controller.createTeacher("Bedrickiy", "Anton", "Sergeevich");

        ArrayList<Group> groups = new ArrayList<>();

        groups.add(controller.createGroup(1L, new Long[]{3L, 4L, 2L, 1L}, "PTU1"));
        groups.add(controller.createGroup(2L, new Long[]{1L, 2L, 3L}, "PTU2"));
        groups.add(controller.createGroup(1L, new Long[]{5L, 1L}, "PTU3"));
        groups.add(controller.createGroup(3L, new Long[]{5L, 6L}, "PTU1"));
        groups.add(controller.createGroup(1L, new Long[]{1L, 2L}, "PTU4"));
        groups.add(controller.createGroup(2L, new Long[]{3L, 2L,}, "PTU2"));


        controller.showSortedStudentsInGroups(groups);

//        System.out.println(g);


//        controller.showSortStudentGroup(controller.getStudents(new Long[]{1L, 2L, 3L, 4L}));
    }
}


