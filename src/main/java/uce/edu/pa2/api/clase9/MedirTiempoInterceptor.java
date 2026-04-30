package uce.edu.pa2.api.clase9;

import jakarta.annotation.Priority;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@MedirTiempo
@Interceptor
@Priority(2)

public class MedirTiempoInterceptor {
    
    @AroundInvoke
    
    public Object medir(InvocationContext context) throws Exception{

        System.out.println("Se ejecuto antes del metodo");
        System.out.println("Se ejecuto antes del metodo" + context.getMethod().getName());

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
