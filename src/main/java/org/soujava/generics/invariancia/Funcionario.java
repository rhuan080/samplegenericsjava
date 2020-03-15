package org.soujava.generics.invariancia;

public class Funcionario extends Pessoa {

    // Testando a invariãncia no parâmetro do método. Em uma sobrescrita de método os parametros só suportam a propriedade
    // de invariância, ou seja, se o tipo do parametro for alterado não haverá uma sobrescrita, mas sim uma
    // sobrecarga de método.
    @Override
    public void setIdade(Number idade){

        super.setIdade(idade);

    }
}
