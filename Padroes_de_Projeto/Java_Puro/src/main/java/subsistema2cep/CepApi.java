package main.java.subsistema2cep;

public class CepApi {
    private  static  CepApi instacia = new CepApi();

    private CepApi() {
        super();
    }

    public static  CepApi getInstance(){
        return instacia;
    }
    public String recupearaCidade(String cep){
        return "Araraquara";
    }
    public String recupararEstado(String cep){
        return "SP";
    }
}
