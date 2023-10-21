import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("daniel", "florez", 1, 1030));
        personas.add(new Persona("yesid", "lopez", 20, 1080));
        personas.add(new Persona("gustavo", "moreno", 40, 123));
        personas.add(new Persona("adolfo", "salva", 10, 724));

        personas.forEach(System.out::println);
    }

}