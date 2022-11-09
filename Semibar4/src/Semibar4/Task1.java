package Semibar4;

import java.util.List;

public class Task1 {
//    1) Замерьте время, за которое в ArrayList
//    добавятся 10000 элементов.
//
//2) Замерьте время, за которое в LinkedList
//    добавятся 10000 элементов. Сравните с предыдущим.

public static long getTimeMsOfInsert(List list) {
    return getInsertTime(list);
}

    public static long getInsertTime(List list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            list.add(new Object());
        }
        return System.currentTimeMillis() - start;
    }
}


