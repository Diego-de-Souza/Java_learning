package com.autodromo;

/**
 * Autrodromo
 */
public class Autrodromo {

    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.setChassi("878787878");
        jeep.ligar();

        Moto z400 = new Moto();
        z400.setChassi("452452365");
        z400.ligar();
    }
}