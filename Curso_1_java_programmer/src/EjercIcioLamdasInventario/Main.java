package EjercIcioLamdasInventario;

public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        inventario.agregarProducto("Producto A", 10);
        inventario.agregarProducto("Producto B", 20);

        OperacionProducto operacionActualizar = (producto, cantidad) -> inventario.actualizarInventario(producto, cantidad);
        inventario.ejecutarOperacion(operacionActualizar, "Producto A", -5);

        OperacionProducto operacionVender = (producto, cantidad) -> inventario.venderProducto(producto, cantidad);
        inventario.ejecutarOperacion(operacionVender, "Producto B", 15);

        System.out.println("Nuevo inventario de Producto A: " + inventario.consultarInventario("Producto A"));
        System.out.println("Nuevo inventario de Producto B: " + inventario.consultarInventario("Producto B"));
    }
}

