package streams;

import java.util.List;
import java.util.stream.Collectors;

public class Empleado {

    private String nombre;
    private String apellido;
    private int edad;
    private double salario;
    private boolean estado;
    private String departamento;

    public Empleado(String nombre, String apellido, int edad, double salario, boolean estado, String departamento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.salario = salario;
        this.estado = estado;
        this.departamento = departamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    // Constructor, getters y setters

    public static void aumentarSalarioParaEmpleadosActivos(List<Empleado> empleados) {
        empleados = empleados.stream()
                .filter(e -> e.isEstado() && e.getSalario() > 2000000)
                .map(e -> {
                    e.setSalario(e.getSalario() * 1.1);
                    return e;
                })
                .collect(Collectors.toList());
    }

    public static List<Empleado> obtenerEmpleadosSistemasInactivosMenores20(List<Empleado> empleados) {
        return empleados.stream()
                .filter(e -> e.getDepartamento().equalsIgnoreCase("sistemas")
                        && !e.isEstado()
                        && e.getEdad() < 20)
                .collect(Collectors.toList());
    }

    public static List<String> obtenerTodosLosDepartamentos(List<Empleado> empleados) {
        return empleados.stream()
                .map(Empleado::getDepartamento)
                .distinct()
                .collect(Collectors.toList());
    }

    public static List<String> generarReporte(List<Empleado> empleados) {
        return empleados.stream()
                .map(e -> String.format("Nombre Completo: %s %s, Salario: %.2f, Departamento: %s, Salario con aumento del 50%%: %.2f, Estado: %s",
                        e.getNombre(), e.getApellido(), e.getSalario(), e.getDepartamento().toUpperCase(), e.getSalario() * 1.5, e.isEstado()))
                .collect(Collectors.toList());
    }
}
