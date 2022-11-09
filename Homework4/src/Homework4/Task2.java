package Homework4;

import java.util.LinkedList;

public class Task2 {
    //    –еализуйте очередь с помощью LinkedList со следующими
//    методами:enqueue() - помещает элемент в конец очереди,
//    dequeue() - возвращает первый элемент из очереди и удал€ет его,
//    first() - возвращает первый элемент из очереди, не удал€€.
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

