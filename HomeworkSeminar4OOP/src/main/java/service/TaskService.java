package service;

import data.Task;
import data.TaskPriority;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class TaskService {
    private final List<Task> tasks = new ArrayList<>();

    public Task createTask(String taskDeskription,
                           String taskAuthor,
                           LocalDateTime deadLine,
                           TaskPriority taskPriority) {
        Long id = 0L;
        for (Task item : this.tasks) {
            if (id < item.getId()) {
                id = item.getId();
            }
        }
        Task t = new Task(++id, taskAuthor, taskDeskription, deadLine, taskPriority);
        this.tasks.add(t);
        return t;
    }
}
