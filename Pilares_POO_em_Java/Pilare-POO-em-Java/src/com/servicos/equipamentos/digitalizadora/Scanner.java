package com.servicos.equipamentos.digitalizadora;

/*Ao criar uma interface você passa a não mais exterder e sim 
 * implementar uma classe
 */
public class Scanner implements Digitalizadora{

    public void digitalizar() {
        System.out.println("Digitalizando");
    }
    
}
