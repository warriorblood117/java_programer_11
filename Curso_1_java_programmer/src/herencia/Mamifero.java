package herencia;

public class Mamifero {

    //atributo

    private boolean vivo;

    private String habitad;

    private String especie;

    private char sexo;

    private int edad;

    private String tropofaguia;

    private String colorPiel;

    public Mamifero(boolean vivo, String habitad, String especie, char sexo, int edad, String tropofaguia, String colorPiel) {
        this.vivo = vivo;
        this.habitad = habitad;
        this.especie = especie;
        this.sexo = sexo;
        this.edad = edad;
        this.tropofaguia = tropofaguia;
        this.colorPiel = colorPiel;
    }

    public boolean isVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    public String getHabitad() {
        return habitad;
    }

    public void setHabitad(String habitad) {
        this.habitad = habitad;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTropofaguia() {
        return tropofaguia;
    }

    public void setTropofaguia(String tropofaguia) {
        this.tropofaguia = tropofaguia;
    }

    public String getColorPiel() {
        return colorPiel;
    }

    public void setColorPiel(String colorPiel) {
        this.colorPiel = colorPiel;
    }

    public void comunicacion(){
        System.out.println("se comunica");
    }

    public void movimiento(){
        System.out.println("movimiento!!!");
    }
    //metodos

    //boolean
    public boolean validarRespiracion(){

        return vivo?true:false;

    }

    public void respirar(){
        if(validarRespiracion()){
            System.out.println("Respirando");
        }else{
            System.out.println("colgo los guallos");
        }

    }

    public void alimentarse(){
        System.out.println("se esta alimentando el mamifero");
    }

}