package edu.pedroDurand;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContaTerminal contaTerminal = new ContaTerminal();

        System.out.print("Por favor, difite o número da conta: ");
        contaTerminal.setNumero(scanner.nextInt());

        System.out.print("Por favor, digite o nome da agência: ");
        contaTerminal.setAgencia(scanner.next());

        System.out.print("Por favor, digite o seu nome: ");
        contaTerminal.setNomeCliente(scanner.next());

        System.out.print("Por favor, digite o saldo da conta: ");
        contaTerminal.setSaldo(scanner.nextDouble());

        System.out.println("Olá " + contaTerminal.getNomeCliente() + ", obrigado por criar uma conta em nosso banco, " +
                "sua agência é " + contaTerminal.getAgencia() + ", conta " + contaTerminal.getNumero() + " e seu saldo "
                + contaTerminal.getSaldo() + " já está disponível para saque.");

    }
}
