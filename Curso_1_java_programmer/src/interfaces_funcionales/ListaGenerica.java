package interfaces_funcionales;

import java.util.ArrayList;
import java.util.List;

public class ListaGenerica <T>{

    List<T> lista =  new ArrayList<>();

    public void agregar(T valor){
        lista.add(valor);
    }

    public T getItems(int index){
        return lista.get(index);
    }

    public static <T> void imprimirLista(ListaGenerica<T> lista) {
        for (T item : lista.lista) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

}
