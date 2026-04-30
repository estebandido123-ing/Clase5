package uce.edu.pa2.api.clase9;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;


@ApplicationScoped

public class ProcesadorVentaServiceTiempo {


    @Inject
    private EstadisticasVentasGlobales estadisticasVentasGlobales;
 
    @MedirTiempo // SE va a ejceutar antes del metodo el interceptor
    //todo lo que este arriba de context.proced
    @Log
   
    public void procesar(Venta venta) {


        System.out.println("Procesado el pedido ");

 
        System.out.println("Procesado el pedido ");
 
        try {
            Thread.sleep(100);
 
        } catch (Exception e) {
 
        }
 
        this.estadisticasVentasGlobales.registrarVenta(venta.getTotal());
        System.out.println("FINAL DEL PEDIDO ");
       
        //HITS.REPROCESAR NO SE VA A EJECUTAR PQ ES UNA LLAMDA INTERNA
        //this.reProcesar(venta);
    }
 
    @MedirTiempo
    public void reProcesar(Venta venta) {
 
        System.out.println("Reprocesado el pedido ");
 
        try {
            Thread.sleep(250);
 
        } catch (Exception e) {
 
        }
 
        this.estadisticasVentasGlobales.registrarVenta(venta.getTotal());
 
        System.out.println("Finalizando el re proceso");
    }
 
 
}