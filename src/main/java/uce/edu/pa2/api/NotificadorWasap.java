package uce.edu.pa2.api;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped

public class NotificadorWasap implements Notificador{

    public void enviar(String destino, String mensaje) {
        System.out.println("Se envia la noti wasapv al numero: " + destino);
        System.out.println("Con el mensaje: " + mensaje);
    }

}
