package src.main.java.uce.edu.pa2.api.DEBER2;

import jakarta.enterprise.context.Dependent;

@Dependent
public class GeneradorTickets {
    private int numeroTicket = 0;

    public int emitirTicket() {
        return ++numeroTicket;
    }
}
