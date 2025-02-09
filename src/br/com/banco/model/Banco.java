package br.com.banco.model;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private List<Cliente> clientes;
    private Conta conta;

    public Banco(String nome) {
        this.nome = nome;
        this.clientes = new ArrayList<>();
    }
    
    public void adicionarCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }

    public String getNome() {
        return nome;
    }

    public List<Cliente> getClientes() {
        return clientes.stream().toList();
    }

    public Conta getConta() {
        return conta;
    }

    @Override
    public String toString() {
        return "Banco{" +
                "nome='" + nome + '\'' +
                ", clientes=" + clientes +
                ", conta=" + conta +
                '}';
    }
}
