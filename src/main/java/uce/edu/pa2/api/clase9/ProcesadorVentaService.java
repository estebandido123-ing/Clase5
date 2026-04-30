package uce.edu.pa2.api.clase9;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped

public class ProcesadorVentaService {
    //@Inject
    //private EstadisticasVentasGlobales estadisticasVentasGlobales;

    @Inject //aqui, como inyecto TrakingVenta se crea un objeto
    private TrakingVenta trakingVenta;

    public void procesar(Venta venta){
        this.trakingVenta.iniciar();
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

        this.trakingVenta.finalizar();

        //registrar estadisticas
        //this.estadisticasVentasGlobales.registrarVenta(venta.getTotal());
    }

}
