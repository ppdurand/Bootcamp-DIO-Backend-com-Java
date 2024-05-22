package edu.PedroDurand.conta;

import edu.PedroDurand.Cliente;

public class Conta implements IConta{

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    private Cliente cliente;
    private double saldo;
    private int agencia;
    private int numero;

    public Conta(Cliente cliente, double saldo, int agencia, int numero) {
        this.cliente = cliente;
        this.saldo = saldo;
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = numero;
    }

    protected Cliente getCliente() {
        return cliente;
    }

    protected double getSaldo() {
        return saldo;
    }

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    protected static int getSEQUENCIAL() {
        return SEQUENCIAL;
    }

    protected int getAgencia() {
        return agencia;
    }

    protected int getNumero() {
        return numero;
    }

    @Override
    public void sacar(double valor) {
        if(valor > getSaldo()){
            throw new RuntimeException("Saldo insuficiente");
        }
        this.setSaldo(this.getSaldo() - valor);
        System.out.println("Valor sacado de " + this.getCliente().getName());
        System.out.println("Saldo Atual: " + getSaldo());


    }

    @Override
    public void depositar(double valor) {
        this.setSaldo(this.getSaldo() +  valor);
        System.out.println("Valor depositado");
        System.out.println("Saldo Atual: " + getSaldo());
    }

    @Override
    public void transferir(IConta destino, double valor) {
        this.sacar(valor);
        destino.depositar(valor);
    }

    @Override
    public void extratoBase() {
        System.out.println(String.format("Titular: %s", this.cliente.getName()));
        System.out.println(String.format("Agencia: %d", this.getAgencia()));
        System.out.println(String.format("Numero: %d", this.getNumero()));
        System.out.println(String.format("Saldo: %.2f", this.getSaldo()));
    }
}
