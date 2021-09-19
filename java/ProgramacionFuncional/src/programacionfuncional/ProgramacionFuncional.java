/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacionfuncional;

import entidades.User;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author emarin
 */
public class ProgramacionFuncional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("Rafael", 25));
        users.add(new User("Daniel", 20));
        users.add(new User("Tania", 15));
        users.add(new User("Luisa", 24));
        users.add(new User("Raul", 21));

        int contador = (int) users.stream().filter(user -> user.getEdad() > 18).count();
        //System.out.println("resultado: " + contador);

        //Stream
        Stream<User> stream = users.stream();

        //Arreglo
        int[] numbers = {1, 2, 3, 4};
        Stream numbersStream = Stream.of(numbers);

        //Secuencia
        Stream names = Stream.of("Prueba 1", "Prueba 2", "Prueba 3");

        //obtener el cuadrado de todos los numeros en una lista
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> resultado = numeros.stream()
                .map(num -> num * num)
                .collect(Collectors.toList());
        //System.out.println(resultado);
        
        //Unir listas con flatmap
        List<String> deptos1 =Arrays.asList("San Salvador","Chaltenango");
        List<String> deptos2 =Arrays.asList("San Miguel","Sonsonate");
        List<String> deptos3 =Arrays.asList("Santa Ana","La Union");
        
        List<String> departamentos = Stream.of(deptos1,deptos2,deptos3)
                                            .flatMap(elemento->elemento.stream())
                                            .collect(Collectors.toList());
        //System.out.println(departamentos);
        
        //encontrar si hay un calificacion menor a 6        
        List<Integer> calificaciones = Arrays.asList(6, 2, 3, 4, 8, 6, 9, 10, 9, 10);
        
        boolean result = calificaciones.stream()
                .anyMatch(cal -> cal < 6);
        //System.out.println(result);
        
        //sumar, calcular promedio obtener numero minimo y maximo
        int suma = calificaciones.stream().mapToInt(n -> n).sum();
        double promedio = calificaciones.stream().mapToInt(n -> n).average().orElse(0);
        int minimo = calificaciones.stream().mapToInt(n -> n).min().getAsInt();
        int maximo = calificaciones.stream().mapToInt(n -> n).max().getAsInt();
        
        System.out.println("Suma: " + suma);
        System.out.println("Promedio: " + promedio);
        System.out.println("Valor mas pequeno: " + minimo);
        System.out.println("Valor mas grande : " + maximo);
        
        //utilizar reduce
        int result2 = numeros.stream().reduce(0, (acumulador,elemento) -> acumulador + elemento);//el primer valor es el 0 valor inicial del acumulador
        System.out.println("Acumulador: " + result2);
        
    }

}
