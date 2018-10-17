package poo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FimDeJogo extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JLabel placarJ1;
    private JLabel placarJ2;
    private JLabel vencedor;


    public FimDeJogo(String daVez, JLabel placarJ1, JLabel placarJ2) {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);

        //linhas adicionadas manualmente
        this.placarJ1.setText(placarJ1.getText());
        this.placarJ2.setText(placarJ2.getText());
        if(daVez == "velha") this.vencedor.setText("VELHA!");
        else this.vencedor.setText("JOGADOR " + daVez + " É O VENCEDOR!");

        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });

        buttonCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        });

        // call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

        // call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
    }

    private void onOK() {
        // add your code here
        dispose();
    }

    private void onCancel() {
        // add your code here if necessary
        dispose();
    }

    public static void main(String[] args) {
        FimDeJogo dialog = new FimDeJogo(new String(), new JLabel() , new JLabel());
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
