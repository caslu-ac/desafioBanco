package org.example;

import org.example.entidades.Cliente;
import org.example.entidades.Conta;
import org.example.entidades.ContaCorrente;
import org.example.entidades.ContaPoupanca;
import org.example.interfaces.IConta;

public class Main {
    public static void main(String[] args) {

        Cliente caslu = new Cliente();
        caslu.setName("caslu");

        IConta cc = new ContaCorrente(caslu);
        IConta cp = new ContaPoupanca(caslu);

        cc.depositar(100);
        cc.transferir(50, cp);
        cp.imprimirExtrato();
        cc.imprimirExtrato();
        cp.sacar(50);
        cp.imprimirExtrato();

    }
}