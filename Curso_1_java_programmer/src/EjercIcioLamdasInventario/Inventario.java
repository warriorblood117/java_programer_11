package EjercIcioLamdasInventario;

import java.util.HashMap;

public class Inventario {
    private HashMap<String, Integer> catalogo;

    public Inventario() {
        catalogo = new HashMap<>();
    }

    public void agregarProducto(String producto, int cantidad) {
        catalogo.put(producto, cantidad);
    }

    public int consultarInventario(String producto) {
        return catalogo.getOrDefault(producto, 0);
    }

    public void actualizarInventario(String producto, int cantidad) {
        if (catalogo.containsKey(producto)) {
            int cantidadActual = catalogo.get(producto);
            catalogo.put(producto, cantidadActual + cantidad);
        }
    }

    public void venderProducto(String producto, int cantidad) {
        if (catalogo.containsKey(producto)) {
            int cantidadActual = catalogo.get(producto);
            if (cantidadActual >= cantidad) {
                catalogo.put(producto, cantidadActual - cantidad);
            } else {
                System.out.println("No hay suficiente stock para vender.");
            }
        }
    }
    public void ejecutarOperacion(OperacionProducto operacion, String producto, int cantidad) {
        operacion.realizar(producto, cantidad);
    }
}
