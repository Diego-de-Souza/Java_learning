package main.java.methodoReference;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
* Representa uma operação que  não aceita nenhum argumento e retorna um resultado do
* tipo T
* É comumente usada para criar ou fornecer novos objetos de um determinado tipo
* */
public class SupplierExample {
    public static void main(String[] args) {
        //usar o suppliercom expressão lambda para fornecer uma saudação personalizada
        Supplier<String> saudacao = () -> "Olá, seja bem-vindo(a)!";

        //usar o suplier completo
        /*List<String> listaSaudacoes = Stream.generate(() -> "Olá, seja bem-vindo(a)!")*/
        //Usar o supplier para obter uma lista com 5 saudações
        List<String> listaSaudacoes = Stream.generate(saudacao)
                .limit(5)
                .collect(Collectors.toList());

        //Imprimir as saudações geradas
        listaSaudacoes.forEach(s -> System.out.println(s));
        //utilizando o methodo reference
        listaSaudacoes.forEach(System.out::println);
    }
}
