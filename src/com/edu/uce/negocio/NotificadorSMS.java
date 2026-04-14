package com.edu.uce.negocio;

public class NotificadorSMS {


    
    public void enviar(String sms, String mensaje){
        System.out.println("Se envia un sms al numero: " + sms);
        System.out.println("Con el mensaje: " + mensaje);
    }
}
