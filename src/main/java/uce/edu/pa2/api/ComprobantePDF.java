package uce.edu.pa2.api;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ComprobantePDF implements Comprobante {
    @Override
    public void generar(Pedido pedido) {
        System.out.println("Generando Factura PDF y enviando al destino: " + pedido.getDestino());
    }
}