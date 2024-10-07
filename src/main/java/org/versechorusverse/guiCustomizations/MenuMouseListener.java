package org.versechorusverse.guiCustomizations;

import org.versechorusverse.frames.AlbumsFrame;
import org.versechorusverse.frames.ArtistsFrame;
import org.versechorusverse.frames.MainFrame;
import org.versechorusverse.frames.SongsFrame;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;

public class MenuMouseListener implements MouseListener {

    private ImageIcon enteredIcon;
    private ImageIcon pressedIcon;
    private ImageIcon originalIcon;
    private JLabel label;
    private String key;
    private JFrame currentFrame;

    public MenuMouseListener(JLabel label, String path, String key, JFrame currentFrame) {
        this.label = label;
        this.key = key;
        this.currentFrame = currentFrame;
        this.originalIcon = (ImageIcon) label.getIcon();

        this.enteredIcon = loadImageIcon("/words/" + key + "Orange.png");
        this.pressedIcon = loadImageIcon("/words/" + key + "Purple.png");
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
        switch (key) {
            case "artists":
                ArtistsFrame artistsFrame = new ArtistsFrame();
                currentFrame.dispose();
                break;
            case "albums":
                AlbumsFrame albumsFrame = new AlbumsFrame();
                currentFrame.dispose();
                break;
            case "songs":
                SongsFrame songsFrame = new SongsFrame();
                currentFrame.dispose();
                break;
            case "logo":
                MainFrame mainFrame = new MainFrame();
                currentFrame.dispose();
                break;
            default:
                System.out.println("Invalid key");
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        label.setIcon(pressedIcon);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        label.setIcon(originalIcon);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        label.setIcon(enteredIcon);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        label.setIcon(originalIcon);
    }
}
