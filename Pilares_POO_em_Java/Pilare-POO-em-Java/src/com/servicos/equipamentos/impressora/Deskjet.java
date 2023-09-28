package com.servicos.equipamentos.impressora;

/*Ao criar uma interface você passa a não mais exterder e sim 
 * implementar uma classe
 */
public class Deskjet implements Impressora {

    public void Imprimir() {
        System.out.println("Deskjet imprimindo");    
    }
    
}
