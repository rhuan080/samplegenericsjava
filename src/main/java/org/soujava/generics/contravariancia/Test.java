package org.soujava.generics.contravariancia;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args){

        System.out.println("############## Teste de Contravariância ################");

        // Adicionando um tipo menos específico (Pessoa)
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(Pessoa.of(21));
        pessoas.add(Pessoa.of(23));
        pessoas.add(Pessoa.of(25));
        imprimirLista(pessoas);

        System.out.println("--------------------------------------------------------");

        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(Funcionario.of(21));
        funcionarios.add(Funcionario.of(23));
        funcionarios.add(Funcionario.of(25));
        imprimirLista(funcionarios);

        System.out.println("--------------------------------------------------------");

        List<Gerente> gerentes = new ArrayList<>();
        gerentes.add(Gerente.of(30));
        gerentes.add(Gerente.of(35));
        gerentes.add(Gerente.of(40));
        //imprimirLista(gerentes);// Ao ser descomentada, esta linha deverá gerar um erro de compilação, pois passa
        // um objeto mais específico, o que não é permitido na contravariância.


    }

    public static void imprimirLista(List<? super Funcionario> list){

        list.stream().forEach(item->{
            System.out.println("Tipo do objeto:"+ item.getClass());
            System.out.println("Idade:"+ ((item instanceof Pessoa)? ((Pessoa)item).getIdade():""));

        });
    }
}
