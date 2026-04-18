package uce.edu.pa2.api;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ComprobanteFisico implements Comprobante {
    @Override
    public void generar(Pedido pedido) {
        System.out.println("Generando Comprobante Físico para ser entregado en mano al cliente: " + pedido.getCliente());
    }
}