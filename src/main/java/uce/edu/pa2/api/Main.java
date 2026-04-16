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

        private PedidoService pedidoService = CDI.current().select(PedidoService.class).get();

        @Override
        public int run(String... args) throws Exception {

        PedidoService pedidoService = CDI.current().select(PedidoService.class).get();
        

        Pedido pedido1 = new Pedido("Esteban Chachalo", "Coquita", 10, "ea@gmail.com");
        Pedido pedido2 = new Pedido("John Cordova", "Cola", 200, "Jhon@uce.com");
        Pedido pedido3 = new Pedido("Esteban", "hhh", 2.50, "EA@GM");
       
        //2. Service loctor (lookup)


        pedidoService.registrar(pedido1);
        pedidoService.registrar(pedido2);
        pedidoService.registrar(pedido3);
        


            return 0;
        }
    }
}

