import controller.Controller;
import data.Group;


public class Main {
    public static void main(String[] args) {

        Controller controller = new Controller();
        controller.createUser("Akhmetyanov", "Ildar", "Ilshatovich");
        controller.createUser("dsfsdfsdf", "rrrrr", "Ilshatovich");
        controller.createUser("ssssss", "Ildwwwwwar", "acaca");
        controller.createUser("rrrrrrr", "nnnn", "rrererer");


        controller.createTeacher("Bedrickiy", "Sergey", "Yrevich");

        Group g = controller.createGroup(1L, new Long[]{1L, 2L});
        System.out.println(g);
        }
    }


