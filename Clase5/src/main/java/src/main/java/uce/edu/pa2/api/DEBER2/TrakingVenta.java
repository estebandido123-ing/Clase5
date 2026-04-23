package src.main.java.uce.edu.pa2.api.DEBER2;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.Dependent;

@Dependent
//@ApplicationScoped

public class TrakingVenta {
    private long tiempoInicio=0;

    private long tiempoFinal=0;

    public void iniciar(){
        this.tiempoInicio = this.tiempoInicio + System.currentTimeMillis();
    }

    public void finalizar(){
        this.tiempoFinal = this.tiempoFinal+ System.currentTimeMillis();
        long tiempoEjecucion  = tiempoFinal - tiempoInicio;
        System.out.println("Tiempo ejecucion: "+ tiempoEjecucion + "ms");

    }
}
