package uce.edu.pa2.api;


import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped


public class AmbitoRequest {

    private int contador1 =0;

    public int incrementar3(){
        return ++contador1;
    }

}
