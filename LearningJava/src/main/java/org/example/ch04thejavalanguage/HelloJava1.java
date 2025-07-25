package org.example.ch04thejavalanguage;

import javax.swing.*;

public class HelloJava1
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Hello, Java!");
        JLabel label = new JLabel("Hello, Java!", JLabel.CENTER);
        frame.add(label);
        frame.setSize(300,300);
        frame.setVisible(true);
    }
}
