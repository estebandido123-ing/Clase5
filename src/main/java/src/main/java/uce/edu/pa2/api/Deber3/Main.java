package src.main.java.uce.edu.pa2.api.Deber3;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;

@QuarkusMain
public class Main {
    
    public static void main(String... args) {
        Quarkus.run(App.class, args);
    }

    public static class App implements QuarkusApplication {

    
    @Inject
    private ProcesadorCompraService procesadorCompraService;


        @Override
        public int run(String... args) throws Exception {

            Compra compra1 = new Compra("Esteban Chachalo", 150);
            this.procesadorCompraService.procesarCompra(compra1);

            Compra compra2 = new Compra("Esteban Chachalo", 200);
            this.procesadorCompraService.procesarCompra(compra2);

            Compra compra3 = new Compra("Esteban Chachalo", 350);
            this.procesadorCompraService.procesarCompra(compra3);

            Compra compra4 = new Compra("Esteban Chachalo", 400);
            this.procesadorCompraService.procesarCompra(compra4);

            Compra compra5 = new Compra("Esteban Chachalo", 100);
            this.procesadorCompraService.procesarCompra(compra5);

       


            return 0;        
        }
    }
}
