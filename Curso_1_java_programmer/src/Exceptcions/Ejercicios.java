package Exceptcions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ejercicios {
    public static void main(String[] args) {
        int [] numeros = {10,90,70,5,3};

        /*int suma =  0;

        for (int num :  numeros){
            suma +=  num;
        }

        var promedio =  (double) suma / numeros.length;
        System.out.println(promedio);

        double promedio2 = Arrays.stream(numeros).average().orElse(0.0);
        System.out.println(promedio2);

        double promedio3 = Arrays.stream(numeros)
                .reduce(0, (a, b) -> a + b) / (double) numeros.length;
        System.out.println(promedio3);*/

        int primerNumeroPrimoLista =  Arrays.stream(numeros)
                .filter(n -> esPrimo(n))
                .findFirst().orElse(0);

        System.out.println(primerNumeroPrimoLista);


    }

    public static boolean esPrimo (int num){
        if(num<2){
            return false;
        }
        for(int i =2 ; i <= Math.sqrt(num);i++){
            if(num %i == 0){
                return false;
            }
        }
        return  true;
    }
}
