package org.soujava.generics.covariancia;

public class Funcionario extends Pessoa {

    // Testando a covariância no retorno do método.
    @Override
    public Integer getIdade(){
        return (Integer) super.getIdade();
    }
}
