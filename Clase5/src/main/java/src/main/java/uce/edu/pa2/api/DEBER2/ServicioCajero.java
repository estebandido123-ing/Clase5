package src.main.java.uce.edu.pa2.api.DEBER2;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ServicioCajero {

    @Inject
    private InventarioGlobal inventario;
    
    @Inject
    private GeneradorTickets tickets;
    
    @Inject
    private RegistroAuditoria auditoria;

    public void simularVenta() {
        System.out.println("  [Cajero] Stock actual: " + this.inventario.registrarProducto());
        System.out.println("  [Cajero] Ticket emitido #: " + this.tickets.emitirTicket());
        System.out.println("  [Cajero] Auditoría global: " + this.auditoria.registrarOperacion());
    }
}