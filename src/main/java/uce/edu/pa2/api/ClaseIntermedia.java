package uce.edu.pa2.api;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
 
@ApplicationScoped

public class ClaseIntermedia {

    @Inject
    private AmbitoAplicacion ambitoAplicacion;
    @Inject
    private AmbitoAplicacion ambitoInyect;
    @Inject
    private AmbitoAplicacion ambitoSingleton;

 
    public void imprimirObjetoValor(){
        System.out.println(ambitoAplicacion);
        System.out.println(this.ambitoAplicacion.incrementar());  
    }

    public void imprimirObjetoValorInject(){
        System.out.println(ambitoInyect);
        System.out.println(this.ambitoInyect.incrementar());

    }

    public void imprimirObjetoValorSingleton(){
        System.out.println(ambitoSingleton);
        System.out.println(this.ambitoSingleton.incrementar());

    }

}
