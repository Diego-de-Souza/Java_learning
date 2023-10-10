package main.java.singleton;

/*
* Singleton "Agressivo
*
* @author Diego de Souza*/

public class SingletonEager {
    private static SingletonEager instancia = new SingletonEager();
    private  SingletonEager(){
        super();
    }
    public static SingletonEager getInstance(){
        return instancia;
    }
}
