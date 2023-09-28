package com.mensagem.facebookMessenger;

import com.mensagem.ServicoMenssagemInstantanea;

public class FacebookMessenger extends ServicoMenssagemInstantanea{
    public void enviarMensagem(){
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo Facebook");
        salvarHistoricoMensagem();
    }
    public void receberMensagem(){
        validarConectadoInternet();
        System.out.println("Recebendo mensagem pelo Facebook");
        salvarHistoricoMensagem();
    }
    
    
}
