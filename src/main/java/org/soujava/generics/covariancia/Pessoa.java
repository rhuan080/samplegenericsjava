package org.soujava.generics.covariancia;

public class Pessoa {

    private Number idade;

    private String nome;

    public Number getIdade() {
        return idade;
    }

    public void setIdade( Number idade){
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
