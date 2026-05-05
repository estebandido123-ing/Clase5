package uce.edu.pa2.api.clase9;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped

public class DescuentoSolca implements Descuento{

    @Override
    public double aplicar(double valor) {
        
        double valorADescontar = valor * 0.20;

        return valor - valorADescontar;    
    }

}
