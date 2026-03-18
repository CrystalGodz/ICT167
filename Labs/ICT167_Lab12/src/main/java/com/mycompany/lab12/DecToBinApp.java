package com.mycompany.lab12;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DecToBinApp extends JFrame implements ActionListener{
    private JTextField txDecimal;
    private JTextField txBinary;
    
    public DecToBinApp(){
        createUI();
    }
    
    private void createUI(){
        this.setTitle("Decimal to Binary");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        
        //Create UI component
        txDecimal = new JTextField();
        txBinary = new JTextField();
        txBinary.setEditable(false);
        
        //Use GridLayout to arrage the JIT component
        this.getContentPane().setLayout(new GridLayout(2,2));
        this.add(new JLabel("DECIMAL"));
        this.add(txDecimal);
        this.add(new JLabel("BINARY"));
        this.add(txBinary);
        this.pack();
        
        //Link the actionPerformed method to the JTextField
        txDecimal.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent evt){
        String userInput = txDecimal.getText();
        String binary = Integer.toBinaryString(Integer.parseInt(userInput));
        txBinary.setText(binary);
        
    }
    
    public static void main(String[] argv){
        DecToBinApp myApp = new DecToBinApp();
        myApp.setVisible(true);
    }
}
