package org.soujava.generics.covariancia;

public class Socio extends Pessoa {

    // Se este metodo for descomentado ele dará erro de compilação por tentar sobreescrever um método utilizando um tipo
    // menos especifico do que o tipo declarado na super classe.
   /* @Override
    public Object getIdade(){
        return super.idade;
    }*/
}
