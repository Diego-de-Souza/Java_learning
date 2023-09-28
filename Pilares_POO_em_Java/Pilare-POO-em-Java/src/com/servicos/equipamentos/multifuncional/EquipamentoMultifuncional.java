package com.servicos.equipamentos.multifuncional;

import com.servicos.equipamentos.copiadora.Copiadora;
import com.servicos.equipamentos.digitalizadora.Digitalizadora;
import com.servicos.equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora{

    public void Imprimir() {
        System.out.println("Imprimindo via equipamento Multifuncional");
    }

    public void digitalizar() {
        System.out.println("Digitalizando via equipamento Multifuncional");
    }

    public void Copiando() {
        System.out.println("Copiando via equipamento Multifuncional");
    }
    
}
