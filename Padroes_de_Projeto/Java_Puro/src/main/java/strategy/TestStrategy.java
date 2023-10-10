package main.java.strategy;

public class TestStrategy {
    public static void main(String[] args) {
        //Test do strategy
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();
        Comportamento defensivo = new ComportamentoDefensivo();

        Robo robo = new Robo();
        //fazendo o robo se mover normalmente
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        //fazendo o robo se mover defensivamente
        robo.setComportamento(defensivo);
        robo.mover();
        robo.mover();
        //fazendo o robo se mover agresssivamente
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
    }
}
