package collections_practice;

import java.util.*;

public class HasMap {
    public static void main(String[] args) {
        Map<String,String> inventarioMap = new TreeMap<>() ;
        inventarioMap.put("propietario","jhoan");
        inventarioMap.put("seccion","frutas");
        inventarioMap.put("localidad","San Cristobal");

        inventarioMap.forEach((clave,valor)-> System.out.println("clave: " + clave + " valor: " + valor ));

        Deque<String> deque = new ArrayDeque<>();
        deque.addLast("hola");
        deque.addFirst("nmms");
        deque.forEach(System.out::println);
    }
}
