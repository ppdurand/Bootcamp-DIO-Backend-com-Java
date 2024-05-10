package edu.PedroDurand;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> items;

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    public void addItem(String name, double price, int amount){
        items.add(new Item(name, price, amount));
        System.out.println(name + " adicionado na lista");
    }

    public void removeItem(String name){
        List<Item> removeItemsList = new ArrayList<>();
        for(Item i : items){
            if(i.getName().equalsIgnoreCase(name)){
                removeItemsList.add(i);
            }
        }
        items.removeAll(removeItemsList);
    }

    public double calculateTotalPrice(){
        double totalPrice = 0;
        for(Item i : items){
            totalPrice += (i.getPrice() * i.getAmount());
        }

        return totalPrice;
    }

    public void showItems(){
        for (Item i : items){
            System.out.println("Nome: " + i.getName());
            System.out.println("Preço: " + i.getPrice());
            System.out.println("Quantidade: " + i.getAmount());
            System.out.println(" ");
        }
    }



    public List<Item> getItems() {
        return items;
    }
}
