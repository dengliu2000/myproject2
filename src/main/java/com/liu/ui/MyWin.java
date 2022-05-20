package com.liu.ui;

import javax.swing.*;
import java.awt.*;

public class MyWin {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setSize(600,400);
        frame.setLocation(300,200);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JButton button=new JButton("OK");
        frame.setLayout(new FlowLayout());
        frame.add(button);
        frame.add(new JButton("1"));
        frame.add(new JButton("2"));
        frame.add(new JButton("3"));
        frame.add(new JButton("4"));
        frame.add(new JButton("5"));
        frame.add(new JButton("6"));
        frame.add(new JButton("7"));
        frame.setVisible(true);
        System.out.println("END???");
    }
}
