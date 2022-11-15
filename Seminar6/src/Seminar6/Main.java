package Seminar6;

import java.util.*;
import java.util.logging.Logger;

public class Main {
//1. �������� HashSet, ��������� ��� ���������� �������:
//    {1, 2, 3, 2, 4, 5, 6, 3}. ������������ ���������� ������� ���������.

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

//        2. �������� LinkedHashSet, ��������� ��� ���������� �������:
//        {1, 2, 3, 2, 4, 5, 6, 3}.� ������������ ���������� ������� ���������.

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

//        3. �������� TreeSet, ��������� ��� ���������� �������:
//        {1, 2, 3, 2, 4, 5, 6, 3}.� ������������ ���������� ������� ���������.

//        TreeSet <Integer> treeSet = new TreeSet<>();
//        treeSet.add(1);
//        treeSet.add(2);
//        treeSet.add(4);
//        treeSet.add(3);
//        treeSet.add(2);
//        treeSet.add(4);
//        System.out.println(treeSet);

//        1. �������� �����, ������� ��������
//        ������ �� 1000 ��������� ���������� ������� �� 0 �� 24.
//        2. �������� �����, � ������� ��������� ����������� ����
//        ������ � � ������� Set ��������� ������� ���������� ��������
//        � ������ ������� � ������� ��� � ���� ����� � ��������� �������.
//        ��� ���������� �������� ����������� �������:
//        ������� ���������� ����� = ���������� ���������� ����� * 100 /
//                ����� ���������� ����� � �������.

//        1. �������� ���������, � ������� ����� ��������� ����������
//        ������ Cat - HashSet<Cat>. ��������� � ���� ��������� ���������� ��������.
//        2. �������� 2 ��� ����� ����� � ����������� ����������� � �����.
//        ��������� �� �� ���������. ���������, ��� ��� ��� ����������� �� ���������.
//        3. �������� ����� **public boolean** equals(Object o)
//        ��������� � �� ������ ��������� ����� �� ����������, �������� � �����.
//        �� ����, ����� ������ ���������� true, ������ ���� �������� �� ����
//        ����� ������������ �������� �����.
//        4. �������� ����� ���������� ��������� �� ������ 2,
//                ���������, ��� ��������� ���������.

//        Integer[]arr = createArray(1000, 0, 24);
//        logger.info(String.valueOf(percentUnic(arr)));

        Cat cat1 = new Cat("������", new CatOwner("Ivan"));
        cat1.setCatMale('M');
        cat1.setMonthBirth(2);
        cat1.setYearBirth(2015);
        System.out.println(cat1);
        System.out.println(cat1.isMale());

    }


}
