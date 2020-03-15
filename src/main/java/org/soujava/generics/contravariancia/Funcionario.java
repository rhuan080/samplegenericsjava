package org.soujava.generics.contravariancia;

public class Funcionario extends Pessoa {

    private Double salario;

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public static Funcionario of (Number idade){
        Funcionario funcionario = new Funcionario();
        funcionario.setIdade(idade);
        return funcionario;
    }
}
