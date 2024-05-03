package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        try {
            Scanner terminal = new Scanner(System.in);
            System.out.println("Digite o primeiro parâmetro");
            int parametroUm = terminal.nextInt();
            System.out.println("Digite o segundo parâmetro");
            int parametroDois = terminal.nextInt();

            try {
                contar(parametroUm, parametroDois);
            } catch (ParametrosInvalidosException e) {
                System.out.println(e.getMessage());
            }
        }catch(InputMismatchException e){
            System.out.println("Os valores devem ser números inteiros");
        }

    }
    public static void contar(int parameter1, int parameter2) throws ParametrosInvalidosException {
        if (parameter1 > parameter2){
            throw new ParametrosInvalidosException();
        }

        int contagem = parameter2 - parameter1;
        for(int i = 0; i <= contagem; i++){
            System.out.println("Imprimindo o numero: " + i);
        }
    }
}