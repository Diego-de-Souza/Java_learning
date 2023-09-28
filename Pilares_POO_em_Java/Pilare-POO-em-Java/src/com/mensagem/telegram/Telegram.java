package com.mensagem.telegram;

import com.mensagem.ServicoMenssagemInstantanea;

public class Telegram extends ServicoMenssagemInstantanea{
    public void enviarMensagem(){
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo Telegram");
        salvarHistoricoMensagem();
    }
    public void receberMensagem(){
        validarConectadoInternet();
        System.out.println("Recebendo mensagem pelo Telegram");
        salvarHistoricoMensagem();
    }
}
