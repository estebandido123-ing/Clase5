package src.main.java.uce.edu.pa2.api.Deber4;

import jakarta.annotation.Priority;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@Priority(1)
public class ValidadorIdentidad implements ValidadorReserva {
    @Override
    public boolean validar(Reserva reserva) {
        System.out.println(" 1. [Validación] Verificando identidad del huésped...");
        return reserva.getHuesped() != null && !reserva.getHuesped().trim().isEmpty();
    }
}