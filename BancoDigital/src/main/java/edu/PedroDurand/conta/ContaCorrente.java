package edu.PedroDurand.conta;

import edu.PedroDurand.Cliente;


public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente, double saldo, int agencia, int numero) {
        super(cliente, saldo, agencia, numero);
    }

    @Override
    public void extratoBase() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.extratoBase();
    }

}

