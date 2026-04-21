package uce.edu.pa2.api;


import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped

public class AmbitoSingleton {
    private int contador =0;

    public int incrementar1(){
        return contador++;
    }

}
