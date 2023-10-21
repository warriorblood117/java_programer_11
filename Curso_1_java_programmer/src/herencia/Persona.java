package herencia;

public class Persona extends Mamifero {

    private String nombre;
    private String apellido;
    private long pulgares;

    private String documento;


    public Persona(boolean vivo, String habitad, String especie, char sexo, int edad, String tropofaguia,
                   String colorPiel, String nombre, String apellido, long pulgares, String documento) {
        super(vivo, habitad, especie, sexo, edad, tropofaguia, colorPiel);
        this.nombre = nombre;
        this.apellido = apellido;
        this.pulgares = pulgares;
        this.documento = documento;
    }

    public Persona(boolean vivo, String habitad, String especie, char sexo, int edad, String tropofaguia, String colorPiel, String documento) {
        super(vivo, habitad, especie, sexo, edad, tropofaguia, colorPiel);
        this.documento = documento;
    }

    @Override
    public void comunicacion() {
        System.out.println("hablar basura");
    }

    public void pensando() {
        System.out.println("la persona esta pensando");
    }

    public void comunicacion(String mensaje) {
        System.out.println(mensaje);
    }
}