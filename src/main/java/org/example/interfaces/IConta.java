package org.example.interfaces;

import org.example.entidades.Conta;

import java.lang.module.Configuration;

public interface IConta {

    void sacar(double valor);

    void depositar(double valor);

    void transferir(double valor, IConta contaDestino);

    void imprimirExtrato();
}
