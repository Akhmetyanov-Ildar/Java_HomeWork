package Homework_3;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
// task 1:
//        int[] arr = {88, 3, 1000, 2, 1, 6, 2, 3, 4, -5, -100, 1, 123};
//        Task1mergeSort.mergeSort(arr);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }

 // task 2:
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(6);
        nums.add(7);
        nums.add(8);
        nums.add(9);
        nums.add(10);
        nums.add(11);
        nums.add(12);
        nums.add(100);

        System.out.println(nums);
//        Task2deleteEvenNumbers.deleteEvenNumbers(nums);


 // task 3, работаем с тем же списком что и в task 2:
       Task3minMaxAverage.minMaxAverage(nums);


    }
}

