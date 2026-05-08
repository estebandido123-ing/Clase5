package src.main.java.uce.edu.pa2.api.Deber4;

import jakarta.annotation.Priority;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@Priority(2)
public class PreparadorAccesos implements PreparadorEstancia {
    @Override
    public void preparar(Reserva reserva) {
        System.out.println(" 2. [Preparación] Configurando acceso a la página web y llaves.");
        reserva.agregarTarea("Llaves digitales enviadas");
    }
}