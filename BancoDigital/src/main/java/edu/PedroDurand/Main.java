package edu.PedroDurand;

import edu.PedroDurand.conta.Conta;
import edu.PedroDurand.conta.ContaCorrente;
import edu.PedroDurand.conta.ContaPoupanca;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Conta conta1 = new ContaPoupanca(new Cliente(1, "Pedro"),
                1000, 1, 1);
        Conta conta2 = new ContaCorrente(new Cliente(2, "joao"),
                1100, 1, 2);

        conta1.extratoBase();
        conta2.extratoBase();

        conta1.depositar(140);
        conta2.sacar(100);

        conta1.transferir(conta2, 500);

        conta1.extratoBase();
        conta2.extratoBase();

        Banco banco = new Banco("Nubank");
        banco.setContas(Arrays.asList(conta1, conta2));
        banco.imprimirClientes();

    }
}