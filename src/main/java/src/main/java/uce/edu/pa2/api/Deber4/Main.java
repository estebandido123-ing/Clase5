package src.main.java.uce.edu.pa2.api.Deber4;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;

@QuarkusMain
public class Main {
    
    public static void main(String... args) {
        Quarkus.run(App.class, args);
    }

    public static class App implements QuarkusApplication {
        
        @Inject
        private ProcesadorReservasService procesador;

        @Override
        public int run(String... args) throws Exception {
            
            // CASO 1: Reserva válida (2 personas)
            Reserva reserva1 = new Reserva("Esteban", 2);
            procesador.procesarReserva(reserva1);

            // CASO 2: Reserva inválida (6 personas excede el aforo)
            Reserva reserva2 = new Reserva("Abel", 6);
            procesador.procesarReserva(reserva2);

            return 0;        
        }
    }
}