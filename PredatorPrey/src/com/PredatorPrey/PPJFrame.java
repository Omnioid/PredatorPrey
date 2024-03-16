package com.PredatorPrey;

import javax.swing.*;

public class PPJFrame {

    private JFrame frame;

    public PPJFrame() {
        initialize();
    }

    public void initialize() {
        frame = new JFrame();
        this.frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.frame.setTitle("Predator/Prey");
        this.frame.setSize(800, 800);
        this.frame.setLocationRelativeTo(null);
    }
}

