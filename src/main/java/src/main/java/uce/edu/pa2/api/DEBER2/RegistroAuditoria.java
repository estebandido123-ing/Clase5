package src.main.java.uce.edu.pa2.api.DEBER2;

import jakarta.inject.Singleton;

@Singleton
public class RegistroAuditoria {
    private int operacionesTotales = 0;

    public int registrarOperacion() {
        return ++operacionesTotales;
    }
}