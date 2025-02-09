package br.com.banco.model;

public non-sealed class ContaCorrente extends Conta {

    public ContaCorrente(Cliente titular) {
        super.titular = titular;
        titular.adicionarConta(this);
    }

    @Override
    public void imprimirExtrato() {
        imprimirExtratoComum();
    }
}
