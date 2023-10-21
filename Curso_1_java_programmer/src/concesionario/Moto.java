package concesionario;

public class Moto extends Vehiculo {
    private String tipoDeMoto;

    // Constructor
    public Moto(String marca, String modelo, int cilindraje, String tipoDeMoto) {
        super(marca, modelo, cilindraje);
        this.tipoDeMoto = tipoDeMoto;
    }

    // Getters y setters específicos para Moto
    public String getTipoDeMoto() {
        return tipoDeMoto;
    }

    public void setTipoDeMoto(String tipoDeMoto) {
        this.tipoDeMoto = tipoDeMoto;
    }

    @Override
    public String toString() {
        return super.toString() +"Moto{" +
                "tipoDeMoto='" + tipoDeMoto + '\'' +
                '}';
    }
}
