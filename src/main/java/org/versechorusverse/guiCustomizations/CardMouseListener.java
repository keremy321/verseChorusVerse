package org.versechorusverse.guiCustomizations;

import org.versechorusverse.datas.Album;
import org.versechorusverse.datas.Artist;
import org.versechorusverse.datas.Song;
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
    private Artist artist;

    public CardMouseListener(JPanel panel, JFrame currentFrame, String key, Artist artist) {
        this.panel = panel;
        this.currentFrame = currentFrame;
        this.key = key;
        this.artist = artist;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        String clickedCardName = panel.getName();

        System.out.println("Clicked on card: " + clickedCardName);

        switch (key) {
            case "artist":
                ArtistFrame artistFrame = new ArtistFrame(artist);
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
        panel.setBackground(new Color(0x353C46)); // Change to a lighter color when mouse enters
        panel.setOpaque(true); // Ensure it shows the background color
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        panel.setOpaque(false); // Set it back to transparent
        panel.setBackground(new Color(0, 0, 0, 0)); // Reset to transparent
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        panel.setBackground(new Color(0x2B323A)); // Change to a lighter color when mouse enters
        panel.setOpaque(true); // Ensure it shows the background color
    }

    @Override
    public void mouseExited(MouseEvent e) {
        panel.setOpaque(false); // Set it back to transparent
        panel.setBackground(new Color(0, 0, 0, 0)); // Reset to transparent
    }
}
