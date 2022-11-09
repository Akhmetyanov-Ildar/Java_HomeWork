package Semibar4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

import static Semibar4.Task1.getTimeMsOfInsert;

public class Main {


    public static void main(String[] args) {
        //    task1:
//        System.out.println(getTimeMsOfInsert(new ArrayList()));
//        System.out.println(getTimeMsOfInsert(new LinkedList()));

        //task2
//        List<String> smthList = new ArrayList<>();
        Logger logger = Logger.getAnonymousLogger();
//
//        while (true) {
//            var string = (new Scanner(System.in)).next();
//            String[] resStr = string.split("~");
//            if (!resStr[0].equals("print")) {
//                for (int i = 0; i < Integer.parseInt(resStr[1]); i++) {
//                    smthList.add(String.valueOf(resStr[0]));
//                }
//                logger.info(String.valueOf(smthList));
//            } else {
//                logger.info(String.valueOf(smthList.remove(Integer.parseInt(resStr[1])-1)));
//                logger.info(String.valueOf(smthList));
//            }

        //task3
//        1. Принимает от пользователя и “запоминает” строки.
//        2. Если введено print, выводит строки так, чтобы последняя
//        введенная была первой в списке, а первая - последней.
//        3. Если введено revert, удаляет предыдущую введенную строку из памяти.
        List<String> smthList = new ArrayList<>();
        while (true) {
            var string = (new Scanner(System.in)).next();
            if (string.equals("print")) {
                System.out.println(smthList);
            }
        }

    }
}



