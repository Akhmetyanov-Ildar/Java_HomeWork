package view;

import controller.Controller;

import java.util.Scanner;

public class View {
    private Controller controller;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите значения через пробел: ");
        String quest = sc.next();
        String [] figureValue = quest.split(" ");

    }
}
