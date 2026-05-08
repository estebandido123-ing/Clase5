package src.main.java.uce.edu.pa2.api.Deber4;

import java.util.ArrayList;
import java.util.List;

public class Reserva {
    private String huesped;
    private int numeroPersonas;
    private boolean aprobada;
    private List<String> tareasCompletadas;

    public Reserva(String huesped, int numeroPersonas) {
        this.huesped = huesped;
        this.numeroPersonas = numeroPersonas;
        this.aprobada = true; 
        this.tareasCompletadas = new ArrayList<>();
    }

    public String getHuesped() { 
        return huesped; 

    }
    public int getNumeroPersonas() { 
        return numeroPersonas; 
    }
    
    public boolean isAprobada() { 
        return aprobada; 
    }
    public void setAprobada(boolean aprobada) { 
        this.aprobada = aprobada; 
    }
    
    public List<String> getTareasCompletadas() { 
        return tareasCompletadas; 
    }
    public void agregarTarea(String tarea) { 
        this.tareasCompletadas.add(tarea); 
    }
}


