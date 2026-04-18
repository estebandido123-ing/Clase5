package uce.edu.pa2.api;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.enterprise.inject.spi.CDI;
import jakarta.inject.Inject;

@QuarkusMain
public class Main {

    

    public static void main(String... args) {

        Quarkus.run(App.class, args);

    }


    public static class App implements QuarkusApplication{
        //@Inject
        //private PedidoService pedidoService;
        @Inject
        private PedidoService pedidoService2;
        @Inject
        private PagoEfectivo pagoE;
        @Inject
        private PagoTarjetaCredito pagoTc;





        //private PedidoService pedidoService = CDI.current().select(PedidoService.class).get();

        @Override
        public int run(String... args) throws Exception {

        PedidoService pedidoService = CDI.current().select(PedidoService.class).get();


        Pedido pedido = new Pedido("Esteban", "hhh", 50, "EA@GM");
        //this.pedidoService.registrar(pedido, pagoE);

        //Pedido pedido1 = new Pedido("Esteban Chachalo", "Coquita", 10, "ea@gmail.com");
        //Pedido pedido2 = new Pedido("John Cordova", "Cola", 200, "Jhon@uce.com");
        Pedido pedido3 = new Pedido("Esteban", "hhh", 2.50, "EA@GM");
        
        

        //2. Service loctor (lookup)


        //pedidoService.registrar(pedido1);
        //pedidoService.registrar(pedido2);
        //pedidoService.registrar(pedido3);


        // Pedido 1: Tiene un destino registrado ("EA@GM") -> Debería generar PDF
        Pedido pedido1 = new Pedido("Esteban", "hhh", 50, "EA@GM");
            
        // Pedido 2: No tiene destino (null o vacío) -> Debería generar Comprobante Físico
        Pedido pedido2 = new Pedido("John Cordova", "Cola", 200, "ggg");

        // Registramos pasando el pedido y la forma de pago deseada
        pedidoService.registrar(pedido1, pagoE);
        pedidoService.registrar(pedido2, pagoTc);

        return 0;
        }
    }
}

