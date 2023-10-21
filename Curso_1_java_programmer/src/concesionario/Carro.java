package concesionario;

public class Carro extends Vehiculo {
    private int numeroDePuertas;

    // Constructor
    public Carro(String marca, String modelo, int cilindraje, int numeroDePuertas) {
        super(marca, modelo, cilindraje);
        this.numeroDePuertas = numeroDePuertas;
    }

    // Getters y setters específicos para Carro
    public int getNumeroDePuertas() {
        return numeroDePuertas;
    }

    public void setNumeroDePuertas(int numeroDePuertas) {
        this.numeroDePuertas = numeroDePuertas;
    }


    @Override
    public String toString() {
        return super.toString()+"Carro{" +
                "numeroDePuertas=" + numeroDePuertas +
                '}';
    }
}

