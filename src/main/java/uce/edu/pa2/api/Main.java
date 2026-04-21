package uce.edu.pa2.api;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;

@QuarkusMain
public class Main {
    public static void main(String... args) {

        Quarkus.run(App.class, args);

    }
    public static class App implements QuarkusApplication{

        @Inject
        private AmbitoAplicacion ambitoAplicacion;
        @Inject
        private AmbitoRequest ambitoRequest;
        @Inject
        private AmbitoAplicacion ambitoDepend;
        @Inject
        private AmbitoInject ambitoInyect;
        @Inject
        private ClaseIntermedia claseIntermedia;
        @Inject
        private AmbitoSingleton ambitoSingleton;

        @Override
        public int run(String... args) throws Exception {

            System.out.println(this.ambitoAplicacion.incrementar());
            System.out.println(this.ambitoAplicacion.incrementar());
            System.out.println(this.ambitoAplicacion.incrementar());

            int valor = this.ambitoAplicacion.incrementar();

            this.claseIntermedia.imprimirObjetoValor();
            
            System.out.println("el valor final es: "+ valor);

            System.out.println("------------AMBITO__REQUEST----------");
            /*
            System.out.println(this.ambitoRequest.incrementar3());
            System.out.println(this.ambitoRequest.incrementar3());
            System.out.println(this.ambitoRequest.incrementar3());
            */

            System.out.println("------------AMBITO__DEPENDENT----------");
            System.out.println(this.ambitoInyect.incrementar2());
            System.out.println(this.ambitoInyect.incrementar2());
            System.out.println(this.ambitoInyect.incrementar2());

            this.claseIntermedia.imprimirObjetoValorInject();


            System.out.println("------------AMBITO__SINGELTON----------");
            System.out.println(this.ambitoSingleton.incrementar1());
            System.out.println(this.ambitoSingleton.incrementar1());
            System.out.println(this.ambitoSingleton.incrementar1());
            
            this.claseIntermedia.imprimirObjetoValorSingleton();


            return 0;
        }
    }
}

