package concesionario;

public class Vehiculo {
    private String marca;
    private String modelo;
    private int cilindraje;

    // Constructor
    public Vehiculo(String marca, String modelo, int cilindraje) {
        this.marca = marca;
        this.modelo = modelo;
        this.cilindraje = cilindraje;
    }

    // Getters y setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", cilindraje=" + cilindraje +
                '}';
    }
}

