package org.versechorusverse.frames;

import org.versechorusverse.datas.Album;
import org.versechorusverse.datas.Artist;
import org.versechorusverse.datas.Song;
import org.versechorusverse.guiCustomizations.BackgroundImage;
import org.versechorusverse.guiCustomizations.MenuMouseListener;
import org.versechorusverse.guiCustomizations.ModernScrollBarUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LyricsFrame extends JFrame implements ActionListener {

    public LyricsFrame(Artist artist, Album album, Song song) {
        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setBounds(0, 0, 1016, 839);

        BackgroundImage panel = new BackgroundImage("/lyricsPage.png");
        panel.setBounds(0, 0, 1000, 800);

        JLabel labelLogo = new JLabel();
        labelLogo.setIcon(new ImageIcon(getClass().getResource("/words/logoWhite.png")));
        labelLogo.setBounds(67, 17, 242, 24);
        labelLogo.addMouseListener(new MenuMouseListener(labelLogo, "/words/artistsWhite.png", "logo", this));

        JLabel labelArtists = new JLabel();
        labelArtists.setIcon(new ImageIcon(getClass().getResource("/words/artistsWhite.png")));
        labelArtists.setBounds(358, 20, 165, 19);
        labelArtists.addMouseListener(new MenuMouseListener(labelArtists, "/words/artistsWhite.png", "artists", this));

        JLabel labelAlbums = new JLabel();
        labelAlbums.setIcon(new ImageIcon(getClass().getResource("/words/albumsWhite.png")));
        labelAlbums.setBounds(583, 20, 165, 19);
        labelAlbums.addMouseListener(new MenuMouseListener(labelAlbums, "/words/albumsWhite.png", "albums", this));

        JLabel labelSongs = new JLabel();
        labelSongs.setIcon(new ImageIcon(getClass().getResource("/words/songsWhite.png")));
        labelSongs.setBounds(808, 20, 132, 19);
        labelSongs.addMouseListener(new MenuMouseListener(labelSongs, "/words/songsWhite.png", "songs", this));

        JLabel songName = new JLabel();
        songName.setText(song.getSongName());
        songName.setBounds(0, 61, 1000, 98);
        songName.setFont(new Font("Akira Expanded", Font.PLAIN, 40));
        songName.setForeground(new Color(0x8c67bb));
        songName.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel lyricsLabel = new JLabel();
        lyricsLabel.setText("<html>" + song.getLyrics().replace("\n", "<br>") + "</html>");
        lyricsLabel.setFont(new Font("Franklin Gothic Heavy", Font.BOLD, 30)); // Updated font size for better visibility
        lyricsLabel.setForeground(new Color(0xFFE8E8E8, true));
        lyricsLabel.setHorizontalAlignment(SwingConstants.CENTER); // Center horizontally
        lyricsLabel.setVerticalAlignment(SwingConstants.TOP); // Align at the top, but will scroll vertically if needed
        lyricsLabel.setVerticalTextPosition(SwingConstants.TOP); // Ensure vertical positioning is at the top

// Scroll pane with the lyrics label
        JScrollPane scrollPane = new JScrollPane(lyricsLabel);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setBounds(0, 160, 1000, 570);

// Styling the scroll bar
        scrollPane.getVerticalScrollBar().setUI(new ModernScrollBarUI());
        scrollPane.setOpaque(false);
        scrollPane.getViewport().setOpaque(false);
        scrollPane.setBorder(BorderFactory.createEmptyBorder());

        this.add(layeredPane);

        layeredPane.add(panel);
        layeredPane.add(labelLogo, Integer.valueOf(1));
        layeredPane.add(labelArtists, Integer.valueOf(1));
        layeredPane.add(labelAlbums, Integer.valueOf(1));
        layeredPane.add(labelSongs, Integer.valueOf(1));
        layeredPane.add(songName, Integer.valueOf(1));
        layeredPane.add(scrollPane, Integer.valueOf(1));

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
// Handle actions here

    }
}