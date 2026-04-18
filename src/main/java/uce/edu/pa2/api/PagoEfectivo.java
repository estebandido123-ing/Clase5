package uce.edu.pa2.api;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PagoEfectivo implements PagoEstrategia{

    @Override
    public void realizar(double valor) {
        // TODO Auto-generated method stub
        System.out.println("Presenta la pantalla");
        System.out.println("realiando cobro");

    }



}
