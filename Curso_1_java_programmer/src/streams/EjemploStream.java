package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EjemploStream {
    public static void main(String[] args) {
        // Crear una lista de empleados
        List<Empleado> empleados = Arrays.asList(
                new Empleado("Juan", "Pérez", 25, 2500000, true, "Sistemas"),
                new Empleado("María", "Gómez", 30, 3000000, false, "Ventas"),
                new Empleado("Carlos", "López", 22, 1800000, true, "Sistemas"),
                new Empleado("Ana", "Martínez", 19, 2000000, false, "Recursos Humanos")

        );

        // Imprimir la lista original de empleados
        System.out.println("Lista original de empleados:");
        empleados.forEach(System.out::println);

        // Aumentar salario para empleados activos con salario mayor a 2000000
        Empleado.aumentarSalarioParaEmpleadosActivos(empleados);

        // Imprimir la lista después del aumento de salario
        System.out.println("\nLista después del aumento de salario:");
        empleados.forEach(System.out::println);

        // Obtener empleados de sistemas inactivos y menores de 20 años
        List<Empleado> empleadosSistemasInactivosMenores20 = Empleado.obtenerEmpleadosSistemasInactivosMenores20(empleados);

        // Imprimir la lista de empleados de sistemas inactivos y menores de 20 años
        System.out.println("\nEmpleados de sistemas inactivos y menores de 20 años:");
        empleadosSistemasInactivosMenores20.forEach(System.out::println);

        // Obtener todos los departamentos
        List<String> todosLosDepartamentos = Empleado.obtenerTodosLosDepartamentos(empleados);

        // Imprimir la lista de todos los departamentos
        System.out.println("\nTodos los departamentos:");
        todosLosDepartamentos.forEach(System.out::println);

        // Generar y imprimir el reporte
        List<String> reporte = Empleado.generarReporte(empleados);
        System.out.println("\nReporte:");
        reporte.forEach(System.out::println);
    }
}
