package br.com.banco.model;

import br.com.banco.interfaces.IConta;

public abstract sealed class Conta implements IConta permits ContaCorrente, ContaPoupanca {

    protected int agencia;
    protected int conta;
    protected double saldo;
    private static int SEQUENCIAL = 1;
    private static int AGENCIA_PADRAO = 1;
    protected Cliente titular;

    public Conta() {
        this.agencia = AGENCIA_PADRAO;
        this.conta = SEQUENCIAL++;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getConta() {
        return conta;
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
    public void transferir(double valor, Conta contaDestino) {
        if(!this.titular.equals(contaDestino.titular)) {
            this.sacar(valor);
            this.sacar(valor*0.01);
            contaDestino.depositar(valor);
        } else {
            this.sacar(valor);
            contaDestino.depositar(valor);
        }
    }

    protected void imprimirExtratoComum() {
        System.out.printf("Titular da Banco.Banco.Conta: %s\nCPF: %d", titular.getNome(), titular.getCpf());
        System.out.println();
        System.out.printf("=".repeat(10)+"Agencia:%d | Banco.Banco.Conta:%d"+"=".repeat(10), agencia, conta);
        System.out.println();
        System.out.printf("Seu saldo é: %.2f", saldo);
        System.out.println();
    }

    @Override
    public String toString() {
        return "Conta{" +
                "agencia=" + agencia +
                ", conta=" + conta +
                ", saldo=" + saldo +
                '}';
    }
}
