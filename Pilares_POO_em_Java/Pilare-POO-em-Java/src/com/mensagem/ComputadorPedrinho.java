package com.mensagem;

import com.mensagem.facebookMessenger.FacebookMessenger;
import com.mensagem.messenger.MSNMessenger;
import com.mensagem.telegram.Telegram;

public class ComputadorPedrinho {
    public static void main(String[] args) {
        //abrindo MSN 
        /* 
        MSNMessenger msn = new MSNMessenger();
        System.out.println("MSN");
        msn.enviarMensagem();
        msn.receberMensagem();

        FacebookMessenger face = new FacebookMessenger();
        System.out.println("Facebook");
        face.enviarMensagem();
        face.receberMensagem();

        Telegram tlg = new Telegram();
        System.out.println("Telegram");
        tlg.enviarMensagem();
        tlg.receberMensagem();
        */

        ServicoMenssagemInstantanea smi = null;

        /*
         * Não se sabe qual APP
         * Mas qualquer um deverá enviar e receber mensagem
         */
        String appEscolhido = "face";

        if(appEscolhido.equals("msn"))
            smi = new MSNMessenger();
        else if (appEscolhido.equals("face"))
            smi = new FacebookMessenger();
        else if (appEscolhido.equals("tlg"))
            smi = new Telegram();

        smi.enviarMensagem();
        smi.receberMensagem();
    }
}
