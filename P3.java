package com.swingdemo;

import javax.swing.*;
import java.awt.event.*;

public class P3 {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Image Button Demo");

        // Add your image paths here
        ImageIcon clockIcon = new ImageIcon("clock.jpng");
        ImageIcon hourglassIcon = new ImageIcon("hourglass.jpng");

        JButton btn1 = new JButton("Digital Clock", clockIcon);
        JButton btn2 = new JButton("Hour Glass", hourglassIcon);

        JLabel label = new JLabel();
        label.setBounds(50, 120, 300, 30);

        btn1.setBounds(30, 20, 150, 80);
        btn2.setBounds(200, 20, 150, 80);

        // Event Handling
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Digital Clock is pressed");
            }
        });

        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Hour Glass is pressed");
            }
        });

        frame.add(btn1);
        frame.add(btn2);
        frame.add(label);

        frame.setSize(400, 250);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}