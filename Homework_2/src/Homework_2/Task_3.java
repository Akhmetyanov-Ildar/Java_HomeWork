package Homework_2;

import java.io.File;
import java.util.Locale;

//Задание 3 - Напишите метод, который определит тип
// (расширение) файлов из текущей папки и выведет в консоль результат вида
//1 Расширение файла: txt
//2 Расширение файла: pdf
//3 Расширение файла:
//4 Расширение файла: jpg
public class Task_3 {

    public String getFileExtension(File file) {
        String name = file.getName();
        int lastIndexOf = name.lastIndexOf(".");
        if (lastIndexOf == -1) {
            return ""; // empty extension
        }
        return name.substring(lastIndexOf);
    }
}
