package interfaces_funcionales;

public class Main {
    public static void main(String[] args) {
        ListaGenerica<Fruta> listaFrutas = new ListaGenerica<>();
        ListaGenerica<Integer> enteros = new ListaGenerica<>();
        ListaGenerica<String> strings = new ListaGenerica<>();
        ListaGenerica<Double> doubles = new ListaGenerica<>();

        listaFrutas.agregar(new Fruta(1, "verde", 2, "manzana"));
        listaFrutas.agregar(new Fruta(2, "durazno", 3, "durazno"));
        enteros.agregar(5);
        enteros.agregar(6);
        strings.agregar("2");
        strings.agregar("4");
        doubles.agregar(1.3);
        doubles.agregar(2.3);

        ListaGenerica.imprimirLista(listaFrutas) ;
        ListaGenerica.imprimirLista(enteros);
        ListaGenerica.imprimirLista(strings);
        ListaGenerica.imprimirLista(doubles);
    }


}

