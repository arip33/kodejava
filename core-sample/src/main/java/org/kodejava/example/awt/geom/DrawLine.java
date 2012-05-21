package org.kodejava.example.awt.geom;

import javax.swing.*;
import java.awt.*;

public class DrawLine extends JApplet {
    @Override
    public void paint(Graphics g) {
        //
        // Draw a simple line using the Graphics drawLine() method.
        //
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(2f));
        g2.setColor(Color.RED);
        g2.drawLine(50, 150, 250, 350);
        g2.setColor(Color.GREEN);
        g2.drawLine(250, 350, 350, 250);
        g2.setColor(Color.BLUE);
        g2.drawLine(350, 250, 150, 50);
        g2.setColor(Color.YELLOW);
        g2.drawLine(150, 50, 50, 150);
        g2.setColor(Color.BLACK);
        g2.drawLine(0, 0, 400, 400);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Draw Line");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JApplet applet = new DrawLine();
        frame.getContentPane().add(applet);
        frame.pack();
        frame.setSize(new Dimension(420, 440));
        frame.setVisible(true);
    }
}
