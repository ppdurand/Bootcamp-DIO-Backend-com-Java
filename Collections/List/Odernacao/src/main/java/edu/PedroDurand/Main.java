package edu.PedroDurand;

public class Main {
    public static void main(String[] args) {

        OrdenacaoNumeros  ordenacaoNumeros = new OrdenacaoNumeros();

        ordenacaoNumeros.addNumber(7);
        ordenacaoNumeros.addNumber(2);
        ordenacaoNumeros.addNumber(11);
        ordenacaoNumeros.addNumber(9);
        ordenacaoNumeros.addNumber(6);
        ordenacaoNumeros.addNumber(3);
        ordenacaoNumeros.addNumber(5);

        System.out.println(ordenacaoNumeros.ascendingOrder());
        System.out.println(ordenacaoNumeros.descendingOrder());

    }
}