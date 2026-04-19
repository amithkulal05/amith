package com.swingdemo;

import javax.swing.*;
import java.awt.*;

public class P1 {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Hello Swing");

        JLabel label = new JLabel("Hello! VI C , Welcome to Swing Programming");
        label.setFont(new Font("Arial", Font.PLAIN, 32));
        label.setForeground(Color.BLUE);
        label.setHorizontalAlignment(JLabel.CENTER);

        frame.add(label);
        frame.setSize(600, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}