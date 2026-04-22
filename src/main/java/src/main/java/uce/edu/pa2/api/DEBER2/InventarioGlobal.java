package src.main.java.uce.edu.pa2.api.DEBER2;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class InventarioGlobal {
    private int productosIngresados = 0;

    public int registrarProducto() {
        return ++productosIngresados;
    }
}