package src.main.java.uce.edu.pa2.api.Deber3;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ImpuestoVerde implements Impuesto {

    @Override
    public double aplicar(double valor) {
        System.out.println("Aplicando Impuesto Verde Ambiental (5%) = " + valor);
        double valorAAgregar = valor * 0.05;
        return valor + valorAAgregar;
    }
}
