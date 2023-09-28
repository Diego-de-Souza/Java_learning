package com.servicos.estabelecimento;

import com.servicos.equipamentos.copiadora.Copiadora;
import com.servicos.equipamentos.copiadora.Xeros;
import com.servicos.equipamentos.digitalizadora.Digitalizadora;
import com.servicos.equipamentos.digitalizadora.Scanner;
import com.servicos.equipamentos.impressora.Deskjet;
import com.servicos.equipamentos.impressora.Impressora;
import com.servicos.equipamentos.impressora.Laserjet;
import com.servicos.equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {
        EquipamentoMultifuncional em = new EquipamentoMultifuncional();
        
        Scanner scanner = new Scanner();
        Xeros xerox = new Xeros();
        Deskjet deskjet = new Deskjet();
        Laserjet laserjet = new Laserjet();

        Impressora impressora = em;
        Digitalizadora digitalizadora = em;
        Copiadora copiadora = em;

        impressora.Imprimir();
        digitalizadora.digitalizar();
        copiadora.Copiando();

        scanner.digitalizar();
        xerox.Copiando();
        deskjet.Imprimir();
        laserjet.Imprimir();
    }
}
