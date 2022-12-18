package org.example;

//Реализуйте метод checkArray(Integer[] arr),
//принимающий в качестве аргумента целочисленный одномерный массив.
//Метод должен пройтись по каждому элементу и проверить что он не равен null.
//А теперь реализуйте следующую логику:
//Если в какой-то ячейке встретился null, то необходимо “оповестить” об этом пользователя
//Если null’ы встретились в нескольких ячейках, то идеально было бы все их “подсветить”


public class Main {
    public static void main(String[] args) {

        Integer[] arr = new Integer[]{7, 5, null, 2, null};
        checkArray(arr);
    }

    public static void checkArray(Integer[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
//                throw new IllegalStateException("Массив содержит null"); // останавливается сразу после первого null

                System.out.println("Элемент с индексом " + i + " равен null"); // находит все null_ы и показывает их индексы
            }

        }
    }
}