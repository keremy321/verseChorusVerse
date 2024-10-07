package org.versechorusverse.frames;

import org.versechorusverse.guiCustomizations.BackgroundImage;
import org.versechorusverse.guiCustomizations.MenuMouseListener;
import org.versechorusverse.guiCustomizations.ModernScrollBarUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LyricsFrame extends JFrame implements ActionListener {
    public LyricsFrame() {
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
        songName.setText("SONG NAME");
        songName.setBounds(0, 61, 1000, 98);
        songName.setFont(new Font("Akira Expanded", Font.PLAIN, 40));
        songName.setForeground(new Color(0x8c67bb));
        songName.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel lyricsLabel = new JLabel();
        lyricsLabel.setText("<html><div style='text-align: center;'>Do you know what's worth fighting for<br>\n" +
                "When it's not worth dying for?<br>\n" +
                "Does it take your breath away<br>\n" +
                "And you feel yourself suffocating<br>\n" +
                "Does the pain weigh out the pride?<br>\n" +
                "And you look for a place to hide<br>\n" +
                "Did someone break your heart inside<br>\n" +
                "You're in ruins<br><br>\n" +
                "\n" +
                "One, 21 Guns<br>\n" +
                "Lay down your arms<br>\n" +
                "Give up the fight<br>\n" +
                "One, 21 Guns<br>\n" +
                "Throw up your arms into the sky<br>\n" +
                "You and I<br><br>\n" +
                "\n" +
                "When you're at the end of the road<br>\n" +
                "And you lost all sense of control<br>\n" +
                "And your thoughts have taken their toll<br>\n" +
                "When your mind breaks the spirit of your soul<br>\n" +
                "Your faith walks on broken glass<br>\n" +
                "And the hangover doesn't pass<br>\n" +
                "Nothing's ever built to last<br>\n" +
                "You're in ruins<br><br>\n" +
                "\n" +
                "One, 21 Guns<br>\n" +
                "Lay down your arms<br>\n" +
                "Give up the fight<br>\n" +
                "One, 21 Guns<br>\n" +
                "Throw up your arms into the sky<br>\n" +
                "You and I<br><br>\n" +
                "\n" +
                "Did you try to live on your own<br>\n" +
                "When you burned down the house and home?<br>\n" +
                "Did you stand too close to the fire<br>\n" +
                "Like a liar looking for forgiveness from a stone?<br><br>\n" +
                "\n" +
                "When it's time to live and let die<br>\n" +
                "And you can't get another try<br>\n" +
                "Something inside this heart has died<br>\n" +
                "You're in ruins<br><br>\n" +
                "\n" +
                "One, 21 Guns<br>\n" +
                "Lay down your arms<br>\n" +
                "Give up the fight<br>\n" +
                "One, 21 Guns<br>\n" +
                "Throw up your arms into the sky<br>\n" +
                "One, 21 Guns<br>\n" +
                "Lay down your arms<br>\n" +
                "Give up the fight<br>\n" +
                "One, 21 Guns<br>\n" +
                "Throw up your arms into the sky<br><br>\n" +
                "\n" +
                "You and I</div></html>");
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