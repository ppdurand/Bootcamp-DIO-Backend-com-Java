package edu.PedroDurand;

public class Main {
    public static void main(String[] args) {
        NumberList list = new NumberList();

        list.addNumber(4);
        list.addNumber(5);
        list.addNumber(3);
        list.addNumber(9);
        list.addNumber(5);
        list.addNumber(2);

        System.out.println(list.findHigherNumber());
        System.out.println(list.fingLowestNumber());
        System.out.println(list.calculateAmount());
        System.out.println(list.showNumbers());

    }
}