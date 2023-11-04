package interfaces_funcionales;

public class Fruta {

    private int id;
    private  String color;

    private int peso;

    private String nombre;

    public Fruta(int id,String color, int peso,String nombre) {
        this.color = color;
        this.peso = peso;
        this.nombre = nombre ;
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPeso() {
        return peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Fruta{" +
                "id=" + id +
                ", color='" + color + '\'' +
                ", peso=" + peso +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
