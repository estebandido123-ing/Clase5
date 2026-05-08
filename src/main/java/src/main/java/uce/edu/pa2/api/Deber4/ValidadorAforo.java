package src.main.java.uce.edu.pa2.api.Deber4;

import jakarta.annotation.Priority;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@Priority(2)
public class ValidadorAforo implements ValidadorReserva {
    @Override
    public boolean validar(Reserva reserva) {
        System.out.println(" 2. [Validación] Comprobando que el aforo no supere el límite (Máx 4)...");
        // Si hay más de 4 personas, la validación falla y retorna false
        return reserva.getNumeroPersonas() > 0 && reserva.getNumeroPersonas() <= 4;
    }
}
