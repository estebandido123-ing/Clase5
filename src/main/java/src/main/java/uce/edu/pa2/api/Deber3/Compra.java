package src.main.java.uce.edu.pa2.api.Deber3;
public class Compra {
    private String cliente;
    private Double subtotal;
    private Double total;

    public Compra(){

    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Compra(String cliente, double subtotal) {
        this.cliente = cliente;
        this.subtotal = subtotal;
    }


    
    public String getCliente() {
        return cliente;
    }
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    public Double getSubtotal() {
        return subtotal;
    }
    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }
    

}
