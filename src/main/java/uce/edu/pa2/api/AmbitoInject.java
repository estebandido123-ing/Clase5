package uce.edu.pa2.api;

import jakarta.enterprise.context.Dependent;

@Dependent

public class AmbitoInject {

    private int contador1 =0;

    public int incrementar2(){
        return contador1++;
    }

}
