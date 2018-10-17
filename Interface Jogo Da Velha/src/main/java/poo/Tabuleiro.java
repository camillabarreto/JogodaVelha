package poo;

import javax.swing.*;

public class Tabuleiro {
    public boolean tabuleiroCheio(JLabel[][] sb){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(sb[i][j].getText() == " ") return false;
            }
        }
        return true;
    }
    public boolean ganhou(JLabel[][] sb, JLabel daVez){
        int aux = 0;
        //linhas
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(sb[i][j].getText() != daVez.getText()) break;
                aux++;
            }
            if(aux == 3) return true;
            else aux = 0;
        }
        aux = 0;
        //colunas
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(sb[j][i].getText() != daVez.getText()) break;
                aux++;
            }
            if(aux == 3) return true;
            else aux = 0;
        }
        //diagonais
        if      ((sb[0][0].getText() == daVez.getText()) &&
                (sb[1][1].getText() == daVez.getText()) &&
                (sb[2][2].getText() == daVez.getText()))  return true;
        if      ((sb[0][2].getText() == daVez.getText()) &&
                (sb[1][1].getText() == daVez.getText()) &&
                (sb[2][0].getText() == daVez.getText())) return true;

        return false;
    }
    public void esvaziaTabuleiro(JLabel[][] sb){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sb[i][j].setText(" ");
            }
        }
    }
}
