package Homework_2;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Task_2 {
    //        Задание 2 - Реализуйте алгоритм сортировки пузырьком числового
//        массива, результат после каждой итерации запишите в лог-файл.

    Logger logger = Logger.getLogger(Main.class.getName());
    //
    int[] myArray = {1, 5, 3, 2, 4, 10, 0, -5};

    public void sort() {
        for (int i = myArray.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (myArray[j] > myArray[j + 1]) {
                    int z = myArray[j];
                    myArray[j] = myArray[j + 1];
                    myArray[j + 1] = z;
                }
                logger.log(Level.INFO, Arrays.toString(myArray));
            }
        }
    }

}
