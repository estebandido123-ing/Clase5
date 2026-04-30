package uce.edu.pa2.api.clase9;

import jakarta.enterprise.context.ApplicationScoped;


@ApplicationScoped

public class InventarioService {


    //@Inject
    public void procesarInventario(Venta venta){
        //Inicio de la venta

        System.out.println("Procesando tiempo de inventario");
        //consultando el stock de cada item
        //consultando en la base datos
        //finaliza venta
        //voy a simular un tiempo de demora
        try {
            Thread.sleep(500);
        } catch (Exception e) {

        }

        //registrar estadisticas
        //this.estadisticasVentasGlobales.registrarVenta(venta.getTotal());
    }

    public void reprocesarInventario(Venta venta){
        //Inicio de la venta

        System.out.println("Procesando pedido");
        //consultando el stock de cada item
        //consultando en la base datos
        //finaliza venta
        //voy a simular un tiempo de demora
        try {
            Thread.sleep(1000);
        } catch (Exception e) {

        }

        //registrar estadisticas
        //this.estadisticasVentasGlobales.registrarVenta(venta.getTotal());
    }


}
