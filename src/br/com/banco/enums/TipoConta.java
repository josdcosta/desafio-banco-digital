package br.com.banco.enums;

public enum TipoConta {
    POUPANCA("Poupança"),
    CORRENTE("Corrente");

    private final String tipo;

    TipoConta(String valorOpcao){
        tipo = valorOpcao;
    }

    public String getValor(){
        return tipo;
    }
}
