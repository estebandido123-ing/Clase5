package src.main.java.uce.edu.pa2.api.DEBER2;

import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@MedirTiempo
@Interceptor

public class MedirTiempoInterceptor {
    
    @AroundInvoke
    
    public Object medir(InvocationContext context) throws Exception{

        

        long inicio = System.currentTimeMillis();

        //inicia  la ejeccucion del metodo
        //si no se llama al metodo proced, nunca se ejecuta el metodo
        Object resultado = context.proceed();

        //pasa a la siguiente linea una vez que se termine de ejecutar el metodo

        long fin = System.currentTimeMillis();

        long tiempoTranscurrido = fin - inicio;

        System.out.println("Tiempo transcurrido: " + tiempoTranscurrido);

        return resultado;

    }



}
