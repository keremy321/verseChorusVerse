package org.versechorusverse.guiCustomizations;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import javax.imageio.ImageIO;

public class BackgroundImage extends JPanel {

    private Image backgroundImage;

    // Constructor to load the image from the classpath
    public BackgroundImage(String imagePath) {
        try {
            // Load the image using getResource
            backgroundImage = ImageIO.read(getClass().getResource(imagePath));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (backgroundImage != null) {
            g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
        }
    }
}