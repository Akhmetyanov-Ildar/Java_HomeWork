package Homework6;

import java.util.*;

public class Main {
    static HashMap<String, String> laptopProps = new HashMap<>();

    public static void main(String[] args) {

        laptopProps.put("name", "");
        laptopProps.put("price", "");
        laptopProps.put("memory", "");
        laptopProps.put("disk", "");

        Set<Notebook> notebooks = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            notebooks.add(new Notebook("Samsung", 250 * (i + 2), 256 * (i + 1), 256 + (i * 100)));
        }

        for (Notebook n : notebooks) {
            System.out.println(n.toString());

        }
        request();
        equals(notebooks);

    }

    public static void request() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter laptop brand");
        laptopProps.put("name", sc.nextLine());
        System.out.println("Enter max price");
        laptopProps.put("price", sc.nextLine());
        System.out.println("Enter max operative memory");
        laptopProps.put("memory", sc.nextLine());
        System.out.println("Enter max hard drive space");
        laptopProps.put("disk", sc.nextLine());
    }

    public static void equals(Set<Notebook> notebooks) {
        String name = laptopProps.get("name");
        int price = Integer.parseInt(laptopProps.get("price"));
        int memory = Integer.parseInt(laptopProps.get("memory"));
        int disk = Integer.parseInt(laptopProps.get("disk"));
        int count = 0;
        for (Notebook n : notebooks) {
            if (name.equals(n.name) && price >= n.price && memory >= n.operativeMemory && disk >= n.hardDiskvolume) {
                System.out.println(n.toString());
                count++;
            }

        }
        if (count == 0) {
            System.out.println("Cannot find laptop");
        }
    }
}

