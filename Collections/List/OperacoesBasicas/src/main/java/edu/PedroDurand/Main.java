package edu.PedroDurand;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       ShoppingCart cart = new ShoppingCart();

       cart.addItem("Tv", 1500, 1);
       cart.addItem("Sofá", 550, 2);
       cart.addItem("Computador", 3700, 1);
       cart.addItem("Cama", 670, 3);
       cart.addItem("Mesa", 300, 2);

       System.out.println(cart.calculateTotalPrice());
       cart.showItems();
       cart.removeItem("Mesa");
       System.out.println(cart.calculateTotalPrice());
       cart.showItems();
    }
}