package com.PredatorPrey;

import javax.swing.*;
import java.awt.*;

public class MainWindow {

    private JFrame window;

    public MainWindow() {
        // Create the window
        window = new JFrame();
        window.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        window.setTitle("Predator/Prey");
        window.setSize(800, 500); //will be changed for the simulation to the settings in the options menu
        window.setLocationRelativeTo(null);//sets to center of screen
        window.getContentPane().setBackground(Color.BLACK);

        JLabel menuArt = new JLabel("<html>Predator/Prey</html>", JLabel.CENTER);
        Font menuFont = new Font("Serif", Font.BOLD, 36);
        JLabel menuUnderline = new JLabel("<html>-A Childhood Game-</html>", JLabel.CENTER);
        Font menuUnderlineFont = new Font("Serif", Font.ITALIC, 18);
        menuArt.setFont(menuFont);
        menuUnderline.setFont(menuUnderlineFont);
        menuArt.setForeground(Color.GREEN);
        menuUnderline.setForeground(Color.RED);
        window.add(menuArt, BorderLayout.NORTH);
        window.add(menuUnderline, BorderLayout.CENTER);



//        window.setVisible(true);

        JPanel buttonPanel = new JPanel();

        JButton beginButton = createTransparentButton("Begin");
        JButton optionsButton = createTransparentButton("Options");
        JButton quitButton = createTransparentButton("Quit");

        buttonPanel.setBackground(Color.BLACK);

        buttonPanel.add(beginButton);
        buttonPanel.add(optionsButton);
        buttonPanel.add(quitButton);

        window.add(buttonPanel, BorderLayout.SOUTH);

//        window.setVisible(true);
    }

    private static JButton createTransparentButton(String text) {//makes a transparent button
        JButton button = new JButton(text);
        button.setOpaque(false);
        button.setContentAreaFilled(false);
        button.setBorderPainted(false);
        button.setForeground(Color.WHITE);
        return button;
    }


    public void show() {
        window.setVisible(true);
    }



}
