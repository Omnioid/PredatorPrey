package com.PredatorPrey;

import javax.swing.*;
import java.awt.event.ActionListener;

public class Launcher {

    public static void main(String[] args) {
            MainWindow mainWindow = new MainWindow();

            JPanel mainPage = new MainPage();

            ActionListener beginListener = e -> {
                mainWindow.getContentPane().removeAll();
                GamePanel gamePanel = new GamePanel();
                mainWindow.add(gamePanel);
                mainWindow.revalidate();
                mainWindow.repaint();
            };
            ControlsPanel controlsPanel = new ControlsPanel(beginListener, e -> System.exit(0));

            mainPage.add(controlsPanel);

            mainWindow.add(mainPage);
        }
}
