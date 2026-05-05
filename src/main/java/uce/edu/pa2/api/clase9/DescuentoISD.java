package uce.edu.pa2.api.clase9;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped

public class DescuentoISD implements Descuento{

    @Override
    public double aplicar(double valor) {
        System.out.println("Aplicando ISD");
        double valorADesacontar = valor * 0.10;

        return valor - valorADesacontar;
    }

}
