package main.java.facade;

import main.java.subsistema1CRM.CRMService;
import main.java.subsistema2cep.CepApi;

public class Facade {

    public void migrarCliente(String nome, String cep){
        //recuperando onome da cidade e do estado a partir de um subsistema
        String cidade = CepApi.getInstance().recupearaCidade(cep);
        String estado = CepApi.getInstance().recupararEstado(cep);
        //grava os dados dentro de um outro subsistema
        CRMService.gravarCliente(nome,cep,estado,cidade);
    }
}
