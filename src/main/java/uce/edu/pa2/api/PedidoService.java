package uce.edu.pa2.api;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
//@Unremovable
@ApplicationScoped
public class PedidoService {

    //Aqui va la inyeccion de dependencias,
    //es decir, el contenedor de CDI va a inyectar una instancia de NotificadorMail

/* 

    //DI por un constructor, tiene menor acoplamiento
    @Inject
    public PedidoService(NotificadorMail notificadorMail){
        this.notificadorMail = notificadorMail;
    }
*/
 /* 
    //DI por atributo es simple, se oculta, y ademas basico
    @Inject
    private NotificadorMail notificadorMail;

/*
    //DI por metodo, por ser metodos publicos que pueden acceder desde cualquier clase
    private NotificadorMail notificadorMail;
    @Inject
    public void setNotificador(NotificadorMail notificadorMail){
        this.notificadorMail = notificadorMail;

    }
 */

    @Inject
    private NotificadorSelector selector; 

    @Inject
    private ComprobantePDF comprobantePdf;

    @Inject
    private ComprobanteFisico comprobanteFisico;

    //private PagoEstrategia pago;


     public void registrar(Pedido pedido, PagoEstrategia pago){

        System.out.println("Registrando pedido");
        System.out.println("Cliente:" + pedido.getCliente());
        System.out.println("Total: " + pedido.getTotal());
        System.out.println("Guardando en la base de datos");

        pago.realizar(pedido.getTotal());

        if (pedido.getDestino() != null && !pedido.getDestino().trim().isEmpty()) {
            comprobantePdf.generar(pedido);
        } else {
            comprobanteFisico.generar(pedido);
        }

        if (this.selector != null) {
            //Notificador notificador = this.selector.seleccionar(pedido.getTotal());
            //notificador.enviar(pedido.getDestino(), "Pedido registrado");
        }

        //sin DI
        //NotificadorMail n1 = new NotificadorMail();
        
        //notificamos al cliente que se ha creado el pedido
        //Con DI por el contenedor
        //Notificador notificador = this.selector.seleccionar(pedido.getTotal());
        //notificador.enviar(pedido.getDestino(), "Pedido registrado");

    }

}
