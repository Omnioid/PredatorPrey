package com.PredatorPrey;

import javax.swing.*;
import java.awt.*;

import static javax.swing.SwingUtilities.paintComponent;

public class Simulation extends JPanel {
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.MAGENTA);
        g.drawRect(100,50, 1600, 1000);
    }
    
    public static void begin() {
        JFrame frame = new JFrame("Predator Prey Simulation");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setUndecorated(true);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setResizable(false);
        frame.getContentPane().setBackground(Color.BLACK);
        Simulation panel = new Simulation();
        frame.add(panel);
        frame.setVisible(true);
    }
    
    
}
