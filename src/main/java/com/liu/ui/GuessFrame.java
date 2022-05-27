package com.liu.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuessFrame extends JFrame {
    public GuessFrame(){
        super();
        setSize(600,400);
        setLocation(300,200);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        JButton button=new JButton("hi");
        JLabel label=new JLabel("Hey!!!");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //System.out.println("Hello");
                label.setText("Hello");
            }
        });

        setLayout(new FlowLayout());
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
