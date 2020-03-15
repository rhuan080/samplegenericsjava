package org.soujava.generics.covariancia;

import java.lang.reflect.InvocationTargetException;


public class Fabrica {

    public Object construir(Class<? extends Pessoa> type, Number idade) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //Como o tipo é genérico o construtor é capturado usando reflaction e uma nova instância é criada. Como aqui
        // utiliza a covariância, podemos ter certeza que os objetos criados aqui serão do tipo Pessoa ou mais
        // específicos, e nunca menos específicos.
        Pessoa objeto = type.getDeclaredConstructor().newInstance();
        objeto.setIdade(idade);
        return objeto;
    }


}
