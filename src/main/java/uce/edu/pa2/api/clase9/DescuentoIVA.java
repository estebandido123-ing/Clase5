package uce.edu.pa2.api.clase9;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped

public class DescuentoIVA implements Descuento{



    @Override
    public double aplicar(double valor) {
        System.out.println("Aplicando IVA");

        double valorADescontar = valor * 0.15;

        return valor - valorADescontar;
    }


    

}
