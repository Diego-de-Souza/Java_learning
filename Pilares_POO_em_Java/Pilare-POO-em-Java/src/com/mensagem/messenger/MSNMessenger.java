package com.mensagem.messenger;

import com.mensagem.ServicoMenssagemInstantanea;

public class MSNMessenger extends ServicoMenssagemInstantanea{
    public void enviarMensagem(){
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo Messenger");
        salvarHistoricoMensagem();
    }
    public void receberMensagem(){
        validarConectadoInternet();
        System.out.println("Recebendo mensagem pelo Messenger");
        salvarHistoricoMensagem();
    }
}
