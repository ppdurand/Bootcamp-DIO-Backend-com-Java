package edu.PedroDurand;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        ConjuntoPalavrasUnicas set = new ConjuntoPalavrasUnicas();

        set.adicionarPalavra("Computador");
        set.adicionarPalavra("Mesa");
        set.adicionarPalavra("Ventilador");
        set.adicionarPalavra("Teclado");
        set.adicionarPalavra("Violão");
        set.adicionarPalavra("Mouse");

        set.exibirPalavrasUnicas();

        System.out.println(set.verificarPalavra("Mouse"));

        set.removerPalavra("Mouse");

        System.out.println(set.verificarPalavra("Mouse"));
    }
}