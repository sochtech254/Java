package org.example.ch02afirstapplication;

import javax.swing.*;
import java.awt.*;

// The Graphics class provides methods for rendering shapes, images, and text.
class HelloComponent extends JComponent
{
    public void paintComponent(Graphics g)
    {
        g.drawString("Hello, Java", 125, 95);
    }
}
public class HelloJavaComponent
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Hello, Java");
        frame.setSize(300,150);
        frame.add(new HelloComponent());
        frame.setVisible(true);
    }
}


