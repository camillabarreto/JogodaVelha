package poo;

import javax.swing.*;
import java.awt.event.*;

public class Principal {
    private JPanel painelPrincipal;
    private JButton novoJogo;
    private JLabel sb00;
    private JLabel sb01;
    private JLabel sb02;
    private JLabel sb10;
    private JLabel sb11;
    private JLabel sb12;
    private JLabel sb20;
    private JLabel sb21;
    private JLabel sb22;
    private JLabel daVez;
    private JLabel placarJ1;
    private JLabel placarJ2;

    private JLabel[][] sb = new JLabel[][]{{sb00, sb01, sb02}, {sb10, sb11, sb12}, {sb20, sb21, sb22}};
    private JLabel[] placar = new JLabel[]{placarJ1, placarJ2};
    private Tabuleiro tabuleiro = new Tabuleiro();


    public static void main(String[] args) {
        JFrame frame = new JFrame("Principal");
        frame.setContentPane(new Principal().painelPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public boolean tabuleiroCheio(){
        return tabuleiro.tabuleiroCheio(sb);
    }

    public boolean ganhou(){
        return tabuleiro.ganhou(sb, daVez);
    }

    public void esvaziaTabuleiro(){
        tabuleiro.esvaziaTabuleiro(sb);
    }

    public void setDaVez(){
        if(daVez.getText() == "1") daVez.setText("2");
        else daVez.setText("1");
    }

    public void somaPlacar(){
        int vencedor = Integer.parseInt(daVez.getText())-1;
        int pontuacao = Integer.parseInt(placar[vencedor].getText())+1;
        placar[vencedor].setText(Integer.toString(pontuacao));
    }

    public void chamaDialogo(String daVez){
        FimDeJogo fimDeJogo = new FimDeJogo(daVez, placarJ1, placarJ2);
        fimDeJogo.pack();
        fimDeJogo.setLocationRelativeTo(painelPrincipal);
        fimDeJogo.setVisible(true);
    }

    public void verifica(){
        if(ganhou()){
            somaPlacar();
            chamaDialogo(daVez.getText());
            esvaziaTabuleiro();
        }
        else if(tabuleiroCheio()) {
            chamaDialogo("velha");
            esvaziaTabuleiro();
        }
        else setDaVez();
    }

    public Principal(){

        sb00.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                super.mouseClicked(mouseEvent);
                if(sb00.getText() == " "){
                    sb00.setText(daVez.getText());
                    verifica();
                }
            }
        });
        sb01.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                super.mouseClicked(mouseEvent);
                if(sb01.getText() == " "){
                    sb01.setText(daVez.getText());
                    verifica();
                }
            }
        });
        sb02.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                super.mouseClicked(mouseEvent);
                if(sb02.getText() == " "){
                    sb02.setText(daVez.getText());
                    verifica();
                }
            }
        });
        sb10.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                super.mouseClicked(mouseEvent);
                if(sb10.getText() == " "){
                    sb10.setText(daVez.getText());
                    verifica();
                }
            }
        });
        sb11.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                super.mouseClicked(mouseEvent);
                if(sb11.getText() == " "){
                    sb11.setText(daVez.getText());
                    verifica();
                }
            }
        });
        sb12.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                super.mouseClicked(mouseEvent);
                if(sb12.getText() == " "){
                    sb12.setText(daVez.getText());
                    verifica();
                }
            }
        });
        sb20.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                super.mouseClicked(mouseEvent);
                if(sb20.getText() == " "){
                    sb20.setText(daVez.getText());
                    verifica();
                }
            }
        });

        sb21.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                super.mouseClicked(mouseEvent);
                if(sb21.getText() == " "){
                    sb21.setText(daVez.getText());
                    verifica();
                }
            }
        });
        sb22.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                super.mouseClicked(mouseEvent);
                if(sb22.getText() == " "){
                    sb22.setText(daVez.getText());
                    verifica();
                }
            }
        });
        novoJogo.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                super.mouseClicked(mouseEvent);
                esvaziaTabuleiro();
            }
        });
    }

}
