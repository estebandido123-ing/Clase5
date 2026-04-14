import com.edu.uce.negocio.Pedido;
import com.edu.uce.negocio.PedidoService;

public class App {
    public static void main(String[] args) throws Exception {
        
        Pedido pedido1 = new Pedido("Andy Suquilandi", "Papasfritas", 10.5, "andy@gmail.com", "0998998");
        Pedido pedido2 = new Pedido("Paul Aguas", "Coca-Cola", 20.5, "paul@uce.edu.ec", "898989898");


        PedidoService servicio1 = new PedidoService();
        PedidoService servicio2 = new PedidoService();

        servicio1.registrar(pedido1);
        servicio2.registrar(pedido2);
    }
}
