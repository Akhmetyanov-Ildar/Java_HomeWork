package controller;

import data.Task;
import data.TaskPriority;
import service.FileService;
import service.TaskService;

import java.io.IOException;
import java.time.LocalDateTime;


public class Controller {
    private final TaskService taskService = new TaskService();
    private final FileService fileService = new FileService();

    public Controller() throws IOException {
    }

    public Task createTask(String taskDeskription,
                           String taskAuthor,
                           LocalDateTime deadLine,
                           TaskPriority taskPriority) {

        return taskService.createTask(taskDeskription,
                taskAuthor,
                deadLine,
                taskPriority);
    }

    public void saveToFile (Task task) throws IOException {
        fileService.saveToFile(task);
    }

    public void readTasks() throws Exception {
        for (String[] task: fileService.readFromFile()) {
            for (int i = 0; i < task.length; i++) {
                System.out.print(task[i] + " ");

            }
            System.out.print("\n");

        }
    }

}
