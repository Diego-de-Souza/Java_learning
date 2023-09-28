package com.autodromo;

public abstract class Veiculo {
    /*encapsulamento consiste em tornar um atributo, metodo ou ação visivel
     * somente a classe a qual é criado, para isso se utiliza o metodo
     * private
     */
    private String chassi;
    
    public String getChassi(){
        return chassi;
    }
    public void setChassi(String chassi){
        this.chassi = chassi;
    }
    /*Utilizamos o conceito de abstração quando temos algo que tem mais de 
     * um metodo ou ação, no caso abaixo o metodo ligar é abstrato, pois está sendo
     * dados a ação para ele nas classes filhas de veiculo, não esquecer de 
     * inserir o termo "astract" antes do nome da classe
     */
    public abstract void ligar();
}
