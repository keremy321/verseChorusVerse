package org.versechorusverse.guiCustomizations;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;

public class SortMouseListener implements MouseListener {

    private ImageIcon originalIcon;
    private ImageIcon enteredIcon;
    private ImageIcon pressedIcon;
    private JLabel label;

    public SortMouseListener(JLabel label, String path) {
        this.label = label;
        this.originalIcon = (ImageIcon) label.getIcon();

        // Load icons from resources
        this.enteredIcon = loadImageIcon("/sortEntered.png");
        this.pressedIcon = loadImageIcon("/sortPressed.png");
    }

    // Helper method to load an image icon
    private ImageIcon loadImageIcon(String path) {
        URL imgURL = getClass().getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Sorted");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (pressedIcon != null) {
            label.setIcon(pressedIcon);
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        label.setIcon(originalIcon);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if (enteredIcon != null) {
            label.setIcon(enteredIcon);
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        label.setIcon(originalIcon);
    }
}
