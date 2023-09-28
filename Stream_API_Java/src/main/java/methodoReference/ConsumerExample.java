package main.java.methodoReference;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/*
* Representa uma operação que aceita um argumento do tipo T e não retorna resultado
* É utilizado principalmente para realizar ações ou efeitos nos elementos do Stream sem
* modificar ou retornar um valor.
* */
public class ConsumerExample {
    public static void main(String[] args) {
        //Criar uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8);

        //Usar o consumer com expressão  Lambda para imprimir números pares
        /*Consumer<Integer> imprimirNumerosPar = numero -> {
            if(numero % 2 == 0){
                System.out.println(numero);
            }
        };
        */

        //usar o consumer para imprimir numeros pares no stream
        //numeros.stream().forEach(imprimirNumerosPar);
        numeros.forEach(n -> {
            if(n % 2 == 0){
                System.out.println(n);
            }
        });
    }
}
