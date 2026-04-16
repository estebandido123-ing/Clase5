package uce.edu.pa2.api;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PedidoService1 {

    public void registrar(Pedido pedido){

        System.out.println("Registrando pedido");
    }

}
