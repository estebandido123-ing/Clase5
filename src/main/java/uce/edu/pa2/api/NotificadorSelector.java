package uce.edu.pa2.api;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class NotificadorSelector {

    private final NotificadorMail mail;
    private final NotificadorSMS sms;
    private final NotificadorWasap wasa;

    // Inyección de dependencias mediante el constructor
    @Inject
    public NotificadorSelector(NotificadorMail mail, NotificadorSMS sms, NotificadorWasap wasa) {
        this.mail = mail;
        this.sms = sms;
        this.wasa = wasa;
    }

    public Notificador seleccionar(double total) {
        if (total > 120) {
            return mail;
        } else if (total < 50) {
            return wasa;
        } else {
            // Si no es mayor a 120 ni menor a 50, lógicamente está entre 50 y 120
            return sms;
        }
    }
}
