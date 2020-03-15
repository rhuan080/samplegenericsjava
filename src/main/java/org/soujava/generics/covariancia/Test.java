package org.soujava.generics.covariancia;


public class Test {

    public static void main(String[] args){
        System.out.println("#################### TESTE DE COVARIÂNCIA ########################");

        System.out.println("--------------------- Primeiro teste ----------------------------");
        primeiroTeste();

        System.out.println("-------------- Segundo teste (com fábrica) ----------------------");
        segundoTeste();

    }

    public static void primeiroTeste(){

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

    public static void segundoTeste(){

        //Utilizando uma fabrica genérica para criar as instancias de Pessoa, Funcionario e Socio.
        Fabrica fabrica = new Fabrica();

        try {
            printIdade((Pessoa) fabrica.construir(Pessoa.class,15));

            System.out.println(" ------------------------------ ");

            printIdade((Funcionario) fabrica.construir(Funcionario.class,25));

            System.out.println(" ------------------------------ ");

            printIdade((Socio) fabrica.construir(Socio.class,35));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void printIdade( Pessoa pessoa){
        System.out.println(pessoa.getClass().getName());
        System.out.println("Idade :" + pessoa.getIdade());
    }
}
