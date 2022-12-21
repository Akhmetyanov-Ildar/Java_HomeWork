package org.example;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        try (InputStream inputStream = new FileInputStream("sdafgdsaf")) {
            String[] strings = {"asdf", "asdf"};
            String strings1 = strings[1];
            test();
            int a = 0;
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Я жив!");
    }

    public static void test() {
        File file = new File("1.txt");
        try (FileReader reader = new FileReader(file)) {
            if (file.createNewFile()) {
                System.out.println("Создан новый файл");
            } else {
                System.out.println("Переиспользуй этот файл");
            }
            if (reader.read() == -1) {
                throw new IOException("Не может прочитать файл");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
//        Main main = new Main();
//        System.out.println(main.sum2d(new String[][]{{"1", "2", "3"}, {"a", "2", "3"}}));

//    public int sum2d(String[][] arr) {
//        int sum = 0;
//        for (String[] strings : arr) {
//            for (int j = 0; j < strings.length; j++) {
//                int val = 0;
//                try {
//                    val = Integer.parseInt(strings[j]);
//                } catch (NumberFormatException e) {
//                    System.out.println(e.getMessage());
//                }
//                sum += val;
//            }
//        }
//        return sum;
//    }
}