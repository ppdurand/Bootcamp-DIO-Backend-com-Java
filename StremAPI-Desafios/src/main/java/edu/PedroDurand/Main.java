package edu.PedroDurand;

import java.awt.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        //Desafio 1 - Mostre a lista na ordem numérica:
        System.out.println(numeros.stream().sorted().collect(Collectors.toList()));

        //Desafio 2 - Imprima a soma dos números pares da lista:
        System.out.println(numeros.stream().filter(n -> n % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum());
        //Desafio 3 - Verifique se todos os números da lista são positivos:
        System.out.println(numeros.stream().allMatch(n -> n > 0));

        //Desafio 4 - Remova todos os valores ímpares:
        List<Integer> pares = numeros.stream().filter(n -> n % 2 == 0).toList();

        System.out.println(pares);

        //Desafio 5 - Calcule a média dos números maiores que 5:
        System.out.println(numeros.stream().filter(n -> n > 5).
                mapToInt(Integer::intValue).
                average());

    }
}
