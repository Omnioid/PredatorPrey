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
        window.setUndecorated(true);
        window.setExtendedState(JFrame.MAXIMIZED_BOTH); //makes window full screen
        window.setResizable(false);
        window.getContentPane().setBackground(Color.BLACK);

        JLabel menuArt = new JLabel("<html>Predator/Prey</html>", JLabel.CENTER);
        Font menuFont = new Font("Serif", Font.BOLD, 70);
        JLabel menuUnderline = new JLabel("<html>-A Childhood Game-</html>", JLabel.CENTER);
        Font menuUnderlineFont = new Font("Serif", Font.ITALIC, 40);
        menuArt.setFont(menuFont);
        menuUnderline.setFont(menuUnderlineFont);
        menuArt.setForeground(Color.GREEN);
        menuUnderline.setForeground(Color.RED);
        window.add(menuArt, BorderLayout.NORTH);
        window.add(menuUnderline, BorderLayout.CENTER);



//        window.setVisible(true);

        JPanel buttonPanel = new JPanel();

        JButton beginButton = createTransparentButton("Begin");
        JButton quitButton = createTransparentButton("Quit");

        buttonPanel.setBackground(Color.BLACK);

        buttonPanel.add(beginButton);
        buttonPanel.add(quitButton);

        window.add(buttonPanel, BorderLayout.SOUTH);

//        window.setVisible(true);

        quitButton.addActionListener(e -> window.dispose());
        beginButton.addActionListener(e -> {
            window.removeAll();
            Simulation.begin();
        });

    }

    private static JButton createTransparentButton(String text) {//makes a transparent button
        JButton button = new JButton(text);
        button.setFont(new Font("Serif", Font.BOLD, 30));
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
