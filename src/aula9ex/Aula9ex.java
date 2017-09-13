/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula9ex;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author ice
 */
public class Aula9ex extends JFrame{

    private JPanel principal = new JPanel();
    private JLabel lbl01 = new JLabel("Etiqueta 01");
    private JLabel lbl02 = new JLabel("Etiqueta 02");
    private JLabel lbl03 = new JLabel("Etiqueta 03");
    private JLabel lbl04 = new JLabel("Etiqueta 04");
    private JTextField txt01 = new JTextField("Texto 01");
    private JTextField txt02 = new JTextField("Texto 02");
    private JTextField txt03 = new JTextField("Texto 03");
    private JTextField txt04 = new JTextField("Texto 04");
    
    public Aula9ex() throws HeadlessException {
        super("Exemplos de Layout");
//        configuraFlowLayout();
        configuraBorderLayout();
        configuraLayoutAbsoluto();
        add(principal);
    }

    
    public static void main(String[] args) {
        Aula9ex janela = new Aula9ex();
        janela.setSize(400,300);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLocationRelativeTo(null);
        janela.setVisible(true);
    }

    private void configuraFlowLayout() {
       principal.setLayout(new FlowLayout());
       principal.add(lbl01);
       principal.add(txt01);
       principal.add(lbl02);
       principal.add(txt02);
       principal.add(lbl03);
       principal.add(txt03);
       principal.add(lbl04);
       principal.add(txt04);
    }
    private void configuraBorderLayout() {
       principal.setLayout(new BorderLayout());
       principal.add(lbl01,BorderLayout.NORTH);
       principal.add(txt01,BorderLayout.WEST);
//       principal.add(lbl02);
       principal.add(txt02,BorderLayout.CENTER);
       principal.add(lbl03,BorderLayout.EAST);
       principal.add(txt03,BorderLayout.SOUTH);
//       principal.add(lbl04);
//       principal.add(txt04);
    }

    private void configuraLayoutAbsoluto() {
       principal.setLayout(null);
       lbl01.setSize(100,30);
       lbl02.setSize(100,30);
       lbl03.setSize(100,30);
       lbl04.setSize(100,30);
       txt01.setSize(200,30);
       txt02.setSize(txt01.getSize());
       txt03.setSize(txt01.getSize());
       txt04.setSize(txt01.getSize());
       
       lbl01.setLocation(10,10);
       txt01.setLocation(120,10);
       lbl02.setLocation(10,50);
       txt02.setLocation(120,50);
       lbl03.setLocation(10,90);
       txt03.setLocation(120,90);
       lbl04.setLocation(10,130);
       txt04.setLocation(120,130);
       
       principal.add(lbl01);
       principal.add(txt01);
       principal.add(lbl02);
       principal.add(txt02);
       principal.add(lbl03);
       principal.add(txt03);
       principal.add(lbl04);
       principal.add(txt04);
    }
    
}
