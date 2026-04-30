package uce.edu.pa2.api.clase9;

import jakarta.enterprise.context.Dependent;

//import jakarta.enterprise.context.Dependent;
//@ApplicationScoped
@Dependent

public class TrakingVenta {
    private long tiempoInicio = 0;

    private long tiempoFinal = 0;

    private long tiempoTotalAcumulado = 0;

    private int numeroOperaciones = 0;

    public void iniciar(){
        this.tiempoInicio = /*this.tiempoInicio + */System.currentTimeMillis();
    }

    public void finalizar(){

        this.tiempoFinal = /*this.tiempoFinal+*/ System.currentTimeMillis();
        long tiempoEjecucion  = tiempoFinal - tiempoInicio;
        System.out.println("Tiempo ejecucion: "+ tiempoEjecucion + "ms");

        this.tiempoTotalAcumulado+=tiempoEjecucion;
        this.numeroOperaciones++;


        System.out.println("tiempo ejecucion: "+tiempoEjecucion+"ms");
        System.out.println("tiempo acumulado: "+this.tiempoTotalAcumulado+"ms");
        System.out.println("cantidad de operaciones: "+this.numeroOperaciones);


    }
}
