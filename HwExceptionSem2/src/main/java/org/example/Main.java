package org.example;

import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //task2
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int[]intArray = new int[random.nextInt(10)];
        int d = sc.nextInt();

        for (int i = 0; i < intArray.length; i++) {
            intArray[i]= d+i;
        }

        try {
            double catchedRes1 = intArray[d] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Catching exception: " + e.getMessage());

        }catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e.getMessage());
        }

    }
}

//    public static void main(String[] args){
//        try {
//            int a = 90;
//            int b = 3;
//            System.out.println(a / b);
//            printSum(23, 234);
//            int[] abc = {1, 2};
//            abc[3] = 9;
//
//        } catch (IndexOutOfBoundsException ex) {
//            System.out.println("Массив выходит за пределы своего размера!");
//        } catch (ArithmeticException e) {
//            System.out.println("Делить на ноль нельзя");
//        } catch (Throwable ex) {
//            System.out.println("Что-то пошло не так...");
//        }
//    }
//
//    public static void printSum(Integer a, Integer b) {
//        System.out.println(a + b);
//    }
//}
