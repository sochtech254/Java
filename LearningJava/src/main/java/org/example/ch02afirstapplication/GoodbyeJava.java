package org.example.ch02afirstapplication;

import javax.swing.*;

public class GoodbyeJava
{
    public static void main(String[] args)
    {
        // System.out.println("Hello, Java!");
        JFrame frame = new JFrame("Goodbye, Java");
        frame.setSize(300,150);
        JLabel label = new JLabel("Goodbye, Java!", JLabel.CENTER);
        frame.add(label);
        frame.setVisible(true);
    }
}
