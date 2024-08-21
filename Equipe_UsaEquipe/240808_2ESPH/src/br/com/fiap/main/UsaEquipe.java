package br.com.fiap.main;

import br.com.fiap.bean.Equipe;

import javax.swing.*;
import java.util.ArrayList;

public class UsaEquipe {
    public static void main(String[] args) {
        Equipe grupo;
        String aux, nome, escolha = "sim";
        while (escolha.equalsIgnoreCase("sim")) {
            try {
                nome = JOptionPane.showInputDialog("Digite o nome da equipe");
                String membros = "continua";
                ArrayList<String> integrantes = new ArrayList<String>();
                while (membros.equalsIgnoreCase("continua")) {
                    aux = JOptionPane.showInputDialog("Digite Integrante desta equipe ou digite \"fim\" para encerrar.");
                    if (aux.equalsIgnoreCase("fim")) {
                        membros = "fim";
                    } else {
                        integrantes.add(aux);
                    }
                }
                grupo = new Equipe(nome, integrantes);
                grupo.listaEquipe();
                escolha = JOptionPane.showInputDialog("Deseja continuar? (Sim/Não)");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
        JOptionPane.showMessageDialog(null, "Fim de Programa");
    }
}
