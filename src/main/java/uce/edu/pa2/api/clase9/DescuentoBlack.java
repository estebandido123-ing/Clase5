package uce.edu.pa2.api.clase9;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped

public class DescuentoBlack implements Descuento{

    @Override
    public double aplicar(double valor) {
        System.out.println("Aplicando Descuento Black");

        double valorADescontar = valor * 0.50;

        return valor - valorADescontar;    
    }


}
