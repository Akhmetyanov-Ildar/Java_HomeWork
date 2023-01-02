package org.example;

import org.example.exception.DivByZeroException;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
/*       task 1
 Main main = new Main();
        try {
            main.doSomething();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void doSomething() throws IOException {
        throw new IOException();*/
//
//       создайте класс Счетчик, у которого есть метод add(),
//                увеличивающий значение внутренней int переменной на 1.
//        Сделайте так, чтобы с объектом такого типа можно было работать
//        в блоке try-with-resources. Подумайте, что должно происходить
//        при закрытии этого ресурса? Напишите метод для проверки, закрыт л
//        и ресурс. При попытке вызвать add() у закрытого ресурса,
//                должен выброситься IOException

//        try (Counter counter = new Counter()){
//            counter.add();
//            System.out.println(counter.getCount());
//            counter.setCount(-1);
//            System.out.println(counter.isClosed());
//        }catch (IOException e) {
//            e.printStackTrace();
//        }

        try {
            divide(5,0);
        }catch (DivByZeroException d) {
            System.out.println(d.getMessage());
        }
    }
    public static int divide(int a, int b){
        if (b==0){
            throw new DivByZeroException();
        }
        return a/b;
    }

    public static
}