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

