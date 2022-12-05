package service;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import data.Task;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileService {

    private final String filePath = "tasks.csv";
    private final File taskList = new File(filePath);
    public FileService() throws IOException {
        taskList.createNewFile();
    }



    public void saveToFile(Task task) throws IOException {
        CSVWriter writer = new CSVWriter(new FileWriter(filePath, true));
        String taskS = "";
        taskS += task.getId() + ", " + task.getDate() + ", " + task.getTaskDescription() + ", " + task.getTaskAuthor();

        String[] arr = new String[]{
                taskS
        };
        writer.writeNext(arr);
        writer.close();
    }

    public List<String[]> readFromFile() throws Exception {
        try (Reader reader = Files.newBufferedReader(Path.of(filePath))) {
            try (CSVReader csvReader = new CSVReader(reader)) {
                return csvReader.readAll();
            }
        }

    }

}
