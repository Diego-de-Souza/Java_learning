package main.java.methodoReference;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
* Representa uma função que aceita um argumento do tipo T e retorna um resultado do tipo R.
* É utilizado para transformar ou mapear os elementos do Stream em outros valores ou tipos.
* */
public class FunctionExample {
    public static void main(String[] args) {
        //criar uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1,2,3,4,5);

        //Usar a function com expressão lambda para dobrar todos os números
        Function<Integer, Integer> dobrar = numero -> numero * 2;

        //Usar a função para dobrar todos os números no Stream e armazenalos em outra lista
        List<Integer> numerosDobrados = numeros.stream()
                .map(dobrar)
                .collect(Collectors.toList());

        //Imprimir a lista de números dobrados
        numerosDobrados.forEach(n -> System.out.println(n));
    }
}
