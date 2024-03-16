package com.PredatorPrey;

import javax.swing.*;

public class MainWindow {

    private JFrame window;

    public MainWindow() {
        window = new JFrame();
        window.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        window.setTitle("Predator/Prey");
        window.setSize(800, 800);
        window.setLocationRelativeTo(null);
    }

    public void show() {
        window.setVisible(true);
    }
}
