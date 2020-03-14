package org.soujava.generics.invariancia;



public class Test {

    public static void main (String[] args){

        System.out.println("############## Teste de Invariância ################");

        Pessoa pessoa = new Pessoa();
        pessoa.setIdade( 15 );
        printIdade(pessoa);

        System.out.println(" ------------------------------ ");

        Funcionario funcionario = new Funcionario();
        funcionario.setIdade(25);
        printIdade(funcionario);

        System.out.println(" ------------------------------ ");
        Socio socio = new Socio();
        socio.setIdade((Number)30);// Vai mudar o estado do objeto. idade = 30
        socio.setIdade((Integer)65); // NÃO vai mudar o estado do objeto.
        printIdade(socio);

    }

    public static void printIdade( Pessoa pessoa){
        System.out.println(pessoa.getClass().getName());
        System.out.println("Idade :" + pessoa.getIdade());
    }
}
