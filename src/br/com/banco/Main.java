package br.com.banco;

import br.com.banco.model.*;

public class Main {
    public static void main(String[] args) {

        Banco bancoBradesco = new Banco("Bradesco");
        Cliente cliente1 = new Cliente("cliente1", 232012032, bancoBradesco);
        Cliente cliente2 = new Cliente("cliente2", 232012432, bancoBradesco);
        Conta c1ContaPoupanca = new ContaPoupanca(cliente1);
        Conta c1ContaCorrente = new ContaCorrente(cliente1);
        Conta c2ContaCorrente = new ContaCorrente(cliente2);

        c1ContaPoupanca.depositar(100);
        c1ContaCorrente.depositar(100);
        c1ContaCorrente.transferir(50, c1ContaPoupanca);
        c1ContaCorrente.transferir(40, c2ContaCorrente);

        System.out.println(bancoBradesco.getClientes());
        System.out.println(cliente1.getContas());
        System.out.println(cliente2.getContas());

    }
}