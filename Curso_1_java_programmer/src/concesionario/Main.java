package concesionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Vehiculo> inventario = new ArrayList<>();

        int opcion;
        do {
            System.out.println("\nMenú del Concesionario");
            System.out.println("1. Listar vehículos");
            System.out.println("2. Agregar vehículo");
            System.out.println("3. Editar vehículo");
            System.out.println("4. Eliminar vehiculo");
            System.out.println("5. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Inventario actual:");
                    listarInventario(inventario);
                    break;
                case 2:
                    agregarVehiculo(inventario);
                    break;
                case 3:
                    editarVehiculo(inventario);
                    break;
                case 4:
                    eliminarVehiculo(inventario);
                    break;
                case 5:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcion != 5);
    }

    private static void listarInventario(List<Vehiculo> inventario) {
        if (inventario.isEmpty()) {
            System.out.println("El inventario está vacío.");
        } else {
            int contador = 0;
            for (Vehiculo vehiculo : inventario) {
                System.out.print("Id: " + contador + " - ");
                System.out.print(vehiculo.toString());
                if (vehiculo instanceof Carro) {
                    Carro carro = (Carro) vehiculo;
                    System.out.println(" - Número de puertas: " + carro.getNumeroDePuertas());
                } else if (vehiculo instanceof Moto) {
                    Moto moto = (Moto) vehiculo;
                    System.out.println(" - Tipo de moto: " + moto.getTipoDeMoto());
                }
                contador++;
            }
        }
    }


    private static void agregarVehiculo(List<Vehiculo> inventario) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione el tipo de vehículo a agregar:");
        System.out.println("1. Carro");
        System.out.println("2. Moto");
        System.out.print("Seleccione una opción: ");
        int opcion = scanner.nextInt();

        if (opcion == 1) {
            // Agregar un carro
            System.out.print("Marca del carro: ");
            String marca = scanner.next();
            System.out.print("Modelo del carro: ");
            String modelo = scanner.next();
            System.out.print("Cilindraje del carro: ");
            int cilindraje = scanner.nextInt();
            System.out.print("Número de puertas del carro: ");
            int numPuertas = scanner.nextInt();
            Carro carro = new Carro(marca, modelo, cilindraje, numPuertas);
            inventario.add(carro);
            System.out.println("Carro agregado al inventario.");
        } else if (opcion == 2) {
            // Agregar una moto
            System.out.print("Marca de la moto: ");
            String marca = scanner.next();
            System.out.print("Modelo de la moto: ");
            String modelo = scanner.next();
            System.out.print("Cilindraje de la moto: ");
            int cilindraje = scanner.nextInt();
            System.out.print("Tipo de moto: ");
            String tipo = scanner.next();
            Moto moto = new Moto(marca, modelo, cilindraje, tipo);
            inventario.add(moto);
            System.out.println("Moto agregada al inventario.");
        } else {
            System.out.println("Opción no válida. No se agregó ningún vehículo.");
        }
    }

    private static void editarVehiculo(List<Vehiculo> inventario) {
        if (inventario.isEmpty()) {
            System.out.println("El inventario está vacío. No hay vehículos para editar.");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el índice del vehículo a editar: ");
        int indice = scanner.nextInt();

        if (indice < 0 || indice >= inventario.size()) {
            System.out.println("Índice fuera de rango. No se editó ningún vehículo.");
            return;
        }

        Vehiculo vehiculo = inventario.get(indice);

        if (vehiculo instanceof Carro) {
            Carro carro = (Carro) vehiculo;
            System.out.print("Nueva marca del carro: ");
            String nuevaMarca = scanner.next();
            System.out.print("Nuevo modelo del carro: ");
            String nuevoModelo = scanner.next();
            System.out.print("Nuevo cilindraje del carro: ");
            int nuevoCilindraje = scanner.nextInt();
            System.out.print("Nuevo número de puertas: ");
            int nuevoNumPuertas = scanner.nextInt();
            carro.setMarca(nuevaMarca);
            carro.setModelo(nuevoModelo);
            carro.setCilindraje(nuevoCilindraje);
            carro.setNumeroDePuertas(nuevoNumPuertas);
            System.out.println("Carro editado correctamente.");
        } else if (vehiculo instanceof Moto) {
            Moto moto = (Moto) vehiculo;
            System.out.print("Nueva marca de la moto: ");
            String nuevaMarca = scanner.next();
            System.out.print("Nuevo modelo de la moto: ");
            String nuevoModelo = scanner.next();
            System.out.print("Nuevo cilindraje de la moto: ");
            int nuevoCilindraje = scanner.nextInt();
            System.out.print("Nuevo tipo de moto: ");
            String nuevoTipo = scanner.next();
            moto.setMarca(nuevaMarca);
            moto.setModelo(nuevoModelo);
            moto.setCilindraje(nuevoCilindraje);
            moto.setTipoDeMoto(nuevoTipo);
            System.out.println("Moto editada correctamente.");
        }
    }
    private static void eliminarVehiculo(List<Vehiculo> inventario) {
        if (inventario.isEmpty()) {
            System.out.println("El inventario está vacío. No hay vehículos para eliminar.");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el índice del vehículo a eliminar: ");
        int indice = scanner.nextInt();

        if (indice < 0 || indice >= inventario.size()) {
            System.out.println("Índice fuera de rango. No se eliminó ningún vehículo.");
            return;
        }

        Vehiculo vehiculo = inventario.get(indice);

        System.out.println("¿Está seguro de que desea eliminar el siguiente vehículo?");
        System.out.println(vehiculo.toString());
        System.out.print("Presione 1 para confirmar la eliminación, o cualquier otra tecla para cancelar: ");
        int confirmacion = scanner.nextInt();

        if (confirmacion == 1) {
            inventario.remove(indice);
            System.out.println("Vehículo eliminado del inventario.");
        } else {
            System.out.println("Eliminación cancelada.");
        }
    }

}
