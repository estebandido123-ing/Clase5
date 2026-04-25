package src.main.java.uce.edu.pa2.api.DEBER2;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped

//@Dependent

public class ProcesadorVentaService1 {
    @Inject
    private EstadisticasVentasGlobales estadisticasVentasGlobales1;

    @Inject//aqui, como inyecto TrakingVenta se crea un objeto
    private TrakingVenta trakingVenta1;

    public void procesar1(Venta venta){
        this.trakingVenta1.iniciar();
        //Inicio de la venta

        System.out.println("Procesando pedido");
        //consultando el stock de cada item
        //consultando en la base datos
        //finaliza venta
        //voy a simular un tiempo de demora
        try {
            Thread.sleep(100);
        } catch (Exception e) {

        }

        this.trakingVenta1.finalizar();

        //registrar estadisticas
        this.estadisticasVentasGlobales1.registrarVenta(venta.getTotal());
    }

}
