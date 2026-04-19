package com.swingdemo;

import javax.swing.*;
import javax.swing.event.*;

public class P1 {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Country List");

        String countries[] = {"USA", "India", "Vietnam", "Canada", "Denmark",
                "France", "Great Britain", "Japan", "Africa", "Greenland", "Singapore"};

        JList<String> list = new JList<>(countries);
        list.setBounds(50, 30, 200, 150);

        list.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    System.out.println("Selected: " + list.getSelectedValue());
                }
            }
        });

        frame.add(list);
        frame.setSize(300, 250);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}