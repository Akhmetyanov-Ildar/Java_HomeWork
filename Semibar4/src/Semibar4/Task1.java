package Semibar4;

import java.util.List;

public class Task1 {
//    1) �������� �����, �� ������� � ArrayList
//    ��������� 10000 ���������.
//
//2) �������� �����, �� ������� � LinkedList
//    ��������� 10000 ���������. �������� � ����������.

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


