package edu.PedroDurand;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 11, 15, 30, 45);
        MetodosAux metodosAux = new MetodosAux();

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

        //Desafio 6 - Verificar se a lista contém algum número maior que 10:
        System.out.println(numeros.stream().anyMatch(n -> n > 10));

        //Desafio 7 - Encontrar o segundo número maior da lista:
        System.out.println(numeros.stream().distinct()
                .sorted((a, b) -> b - a)
                .skip(1)
                .findFirst());
        //Desafio 8 - Somar os dígitos de todos os números da lista:
        System.out.println(numeros.stream().mapToInt(metodosAux::somaDigitos).sum());

        //Desafio 9 - Verificar se todos os números da lista são distintos (não se repetem):
        System.out.println(numeros.stream().distinct().count() == numeros.size());

        //Desafio 10 - Agrupe os valores ímpares múltiplos de 3 ou de 5:
        System.out.println(numeros.stream().filter(n -> n % 2 != 0).filter(n -> n % 3 == 0 || n % 5 == 0).toList());

        //Desafio 11 - Encontre a soma dos quadrados de todos os números da lista:
        System.out.println(numeros.stream().mapToInt(metodosAux::quadrado).sum());

        //Desafio 12 - Encontre o produto de todos os números da lista:
        System.out.println(numeros.stream().mapToLong(Integer::longValue).reduce((a, b) -> a * b));

        //Desafio 13 - Filtrar os números que estão dentro de um intervalo:
        System.out.println(numeros.stream().filter(n -> n > 5 && n < 10).toList());

        //Desafio 14 - Encontre o maior número primo da lista:
        System.out.println(numeros.stream().filter(metodosAux::primo).max(Integer::compareTo)
                .orElse(null));

        //Desafio 15 - Verifique se a lista contém pelo menos um número negativo:
        System.out.println(numeros.stream().anyMatch(n -> n < 0));

        //Desafio 16 - Agrupe os números em pares e ímpares:
        System.out.println(numeros.stream().filter(n -> n % 2 == 0).toList());
        System.out.println(numeros.stream().filter(n -> n % 2 != 0).toList());

        //Desafio 17 - Filtrar os números primos da lista:
        System.out.println(numeros.stream().filter(metodosAux::primo).distinct().toList());

        //Desafio 18 - Verifique se todos os números da lista são iguais:
        System.out.println(numeros.stream().distinct().count() == 1);

        //Desafio 19 - Encontre a soma dos números divisíveis por 3 e 5:
        System.out.println(numeros.stream().filter(n -> n % 3 == 0 && n % 5 ==0)
                .mapToInt(Integer::intValue)
                .sum());

    }
}
