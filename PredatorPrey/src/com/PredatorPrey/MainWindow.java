package com.PredatorPrey;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MainWindow extends JFrame implements KeyListener {

    public MainWindow() {
        this.setTitle("Predator/Prey");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH); //makes window full screen
        this.setUndecorated(true);
        this.setVisible(true);
        this.getContentPane().setBackground(Color.BLACK);
        this.addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        System.exit(1);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.exit(1);

    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.exit(1);

    }
}
