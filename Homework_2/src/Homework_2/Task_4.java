package Homework_2;

import java.util.Scanner;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Task_4 {
    Logger logger = Logger.getLogger(Main.class.getName());
    Scanner scanner = new Scanner(System.in);

    public void calculator() {
        System.out.println("¬ведите первое число: ");
        double a = scanner.nextDouble();
        System.out.println("¬ведите второе число: ");
        double b = scanner.nextDouble();
        System.out.println("¬ведите действие (+, -, *, /): ");
        String deistvie = scanner.next();
        if (deistvie.equals("+")) {
            logger.log(Level.WARNING, String.valueOf(a + b));
        }
        else if (deistvie.equals("-")) {
            logger.log(Level.OFF, String.valueOf(a - b));
        }
        else if (deistvie.equals("*")) {
            logger.log(Level.INFO, String.valueOf(a * b));
        }
        else {
            logger.log(Level.SEVERE, String.valueOf(a / b));
        }

    }


}
