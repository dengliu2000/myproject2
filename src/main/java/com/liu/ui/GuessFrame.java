package com.liu.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GuessFrame extends JFrame {
    public GuessFrame(){
        super();
        int secret=new Random().nextInt(10)+1;
        System.out.println("secret "+secret);
        setSize(600,400);
        setLocation(300,200);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        JButton button=new JButton("Guess!!!");
        JLabel label=new JLabel("Hey!!!");
        JTextField number=new JTextField(8);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num= Integer.parseInt(number.getText());
                System.out.println(num);
                if (num>secret){
                    label.setText("smaller");
                }
                else if(num<secret){
                    label.setText("bigger");
                }
                else {
                    label.setText("Bingo, the secret number "+secret);
                }
            }
        });

        setLayout(new FlowLayout());
        add(number);
        add(button);
        add(label);
        setVisible(true);
    }





    public static void main(String[] args) {
        GuessFrame guessFrame=new GuessFrame();
        //guessFrame.setSize(600,400);
        //guessFrame.setVisible(true);
    }
}
