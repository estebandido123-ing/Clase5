package src.main.java.uce.edu.pa2.api.Deber4;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Instance;
import jakarta.inject.Inject;

@ApplicationScoped
public class ProcesadorReservasService {

    @Inject
    private Instance<ValidadorReserva> validadores;

    @Inject
    private Instance<PreparadorEstancia> preparadores;

    public void procesarReserva(Reserva reserva) {
        System.out.println("=== INICIANDO PROCESO DE RESERVA ===");
        System.out.println("Huésped: " + reserva.getHuesped() + " | Personas: " + reserva.getNumeroPersonas());

        // 1. FASE DE VALIDACIÓN
        System.out.println("\n--- FASE DE VALIDACIÓN ---");
        for (ValidadorReserva validador : validadores) {
            if (!validador.validar(reserva)) {
                reserva.setAprobada(false); // Rechazamos la reserva
                System.out.println(" [!] Reserva DENEGADA por incumplir reglas.");
                break; // Rompemos el ciclo, ya no validamos más
            }
        }

        // 2. FASE DE PREPARACIÓN se ejecuta si la reserva sigue aprobada
        if (reserva.isAprobada()) {
            System.out.println("\n--- FASE DE PREPARACIÓN ---");
            for (PreparadorEstancia preparador : preparadores) {
                preparador.preparar(reserva);
            }
            System.out.println("\n[EXITO] Reserva web confirmada y preparada.");
            System.out.println("Estado de tareas: " + reserva.getTareasCompletadas());
        }

        System.out.println("====================================\n");
    }
}
