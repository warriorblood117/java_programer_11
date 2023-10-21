package herencia;

public class Canguro extends Mamifero{

    private  double tamanoBolsa;

    public Canguro(boolean vivo, String habitad, String especie, char sexo, int edad, String tropofaguia, String colorPiel, double tamanoBolsa) {
        super(vivo, habitad, especie, sexo, edad, tropofaguia, colorPiel);
        this.tamanoBolsa = tamanoBolsa;
    }

    public double getTamanoBolsa() {
        return tamanoBolsa;
    }

    public void setTamanoBolsa(double tamanoBolsa) {
        this.tamanoBolsa = tamanoBolsa;
    }
}