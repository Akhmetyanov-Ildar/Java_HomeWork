package Homework_3;

import java.util.ArrayList;

public class Task2deleteEvenNumbers {
//    ����� ��� ������������ ������ ����� �����, ������� �� ���� ������ �����

    public static void deleteEvenNumbers(ArrayList<Integer> nums) {
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 == 0) {
                nums.remove(i);
            }
        }
            System.out.print(nums);
    }
}
