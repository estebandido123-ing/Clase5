package src.main.java.uce.edu.pa2.api.Deber3;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ImpuestoLujo implements Impuesto {

    @Override
    public double aplicar(double valor) {
        System.out.println("Aplicando Impuesto al Lujo (15%) = " + valor);
        double valorAAgregar = valor * 0.15;
        return valor + valorAAgregar;
    }
}
