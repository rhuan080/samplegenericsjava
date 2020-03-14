package org.soujava.generics.covariancia;

public class Test {

    public static void main (String[] args){

        System.out.println("############## Teste de Covariância ################");

        Pessoa pessoa = new Pessoa();
        pessoa.setIdade( 15 );
        printIdade(pessoa);

        System.out.println(" ------------------------------ ");

        Funcionario funcionario = new Funcionario();
        funcionario.setIdade(25);
        printIdade(funcionario);

        System.out.println(" ------------------------------ ");

        Socio socio = new Socio();
        socio.setIdade(25);
        printIdade(socio);

    }

    public static void printIdade( Pessoa pessoa){
        System.out.println(pessoa.getClass().getName());
        System.out.println("Idade :" + pessoa.getIdade());
    }
}
