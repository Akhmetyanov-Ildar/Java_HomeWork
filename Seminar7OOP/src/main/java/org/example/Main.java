package org.example;

import org.example.Controller.Controller;
import org.example.data.SchoolClass;
import org.example.data.Student;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Controller controller = new Controller();
        controller.controller(Arrays.asList(
                new Student("Jon", "Wik", "Jonovich", "26.05.1995", SchoolClass.SMALL ),
                new Student("Mik", "Nik", "Lik", "25.12.1988", SchoolClass.MIDDLE),
                new Student("Big", "Jon", "Makkartni", "25.12.1978", SchoolClass.MIDDLE),
                new Student("Small", "Jon", "Makkartni", "25.12.1978", SchoolClass.HIGH)
        ));

    }
}