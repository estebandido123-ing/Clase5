package src.main.java.uce.edu.pa2.api.Deber3;

import jakarta.annotation.Priority;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@Priority(2)

public class ImpuestoICE implements Impuesto {

    @Override
    public double aplicar(double valor) {
        System.out.println("Aplicando Impuesto ICE (10%) = " + valor);
        // El impuesto suma al valor total
        double valorAAgregar = valor * 0.10;
        return valor + valorAAgregar;
    }
}
