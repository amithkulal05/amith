package com.swingdemo;

import javax.swing.*;
import java.awt.*;

public class P2 {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Color Tabs");

        JTabbedPane tabbedPane = new JTabbedPane();

        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.RED);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.BLUE);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.GREEN);

        tabbedPane.addTab("Red", redPanel);
        tabbedPane.addTab("Blue", bluePanel);
        tabbedPane.addTab("Green", greenPanel);

        frame.add(tabbedPane);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}