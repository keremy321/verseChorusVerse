package org.versechorusverse.guiCustomizations;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;

public class ButtonMouseListener implements MouseListener {
    private String path;
    private JLabel label;
    private ImageIcon originalIcon;
    private ImageIcon greenIcon = new ImageIcon();

    public ButtonMouseListener(JLabel label, String path){
        this.label = label;
        this.path = path;
        this.originalIcon = (ImageIcon) label.getIcon();

        try {
            URL effectURL = getClass().getResource(path);
            if (effectURL != null) {
                greenIcon = new ImageIcon(effectURL);
            } else {
                System.err.println("Resource not found");
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        label.setVisible(false);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        label.setVisible(true);
        label.setIcon(greenIcon);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        label.setVisible(false);
    }

    public void mouseEntered(MouseEvent e) {
        label.setVisible(true);
        label.setIcon(originalIcon);
    }

    public void mouseExited(MouseEvent e) {
        label.setVisible(false);
    }
}