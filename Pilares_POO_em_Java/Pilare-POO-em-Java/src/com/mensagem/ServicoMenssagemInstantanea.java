package com.mensagem;

/*Para determinar abstratação na linguagem java, a classe é abstrata
 * se tem metodos abstratos e os metodos não tem corpo
 */
public abstract class ServicoMenssagemInstantanea {
    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    //somente os filhos conhecem este método
    protected void validarConectadoInternet() {
        System.out.println("Validando se está conectado a internet");
    }

    protected void salvarHistoricoMensagem(){
        System.out.println("Salvando o histórico da mensagem do Facebook");
    }
}
