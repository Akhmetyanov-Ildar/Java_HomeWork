package view;

import data.User;

import java.util.List;
import java.util.logging.Logger;

public class StudentView {

    public void sendOnConsole(List<User> users) {
        Logger logger = Logger.getAnonymousLogger();

        for (User user: users){

            logger.info(user.toString());

        }
    }
}
