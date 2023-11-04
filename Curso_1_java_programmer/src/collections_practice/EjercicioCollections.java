package collections_practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class EjercicioCollections {
    public static void main(String[] args) {
        Random random = new Random(System.currentTimeMillis());
        List<Integer> listaNumeros = new ArrayList<>();
        listaNumeros.add(random.nextInt(100));
        listaNumeros.add(random.nextInt(100));
        listaNumeros.add(random.nextInt(100));
        listaNumeros.add(random.nextInt(100));
        listaNumeros.add(random.nextInt(100));

        listaNumeros.forEach(System.out::println);
        System.out.println("---lambda--");
        listaNumeros.removeIf(numero -> numero % 2 != 0);
        listaNumeros.forEach(System.out::println);



    }

}
