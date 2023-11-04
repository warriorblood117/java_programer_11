package interfaces_funcionales;

@FunctionalInterface
public interface ICalculadoraFuncional {

    int operacion(int a, int b);

    default void  mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }
}
