package com.edu.uce.negocio;

public class PedidoService {

    //Dependencias de pedidoService
    //esas gestiones de dependencias ya no lo vamos a contener si no un 
    //IoC

    //cuando el pedido sea mayor a 100 se envie la notificacion
    //pero menor o igual a 100 una notificacion sms
    private NotificadorEmail n1 = new NotificadorEmail();
    private NotificadorSMS n2 = new NotificadorSMS();

    public void registrar(Pedido pedido){

        System.out.println("Registrando pedido...");
        System.out.println("Cliente: " + pedido.getCliente());
        System.out.println("Total: " + pedido.getTotal());
        System.out.println("¡Guardando en la base de datos!");

         if(pedido.getTotal() > 100){
            n1 = new NotificadorEmail();
            n1.enviar(pedido.getCorreo(), " Se ha creado un pedido para ser atendido¡");
         }else{
             n2 = new NotificadorSMS();
             n2.enviar(pedido.getSms(), " Se ha creado un pedido para ser atendido¡");
         }
    }
}
