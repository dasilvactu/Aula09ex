/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula9ex;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.Box;
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
//        configuraBorderLayout();
//        configuraLayoutAbsoluto();
//        configuraGridLayout();
//        configuraGridBagLayout();
//        configuraHorizontalBoxLayout();
        configuraVerticalBoxLayout();
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

    private void configuraGridLayout() {
       principal.setLayout(new GridLayout(4,2));
       principal.add(lbl01);
       principal.add(txt01);
       principal.add(lbl02);
       principal.add(txt02);
       principal.add(lbl03);
       principal.add(txt03);
       principal.add(lbl04);
       principal.add(txt04);
    }

    private void configuraGridBagLayout() {
       GridBagLayout gbl = new GridBagLayout();
       GridBagConstraints gbc = new GridBagConstraints();
       principal.setLayout(gbl);
       gbc.anchor = GridBagConstraints.CENTER;
       gbc.ipadx=10;
       gbc.ipady= 10;
       gbc.gridx = 0;
       gbc.gridy = 0;
       gbc.gridheight = 1;
       gbc.gridwidth = 1;
       gbc.fill = GridBagConstraints.NONE;
       
       principal.add(lbl01);
       gbl.setConstraints(lbl01, gbc);
       
       principal.add(lbl02);
       gbc.gridy=1;
       gbl.setConstraints(lbl02, gbc);
       
       principal.add(lbl03);
       gbc.gridy=2;
       gbl.setConstraints(lbl03, gbc);
       
       principal.add(lbl04);
       gbc.gridy=3;
       gbl.setConstraints(lbl04, gbc);
       gbc.ipady= 0;
       
       principal.add(txt01);
       gbc.gridx = 1;
       gbc.gridy = 0;
       gbc.fill = GridBagConstraints.HORIZONTAL;
       gbc.weightx =2;
       gbl.setConstraints(txt01, gbc);
       
       principal.add(txt02);
       gbc.gridx = 1;
       gbc.gridy = 1;
       gbc.fill = GridBagConstraints.HORIZONTAL;
       gbc.weightx =2;
       gbl.setConstraints(txt02, gbc);
       
       principal.add(txt03);
       gbc.gridx = 1;
       gbc.gridy = 2;
       gbc.fill = GridBagConstraints.HORIZONTAL;
       gbc.weightx =2;
       gbl.setConstraints(txt03, gbc);
       
       principal.add(txt04);
       gbc.gridx = 1;
       gbc.gridy = 3;
       gbc.fill = GridBagConstraints.HORIZONTAL;
       gbc.weightx =2;
       gbl.setConstraints(txt04, gbc);
//       principal.add(lbl02);
//       principal.add(txt02);
//       principal.add(lbl03);
//       principal.add(txt03);
//       principal.add(lbl04);
//       principal.add(txt04);
    }

    private void configuraHorizontalBoxLayout() {
       Box horizontal = Box.createHorizontalBox();
       horizontal.add(lbl01);
       horizontal.add(txt01);
       horizontal.add(lbl02);
       horizontal.add(txt02);
       horizontal.add(lbl03);
       horizontal.add(txt03);
       horizontal.add(lbl04);
       horizontal.add(txt04);
       principal.add(horizontal);
    }
    private void configuraVerticalBoxLayout() {
       Box vertical = Box.createVerticalBox();
       vertical.add(lbl01);
       vertical.add(txt01);
       vertical.add(lbl02);
       vertical.add(txt02);
       vertical.add(lbl03);
       vertical.add(txt03);
       vertical.add(lbl04);
       vertical.add(txt04);
       principal.add(vertical);
    }
    
}
