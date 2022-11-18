package Seminar1OOP;

import java.util.List;

public class HotDrinkMachine extends VendingMachine {
    public HotDrinkMachine(List<Product> list) {
        super(list);
    }

    public HotDrink getProduct(String name, double volume, int temperature) {
        for (Product drink : super.getList()) {
            HotDrink d = (HotDrink) drink;
            if (d.getName().equals(name) && d.getVolume() == volume && d.getTemperature() == temperature) {
                return d;
            }
        }
        return null;


    }
}


