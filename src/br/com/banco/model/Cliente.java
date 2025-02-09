package br.com.banco.model;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private int cpf;
    private List<Conta> contas;


    public Cliente(String nome, int cpf, Banco banco) {
        this.nome = nome;
        this.cpf = cpf;
        this.contas = new ArrayList<>();
        banco.adicionarCliente(this);
    }

    void adicionarConta(Conta conta){
        this.contas.add(conta);
    }

    public String getNome() {
        return nome;
    }

    public int getCpf() {
        return cpf;
    }

    public List<Conta> getContas() {
        return contas;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", cpf=" + cpf +
                ", contas=" + contas +
                '}';
    }
}
