import herencia.Canguro;
import herencia.Delfin;

import java.util.ArrayList;
import java.util.List;

public class Main {
    // Crear Concesionario que vende vehiculos (Carros, Motos) y se puedan listar
    // modificar y eliminar vehiculos, el numero de inventario no se puede repetir
    // atributos de un vehiculo en general: Marca, Modelo y Cilindraje

    public static void main(String[] args) {
        int m = 9, n = 1, x = 0;
        while (m > n) {

            m--;
            n += 2;

            x += m + n;


        }
        System.out.println(x);

    }
}