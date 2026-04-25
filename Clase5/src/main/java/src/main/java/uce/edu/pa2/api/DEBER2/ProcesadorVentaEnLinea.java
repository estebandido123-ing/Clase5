package src.main.java.uce.edu.pa2.api.DEBER2;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ProcesadorVentaEnLinea {

    @Inject
    private EstadisticasVentasGlobales estadisticasVentasGlobales2;

    @Inject//aqui, como inyecto TrakingVenta se crea un objeto
    private TrakingVenta trakingVenta2;

    public void procesar2(Venta venta){
        this.trakingVenta2.iniciar();
        //Inicio de la venta

        System.out.println("Procesando pedido en linea");
        //consultando el stock de cada item
        //consultando en la base datos
        //finaliza venta
        //voy a simular un tiempo de demora
        try {
            Thread.sleep(100);
        } catch (Exception e) {

        }

        this.trakingVenta2.finalizar();

        //registrar estadisticas
        this.estadisticasVentasGlobales2.registrarVenta(venta.getTotal());
    }

}
