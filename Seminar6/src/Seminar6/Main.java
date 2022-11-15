package Seminar6;

import java.util.*;
import java.util.logging.Logger;

public class Main {
//1. Создайте HashSet, заполните его следующими числами:
//    {1, 2, 3, 2, 4, 5, 6, 3}. Распечатайте содержимое данного множества.

public static Integer[] createArray(int size, int min, int max) {
    Random random = new Random();
    Integer[] array = new Integer[size];
    for (int i = 0; i < array.length; i++) {
        array[i] = random.nextInt(min, max +1);
    }
    return array;
}

public static  double percentUnic(Integer[] array) {
    Set<Integer> set = new HashSet<>(Arrays.asList(array));
    return (double) set.size() * 100/ array.length;
}



    public static void main(String[] args) {
        Logger logger = Logger.getAnonymousLogger();
//        HashSet h = new HashSet();
//        h.add(1);
//        h.add(2);
//        h.add(3);
//        h.add(9);
//        h.add(3);
//        h.add(6);
//        System.out.println(h);

//        2. Создайте LinkedHashSet, заполните его следующими числами:
//        {1, 2, 3, 2, 4, 5, 6, 3}.  Распечатайте содержимое данного множества.

//        Set<Integer> set = new HashSet<>();
//        set.add(1);
//        set.add(2);
//        set.add(3);
//        set.add(2);
//        set.add(4);
//        set.add(5);
//        set.add(6);
//        set.add(3);
//        System.out.println(set);

//        3. Создайте TreeSet, заполните его следующими числами:
//        {1, 2, 3, 2, 4, 5, 6, 3}.  Распечатайте содержимое данного множества.

//        TreeSet <Integer> treeSet = new TreeSet<>();
//        treeSet.add(1);
//        treeSet.add(2);
//        treeSet.add(4);
//        treeSet.add(3);
//        treeSet.add(2);
//        treeSet.add(4);
//        System.out.println(treeSet);

//        1. Напишите метод, который заполнит
//        массив из 1000 элементов случайными цифрами от 0 до 24.
//        2. Создайте метод, в который передайте заполненный выше
//        массив и с помощью Set вычислите процент уникальных значений
//        в данном массиве и верните его в виде числа с плавающей запятой.
//        Для вычисления процента используйте формулу:
//        процент уникальных чисел = количество уникальных чисел * 100 /
//                общее количество чисел в массиве.

//        1. Создайте множество, в котором будут храниться экземпляры
//        класса Cat - HashSet<Cat>. Поместите в него некоторое количество объектов.
//        2. Создайте 2 или более котов с одинаковыми параметрами в полях.
//        Поместите их во множество. Убедитесь, что все они сохранились во множество.
//        3. Создайте метод **public boolean** equals(Object o)
//        Пропишите в нём логику сравнения котов по параметрам, хранимым в полях.
//        То есть, метод должен возвращать true, только если значения во всех
//        полях сравниваемых объектов равны.
//        4. Выведите снова содержимое множества из пункта 2,
//                убедитесь, что дубликаты удалились.

//        Integer[]arr = createArray(1000, 0, 24);
//        logger.info(String.valueOf(percentUnic(arr)));

        Cat cat1 = new Cat("Барсик", new CatOwner("Ivan"));
        cat1.setCatMale('M');
        cat1.setMonthBirth(2);
        cat1.setYearBirth(2015);
        System.out.println(cat1);
        System.out.println(cat1.isMale());

    }


}
