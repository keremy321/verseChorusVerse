package org.versechorusverse.frames;

import org.versechorusverse.guiCustomizations.BackgroundImage;
import org.versechorusverse.guiCustomizations.ButtonMouseListener;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;


public class MainFrame extends JFrame implements ActionListener {
    JButton buttonArtist;
    JButton buttonAlbum;
    JButton buttonSong;

    public MainFrame() {
        ImageIcon effect = null;
        try {
            URL effectURL = getClass().getResource("/effect.png");
            if (effectURL != null) {
                effect = new ImageIcon(effectURL);
            } else {
                System.err.println("Resource not found");
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setBounds(0,0,1016,839);

        BackgroundImage panel = new BackgroundImage("/home.png");
        panel.setBounds(0, 0, 1000, 800);

        JLabel effectArtist = new JLabel();
        effectArtist.setIcon(effect);
        effectArtist.setBounds(105, 429, 254, 254);
        effectArtist.setVisible(false);

        buttonArtist = new JButton();
        buttonArtist.setBounds(132, 456, 200, 200);
        buttonArtist.setFocusable(false);
        buttonArtist.setBorderPainted(false);
        buttonArtist.addActionListener(this);
        buttonArtist.setContentAreaFilled(false);
        buttonArtist.addMouseListener(new ButtonMouseListener(effectArtist, "/greenEffect.png"));

        JLabel effectAlbum = new JLabel();
        effectAlbum.setIcon(effect);
        effectAlbum.setBounds(386, 429, 254, 254);
        effectAlbum.setVisible(false);

        buttonAlbum = new JButton();
        buttonAlbum.setBounds(413, 456, 200, 200);
        buttonAlbum.setFocusable(false);
        buttonAlbum.setBorderPainted(false);
        buttonAlbum.addActionListener(this);
        buttonAlbum.setContentAreaFilled(false);
        buttonAlbum.addMouseListener(new ButtonMouseListener(effectAlbum, "/greenEffect.png"));

        JLabel effectSong = new JLabel();
        effectSong.setIcon(effect);
        effectSong.setBounds(667, 429, 254, 254);
        effectSong.setVisible(false);

        buttonSong = new JButton();
        buttonSong.setBounds(694, 456, 200, 200);
        buttonSong.setFocusable(false);
        buttonSong.setBorderPainted(false);
        buttonSong.addActionListener(this);
        buttonSong.setContentAreaFilled(false);
        buttonSong.addMouseListener(new ButtonMouseListener(effectSong, "/greenEffect.png"));

        this.add(layeredPane);

        layeredPane.add(panel);
        layeredPane.add(buttonArtist, Integer.valueOf(1));
        layeredPane.add(buttonAlbum, Integer.valueOf(1));
        layeredPane.add(buttonSong, Integer.valueOf(1));
        layeredPane.add(effectArtist, Integer.valueOf(1));
        layeredPane.add(effectAlbum, Integer.valueOf(1));
        layeredPane.add(effectSong, Integer.valueOf(1));

        ImageIcon icon = new ImageIcon(this.getClass().getResource("/icon.png"));
        this.setIconImage(icon.getImage());

        this.setLayout(null);
        this.setTitle("VerseChorusVerse");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1016, 839);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setResizable(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == buttonArtist) {
            System.out.println("Artist");
            this.dispose();
            ArtistsFrame artistsFrame = new ArtistsFrame();
        }
        if (e.getSource() == buttonAlbum) {
            this.dispose();
            AlbumsFrame albumsFrame = new AlbumsFrame();
        }
        if (e.getSource() == buttonSong) {
            this.dispose();
            SongsFrame songsFrame = new SongsFrame();
        }
    }
}
