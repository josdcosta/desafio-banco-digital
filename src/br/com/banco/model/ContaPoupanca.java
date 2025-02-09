package br.com.banco.model;

public non-sealed class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente titular) {
        super.titular = titular;
        titular.adicionarConta(this);    }

    @Override
    public void imprimirExtrato() {
        imprimirExtratoComum();
    }
}
