package src.main.java.uce.edu.pa2.api.Deber3;


import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Instance;
import jakarta.inject.Inject;

@ApplicationScoped
public class ProcesadorCompraService {

    @Inject
    private Instance<Descuento> descuentos;

    @Inject
    private Instance<Impuesto> impuestos;

    public void procesarCompra (Compra compra){
        double total = compra.getSubtotal();
        /*   
        for ( Descuento des : descuentos){
            total = des.aplicar(total);
        }
        compra.setTotal(total);
        System.out.println("Su valor a pagar es: " + compra.getTotal());
        */

        System.out.println("--- INICIANDO PROCESAMIENTO DE COMPRA ---");
        System.out.println("Subtotal inicial: $" + total);

        // 1. Procesamos los descuentos (Restan valor)
        for (Descuento des : descuentos){
            total = des.aplicar(total);
        }

        System.out.println("Subtotal tras aplicar descuentos: $" + total);

        // 2. Procesamos los impuestos (Suman valor)
        for (Impuesto imp : impuestos){
            total = imp.aplicar(total);
        }

        // Guardamos el resultado 
        compra.setTotal(total);

        System.out.println("-----------------------------------------");
        System.out.println("Su valor FINAL a pagar es: $" + compra.getTotal());
        System.out.println("--- PROCESAMIENTO DE COMPRA FINALIZADO ---");
        System.out.println("");



     
    }

        

}
