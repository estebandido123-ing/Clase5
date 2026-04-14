package com.edu.uce.negocio;

public class NotificadorEmail {


    public void enviar(String correo, String mensaje){
        System.out.println("Se envia el mail al correo:" + correo);
        System.out.println("Con el mensaje" + mensaje);
    }
}
