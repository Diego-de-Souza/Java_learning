package main.java.methodoReference;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

/*Representa uma operação que combina dois argumentos do tipo T e retorna o mesmo resultado do tipo T
É usado para realizar operações de redução em pares de elementos, como somar numeros ou combinar objetos
* */
public class OperadorBinaryExample {
    public static void main(String[] args) {
        //Criar uma lista de numeros inteiros
        List<Integer> numeros = Arrays.asList(1,2,3,4,5);

        //Usar o BinaryOperator com expressão lambda para somar dois numeros inteiros
        BinaryOperator<Integer> soma = (num1, num2) ->num1 + num2;

        //Usar o BinaryOperator para somar todos os numeros do stream
        int resultado = numeros.stream()
                .reduce(0,soma);

        //imprimir o resultado da soma
        System.out.println("A soma dos números é: "+resultado);
    }
}
