package edu.PedroDurand.conta;

import edu.PedroDurand.Cliente;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente, double saldo, int agencia, int numero) {
        super(cliente, saldo, agencia, numero);
    }

    @Override
    public void extratoBase() {
        System.out.println("=== Extrato Conta Poupança ===");
        super.extratoBase();
    }
}
