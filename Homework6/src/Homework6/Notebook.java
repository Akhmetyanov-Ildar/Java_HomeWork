package Homework6;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;

public class Notebook {
    String name;
    int price;
    int operativeMemory;
    int hardDiskvolume;


    public Notebook(String name, int price, int operativeMemory, int hardDiskvolume) {
        this.name = name;
        this.price = price;
        this.operativeMemory = operativeMemory;
        this.hardDiskvolume = hardDiskvolume;

    }

    @Override
    public String toString() {
       return "Notebook name: " + name + ", price: " + price + ", operative memory: " + operativeMemory +
                ", hard disk volume: " + hardDiskvolume;
    }





}
