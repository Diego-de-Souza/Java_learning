package com.autodromo;

/*Quando falamos de herança, falamos em extender um objeto de pai para filho
 * Para isso usamos um conceito importante, usamos a palavra "extends" 
 * depois do nome da classe e seguido da classe na qual será extendida
 */
public class Moto extends Veiculo {
    
    @Override
    public void ligar(){
        System.out.println("Moto ligada!!!");
    }
}
