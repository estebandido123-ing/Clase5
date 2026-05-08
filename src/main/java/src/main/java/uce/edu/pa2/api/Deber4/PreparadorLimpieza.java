package src.main.java.uce.edu.pa2.api.Deber4;

import jakarta.annotation.Priority;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@Priority(1)
public class PreparadorLimpieza implements PreparadorEstancia {
    @Override
    public void preparar(Reserva reserva) {
        System.out.println(" 1. [Preparación] Agendando limpieza web para la habitación.");
        reserva.agregarTarea("Limpieza pre-checkin lista");
    }
}