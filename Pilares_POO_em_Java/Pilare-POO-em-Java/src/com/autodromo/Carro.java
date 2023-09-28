package com.autodromo;

/*Quando falamos de herança, falamos em extender um objeto de pai para filho
 * Para isso usamos um conceito importante, usamos a palavra "extends" 
 * depois do nome da classe e seguido da classe na qual será extendida
 */
public class Carro extends Veiculo{
    @Override
    public void ligar(){
        conferirCombustivel();
        confereCambio();
        System.out.println("Carro ligado!!!");
    }
    /*encapsulamento consiste em tornar um atributo, metodo ou ação visivel
     * somente a classe a qual é criado, para isso se utiliza o metodo
     * private
     */
    private void conferirCombustivel() {
        System.out.println("Conferindo combutivel");
    }
    private void confereCambio(){
        System.out.println("Conferindo cambio em P");
    }
}
