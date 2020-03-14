package org.soujava.generics.invariancia;

public class Socio extends Pessoa {

    // Neste caso estamos simulando um tentativa erronea de sobrescrita de método e com isso vamos ter
    // uma sobrecarga de método.
    //@Override //Desconmetar esta anotação causará um erro de compilação, pois não há uma sobreescrita de método.
    public void setIdade(Integer idade){

        // Propositalmente este médodo não fará nada e a chamada dele não mudará o estado do objeto.

    }
}
