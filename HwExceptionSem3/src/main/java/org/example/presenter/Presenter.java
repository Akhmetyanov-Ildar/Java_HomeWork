package org.example.presenter;

import org.example.model.DataChecker;


import org.example.model.ParsingDataStringException;
import org.example.view.ConsoleView;
import org.example.view.View;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Presenter<V extends View> {

    private DataChecker model;
    private V view;

    public Presenter(V v) {
        view = v;
    }

    public void start() {
        boolean working = true;
        do {
            String input = view.getInput(
                    "Введите данные через пробел (Фамилию Имя Отчество ДатуРождения НомерТелефона Пол), или Exit для прекращения программы");
            if (input.equals("Exit")) {
                working = false;
                break;
            } else {
                String[] splitedInput = input.replaceAll("\\s+", " ").split(" ");

                int inputDataCount = checkInputDataCount(splitedInput.length);
                if (inputDataCount == -1) {
                    view.printOutput("Слишком много данных на вводе (должно быть " + DataChecker.dataCount +
                            " разделенных пробелом ' ': Фамилия Имя Отчество ДатаРождения НомерТелефона Пол)\n");
                } else {
                    try {
                        model = new DataChecker();
                        model.CheckData(splitedInput);
                        writrPersonData(model);
                    } catch (IOException e) {
                        e.printStackTrace();
                    } catch (ParsingDataStringException e) {
                        view.printOutput(e.getMessage());
                    }
                }
            }

        } while (working);
    }
    // по заданию проверяем кол-во введённых данных через возврат кода ошибки при
    // несоответствии
private int checkInputDataCount (int inputDataCount) {
        if (inputDataCount < DataChecker.dataCount) {
            return -1;
        }else if (inputDataCount > DataChecker.dataCount) {
            return 0;
        }else {
            return inputDataCount;
        }
}

    //создаём или подключаемся к фаилу по фамилии и дописываем туда новые данные

    private void writrPersonData (DataChecker data) throws IOException {
        File filepath = new File(data.getLastName());
        try (FileWriter fw = new FileWriter(filepath, true)){
            fw.append(data.toString() + "\n");
        }catch (IOException e) {
            throw e;
        }
    }
}
