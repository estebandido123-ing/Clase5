package uce.edu.pa2.api;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PagoTarjetaCredito implements PagoEstrategia {

    @Override
    public void realizar(double valor) {
        System.out.println("Presenta la pantalla para datos de tarjeta");
        System.out.println("Realizando cobro de tarjeta por valor: $" + valor);
    }
}