package Homework5;

import java.util.*;

public class Main {

    public static void main(String[] args) {
//        task1
//        Task1PhoneDirectiry directory = new Task1PhoneDirectiry();
//        directory.add("antonyan", "8999123321");
//        directory.add("antonyan", "8912155326");
//        directory.add("bobov", "8917155552");
//        directory.add("bobov", "8913455672");
//        directory.add("antonyan", "899999999");
//        directory.add("igoryan", "899111111");
//        directory.add("bobov", "89923231999");
//        directory.add("smetanov", "8888123113");
//        directory.add("igoryan", "8324325234");
//
//        System.out.println(directory.get("antonyan"));
//        System.out.println(directory.get("igoryan"));
//        System.out.println(directory.get("bobov"));
//        System.out.println(directory.get("smetanov"));

//        task2
//        Написать программу, которая
//        найдет и выведет повторяющиеся имена с к
//        оличеством повторений. Отсортировать по убыванию популярности.
        List<String> people = new ArrayList<>();
        people.add("Иван Иванов");
        people.add("Светлана Петрова");
        people.add("Кристина Белова");
        people.add("Анна Мусина");
        people.add("Анна Крутова");
        people.add("Иван Юрин");
        people.add("Петр Лыков");
        people.add("Павел Чернов");
        people.add("Петр Чернышов");
        people.add("Мария Федорова");
        people.add("Марина Светлова");
        people.add("Мария Савина");
        people.add("Мария Рыкова");
        people.add("Марина Лугова");
        people.add("Анна Владимирова");
        people.add("Иван Мечников");
        people.add("Петр Петин");
        people.add("Петр Петин");
        people.add("Иван Ежов");
        Set<String> names = new LinkedHashSet<>();
        for (String n : people) {
            names.add(n.split(" ")[0]);
        }

        HashMap<String, String> unsortedMap = new HashMap<>();
        int count = 0;
        for (String uniName : names) {
            for (String anyName : people) {
                if (uniName.equals(anyName.split(" ")[0])) {
                    count++;
                }
            }
            unsortedMap.put(uniName, Integer.toString(count));
            count = 0;
        }

        Comparator<Map.Entry<String, String>> valueComparator = new Comparator<Map.Entry<String, String>>() {
            @Override
            public int compare(Map.Entry<String, String> e1, Map.Entry<String, String> e2) {
                String v1 = e1.getValue();
                String v2 = e2.getValue();
                return v2.compareTo(v1);
            }
        };
        List<Map.Entry<String, String>> listOfEntries = new ArrayList<Map.Entry<String, String>>(unsortedMap.entrySet());

        Collections.sort(listOfEntries, valueComparator);
        System.out.println(listOfEntries);



//        task3
//        int arr[] = {12, 11, 13, 5, 6, 7};
//        int n = arr.length;
//
//        Task3HeapSort ob = new Task3HeapSort();
//        ob.sort(arr);
//
//        System.out.println("Sorted array is");
//        Task3HeapSort.printArray(arr);
    }

}
