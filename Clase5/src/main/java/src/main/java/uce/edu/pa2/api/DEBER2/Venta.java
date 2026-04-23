package src.main.java.uce.edu.pa2.api.DEBER2;

public class Venta {
    
    private String cliente;
    private double Total;


    public String getcliente() {
        return cliente;
    }
    public double getTotal() {
        return Total;
    }
    
    public void setcliente(String cliente) {
        this.cliente = cliente;
    }
    public void setTotal(double total) {
        Total = total;
    }


    public Venta(String cliente, double total) {
        this.cliente = cliente;
        Total = total;
    }
    
}
