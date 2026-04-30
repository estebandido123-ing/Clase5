package uce.edu.pa2.api.clase9;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;

@QuarkusMain
public class MainTienda {
    
    public static void main(String... args) {
        Quarkus.run(App.class, args);
    }

    public static class App implements QuarkusApplication {

    
    @Inject
    private ProcesadorVentaServiceTiempo procesadorServiceTiempo;

    @Inject
    private InventarioService inventarioService;

        @Override
        public int run(String... args) throws Exception {

        Venta venta = new Venta("Esteban", 250);
        this.procesadorServiceTiempo.procesar(venta);
        this.procesadorServiceTiempo.reProcesar(venta);


        Venta venta1 = new Venta("Abel", 500);
        this.inventarioService.procesarInventario(venta1);
        this.inventarioService.reprocesarInventario(venta1);







        //this.estadisticasVentasGlobales.mostrarEstadisticasGlobales();




















            return 0;        
        }
        /* 
        @Inject
        private InventarioGlobal inventario;
        
        @Inject
        private GeneradorTickets tickets;
        
        @Inject
        private RegistroAuditoria auditoria;
        
        @Inject
        private ServicioCajero cajero;

        @Override
        public int run(String... args) throws Exception {

            System.out.println("\n--- 1. SIMULANDO OPERACIONES DESDE EL SISTEMA CENTRAL ---");
            
            System.out.println("Sistema -> Stock: " + this.inventario.registrarProducto());
            System.out.println("Sistema -> Auditoría: " + this.auditoria.registrarOperacion());
            
            System.out.println("Sistema -> Ticket #: " + this.tickets.emitirTicket());
            System.out.println("Sistema -> Ticket #: " + this.tickets.emitirTicket());

            System.out.println("\n--- 2. SIMULANDO OPERACIONES DESDE EL CAJERO ---");
            
            this.cajero.simularVenta();
            this.cajero.simularVenta();

            System.out.println("\n--- 3. OPERACIÓN FINAL EN SISTEMA ---");
            
            System.out.println("Sistema -> Ticket #: " + this.tickets.emitirTicket());
            System.out.println("Sistema -> Stock: " + this.inventario.registrarProducto());

            return 0;
        }*/
    }
}