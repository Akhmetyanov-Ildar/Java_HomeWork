package Homework4;

import java.util.LinkedList;

public class Task2 {
    //    ���������� ������� � ������� LinkedList �� ����������
//    ��������:enqueue() - �������� ������� � ����� �������,
//    dequeue() - ���������� ������ ������� �� ������� � ������� ���,
//    first() - ���������� ������ ������� �� �������, �� ������.
    public static void enqueue(LinkedList<String> llist, String item) {
        llist.addLast(item);
    }

    public static String dequeue(LinkedList<String>llist) {
       return llist.pollFirst();
    }

    public static String first(LinkedList<String>llist) {
        return llist.getFirst();
    }

}

