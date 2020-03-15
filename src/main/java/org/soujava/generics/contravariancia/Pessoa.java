package org.soujava.generics.contravariancia;

public class Pessoa {

    private Number idade;

    public Number getIdade() {
        return idade;
    }

    public void setIdade( Number idade){
        this.idade = idade;
    }

    public static Pessoa of (Number idade){
        Pessoa pessoa = new Pessoa();
        pessoa.setIdade(idade);
        return pessoa;
    }
}
