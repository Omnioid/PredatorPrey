package com.PredatorPrey;

import javax.swing.*;
import java.awt.*;

public class MainPage extends JPanel {
    public MainPage() {
        JLabel menuArt = new JLabel("<html>Predator/Prey</html>", JLabel.CENTER);
        Font menuFont = new Font("Serif", Font.BOLD, 70);
        JLabel menuUnderline = new JLabel("<html>-A Childhood Game-</html>", JLabel.CENTER);
        Font menuUnderlineFont = new Font("Serif", Font.ITALIC, 40);
        menuArt.setFont(menuFont);
        menuUnderline.setFont(menuUnderlineFont);
        menuArt.setForeground(Color.GREEN);
        menuUnderline.setForeground(Color.RED);
        this.add(menuArt, BorderLayout.NORTH);
        this.add(menuUnderline, BorderLayout.CENTER);
        this.setBackground(Color.BLACK);
    }
}
