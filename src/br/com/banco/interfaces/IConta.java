package br.com.banco.interfaces;

import br.com.banco.model.Conta;

public interface IConta {
    void sacar(double valor);

    void depositar(double valor);

    void transferir(double valor, Conta contaDestino);

    void imprimirExtrato();
}
