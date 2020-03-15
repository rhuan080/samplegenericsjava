package org.soujava.generics.contravariancia;

public class Gerente extends Funcionario{

    public static Gerente of (Number idade){
        Gerente gerente = new Gerente();
        gerente.setIdade(idade);
        return gerente;
    }
}
