package Seminar1OOP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Product> products = new ArrayList<Product>(
                Arrays.asList(
                        new Product("coffe", 25.5),
                        new Product("mars", 30.7),
                        new Product("bountee", 45.3)
                )
        );

//        VendingMachine vendingMachine = new VendingMachine(products);
//        String key = "bountee";
//        System.out.println(vendingMachine.getProductByName(key));


        List<Product> bottle = new ArrayList<Product>(
                Arrays.asList(
                        new Bottle("coca", 1.00, 5.0),
                        new Bottle("mars", 30.7, 3.0),
                        new Bottle("bountee", 45.3, 7.0)
                )
        );

//        VendingMachine botlleMachine = new BottleMachine(bottle);
//
//        String keyBottle = "coca";
//        System.out.println(botlleMachine.getProductByName(keyBottle));

        List<Product> hotdrink = new ArrayList<Product>(
                Arrays.asList(
                        new HotDrink("coffee", 25.0, 0.5, 70),
                        new HotDrink("tea", 35.0, 1.5, 85),
                        new HotDrink("hot chokolate", 5.0, 0.2, 90),
                        new HotDrink("soup", 2.0, 3.5, 100)
                )
        );

        HotDrinkMachine hmMachine = new HotDrinkMachine(hotdrink);
        System.out.println(hmMachine.getProduct("coffee", 0.5, 70));

    }


}
