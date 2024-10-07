package org.versechorusverse.guiCustomizations;

import org.versechorusverse.frames.AlbumFrame;
import org.versechorusverse.frames.ArtistFrame;
import org.versechorusverse.frames.LyricsFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class CardMouseListener implements MouseListener {
    private JPanel panel;
    private JFrame currentFrame;
    private String key;
    public CardMouseListener(JPanel panel, JFrame currentFrame, String key) {
        this.panel = panel;
        this.currentFrame = currentFrame;
        this.key = key;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        switch (key) {
            case "artist":
                ArtistFrame artistFrame = new ArtistFrame();
                currentFrame.dispose();
                break;
            case "album":
                AlbumFrame albumFrame = new AlbumFrame();
                currentFrame.dispose();
                break;
            case "song":
                LyricsFrame lyricsFrame = new LyricsFrame();
                currentFrame.dispose();
                break;
            default:
                System.out.println("Invalid key");
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        panel.setBackground(new Color(0x353C46)); // Change to a lighter green when mouse enters
        panel.setOpaque(true); // Ensure it shows the background color
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        panel.setOpaque(false); // Set it back to transparent
        panel.setBackground(new Color(0, 0, 0, 0)); // Reset to transparent
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        panel.setBackground(new Color(0x2B323A)); // Change to a lighter green when mouse enters
        panel.setOpaque(true); // Ensure it shows the background color
    }

    @Override
    public void mouseExited(MouseEvent e) {
        panel.setOpaque(false); // Set it back to transparent
        panel.setBackground(new Color(0, 0, 0, 0)); // Reset to transparent
    }
}
