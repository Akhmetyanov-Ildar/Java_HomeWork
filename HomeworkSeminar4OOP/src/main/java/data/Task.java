package data;

import java.time.LocalDateTime;

public class Task {
    Long id;
    private String taskAuthor;
    private String taskDescription; // о чем задача
    LocalDateTime date; // время когда создали задачу
    LocalDateTime deadLine;

    TaskPriority taskPriority;

    public Task(Long id, String taskAuthor, String taskDescription, LocalDateTime deadLine, TaskPriority taskPriority) {
        this.id = id;
        this.taskAuthor = taskAuthor;
        this.taskDescription = taskDescription;
        this.date = LocalDateTime.now();
        this.taskPriority = taskPriority;
        this.deadLine = deadLine;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTaskAuthor() {
        return taskAuthor;
    }

    public void setTaskAuthor(String taskAuthor) {
        this.taskAuthor = taskAuthor;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public TaskPriority getTaskPrioryty() {
        return taskPriority;
    }

    public void setTaskPrioryty(TaskPriority taskPriority) {
        this.taskPriority = taskPriority;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", taskAuthor='" + taskAuthor + '\'' +
                ", taskDescription='" + taskDescription + '\'' +
                ", date=" + date +
                ", taskPriority=" + taskPriority +
                '}';
    }
}
