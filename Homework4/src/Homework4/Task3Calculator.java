package Homework4;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Task3Calculator {
    Logger logger = Logger.getLogger(Main.class.getName());
    Scanner scanner = new Scanner(System.in);
    public static double result = 0;
    public static double previosResult = 0;

    public void calculate() {
        System.out.println("������� ������ �����: ");
        double a = scanner.nextDouble();
        System.out.println("������� ������ �����: ");
        double b = scanner.nextDouble();
        System.out.println("������� �������� (+, -, *, /): ");
        String deistvie = scanner.next();
        switch (deistvie) {
            case "+":
                logger.log(Level.INFO, String.valueOf(a + b));
                saveResult(a + b);
                break;

            case "-":
                logger.log(Level.INFO, String.valueOf(a - b));
                saveResult(a - b);
                break;

            case "*":
                logger.log(Level.INFO, String.valueOf(a * b));
                saveResult(a * b);
                break;

            case "/":
                logger.log(Level.INFO, String.valueOf(a / b));
                saveResult(a / b);
                break;

            default:
                logger.log(Level.WARNING, "incorrect operation");
        }
    }

    public void saveResult(double num) {
        previosResult = result;
        result = num;
    }

    public void calculator() {
        String exit = "";
        while (!exit.equalsIgnoreCase("exit")) {
            calculate();
            System.out.println("������� 'exit' ��� ������, ���� 'cancel' ��� ������ ��������� ��������");
            exit = scanner.next();
            if (exit.equals("cancel")) {
                System.out.println("�������� ���������� �������� " + previosResult);

                exit = "Exit";
            }
        }
    }
}

