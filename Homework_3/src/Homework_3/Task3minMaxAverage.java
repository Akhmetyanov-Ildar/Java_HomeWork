package Homework_3;

import java.util.ArrayList;

public class Task3minMaxAverage {
//    «адан целочисленный список ArrayList. Ќайти минимальное,
//    максимальное и среднее из этого списка.

    public static void minMaxAverage(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        double average = 0;
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) > nums.get(i - 1)) {
                max = nums.get(i);
            } else {
                min = nums.get(i);
            }
            average = average + nums.get(i);

        }
        System.out.println(max);
        System.out.println(min);
        System.out.println((average+nums.get(0))/nums.size());

    }
}
