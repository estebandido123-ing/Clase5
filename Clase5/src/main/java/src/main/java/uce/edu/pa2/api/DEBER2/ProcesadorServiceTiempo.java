package src.main.java.uce.edu.pa2.api.DEBER2;

import jakarta.enterprise.context.ApplicationScoped;


@ApplicationScoped

public class ProcesadorServiceTiempo {


    //@Inject
    public void procesar(Venta venta){
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

        //registrar estadisticas
        //this.estadisticasVentasGlobales.registrarVenta(venta.getTotal());
    }

    public void reprocesar(Venta venta){
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

        //registrar estadisticas
        //this.estadisticasVentasGlobales.registrarVenta(venta.getTotal());
    }


}
