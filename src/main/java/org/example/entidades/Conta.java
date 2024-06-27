package org.example.entidades;

import org.example.interfaces.IConta;

public abstract class Conta implements IConta {

    protected int agencia;
    protected int numero;

    protected double saldo;

    protected Cliente cliente;

    private static final int AGENCIA_PADRAO = 1;

    private static int SEQUENCIAL = 0;

    public Conta(Cliente cliente){
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, IConta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("extrato da conta: " + AGENCIA_PADRAO + numero );
        System.out.println("Titular: " + cliente.getName());
        System.out.println("Saldo:" + saldo);
    }
}
