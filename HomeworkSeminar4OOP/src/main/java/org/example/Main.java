package org.example;

import controller.Controller;
import data.Task;
import data.TaskPriority;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) throws Exception {
        Controller controller = new Controller();
        Task t = controller.createTask("Clean room", "Ildar",
                LocalDateTime.of(2022, 12, 25, 12, 25), TaskPriority.HIGH);

        Task t1 = controller.createTask("Do homework", "Ildar",
                LocalDateTime.of(2022, 12, 25, 12, 25), TaskPriority.LOW);

        controller.saveToFile(t);
        controller.saveToFile(t1);

        controller.readTasks();

    }

}