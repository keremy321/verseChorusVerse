package org.versechorusverse.frames;

import org.versechorusverse.datas.Album;
import org.versechorusverse.datas.Artist;
import org.versechorusverse.datas.DataCreate;
import org.versechorusverse.guiCustomizations.*;

import javax.swing.*;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class AlbumsFrame extends JFrame implements ActionListener {

    DataCreate dataCreate = new DataCreate();

    private JComboBox comboBoxChartType;
    private JLabel sort;

    public AlbumsFrame() {
        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setBounds(0, 0, 1016, 839);

        BackgroundImage panel = new BackgroundImage("/albumsPage.png");
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

        String[] chartTypes = {"(Popularity) Least to Greatest", "(Popularity) Greatest to Least", "(Song Count) Least to Greatest", "(Song Count) Greatest to Least", "(Year) Oldest to Newest", "(Year) Newest to Oldest", "(Length) Least to Greatest", "(Length) Greatest to Least"};
        comboBoxChartType = new JComboBox(chartTypes);
        comboBoxChartType.setBounds(468, 100, 300, 32);
        comboBoxChartType.addActionListener(this);
        comboBoxChartType.setFont(new Font("Arial Black", Font.PLAIN, 15));
        comboBoxChartType.setBackground(new Color(0x109456));
        comboBoxChartType.setForeground(Color.WHITE);
        comboBoxChartType.setFocusable(false);
        comboBoxChartType.insertItemAt("Sort By", 0);
        comboBoxChartType.setSelectedIndex(0);
        comboBoxChartType.setAlignmentX(Component.CENTER_ALIGNMENT);

        sort = new JLabel();
        sort.setBounds(790, 100, 132, 32);
        sort.setIcon(new ImageIcon(getClass().getResource("/sort.png")));
        sort.addMouseListener(new SortMouseListener(sort, "/sort.png"));

        JPanel cardPanel = new JPanel();
        cardPanel.setLayout(new GridLayout(0, 1, 10, 0));
        cardPanel.setOpaque(false);

        for (Artist artist : dataCreate.artists) {  // Loop through each artist
            for (Album album : artist.getAlbums()) {  // Loop through each album of the artist
                JPanel artistCard = createArtistCard(
                        album.getAlbumName(),                 // Pass the artist's name
                        album.getReleaseYear(),           // Pass the album's release year
                        album.getListeners(),             // Pass the album's listeners count
                        album.getSongs(),          // Pass the number of songs in the album
                        album.getLength(),                // Pass the album's length
                        album.getCoverPhotoPath()         // Pass the path to the album cover photo
                );
                cardPanel.add(artistCard);            // Add the card to the card panel
            }
        }

        JScrollPane scrollPane = new JScrollPane(cardPanel);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setBounds(75, 170, 850, 550);

        scrollPane.getVerticalScrollBar().setUI(new ModernScrollBarUI());

        scrollPane.setOpaque(false);
        scrollPane.getViewport().setOpaque(false);
        scrollPane.setBorder(BorderFactory.createEmptyBorder());

        this.add(layeredPane);

        layeredPane.add(panel, Integer.valueOf(1));
        layeredPane.add(scrollPane, Integer.valueOf(2));
        layeredPane.add(comboBoxChartType, Integer.valueOf(2));
        layeredPane.add(sort, Integer.valueOf(2));
        layeredPane.add(labelArtists, Integer.valueOf(2));
        layeredPane.add(labelAlbums, Integer.valueOf(2));
        layeredPane.add(labelSongs, Integer.valueOf(2));
        layeredPane.add(labelLogo, Integer.valueOf(2));

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

    private JPanel createArtistCard(String artistName, int year ,int listeners, int songs, int length, String photoPath) {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1, 6, 10, 10));
        panel.setBackground(new Color(0, 0, 0, 0));
        panel.setOpaque(false);

        LineBorder topBorder = new LineBorder(new Color(0x8C67BB), 1, true);
        LineBorder bottomBorder = new LineBorder(new Color(0x8C67BB), 1, true);
        CompoundBorder compoundBorder = new CompoundBorder(topBorder, new EmptyBorder(0, 0, 0, 0));

        panel.setBorder(compoundBorder);

        JLabel photoLabel = new JLabel();
        ImageIcon artistPhoto = loadImageIcon(photoPath);
        if (artistPhoto != null) {
            Image img = artistPhoto.getImage();
            Image scaledImg = img.getScaledInstance(100, 100, Image.SCALE_SMOOTH); // Resize to 100x100 pixels
            photoLabel.setIcon(new ImageIcon(scaledImg));
        } else {
            photoLabel.setText("No Image");
            photoLabel.setHorizontalAlignment(JLabel.CENTER);
        }

        String truncatedName = truncateText(artistName, 20); // Set a limit, e.g., 20 characters

        JLabel nameLabel = new JLabel(truncatedName);
        nameLabel.setFont(new Font("Roboto Black", Font.BOLD, 20));
        nameLabel.setForeground(Color.WHITE);
        nameLabel.setPreferredSize(new Dimension(200, 30));  // Set a constant width for the name label
        nameLabel.setHorizontalAlignment(JLabel.LEFT);

        JLabel yearLabel = new JLabel("Released in " + year);
        yearLabel.setForeground(Color.WHITE);
        JLabel listenersLabel = new JLabel(listeners + " plays");
        listenersLabel.setForeground(Color.WHITE);
        JLabel songsLabel = new JLabel(songs + " Songs");
        songsLabel.setForeground(Color.WHITE);
        JLabel lengthLabel = new JLabel(length + " min");
        lengthLabel.setForeground(Color.WHITE);

        panel.add(photoLabel);
        panel.add(nameLabel);
        panel.add(listenersLabel);
        panel.add(songsLabel);
        panel.add(lengthLabel);
        panel.add(yearLabel);

        panel.addMouseListener(new CardMouseListener(panel, this, "album"));

        return panel;
    }

    private ImageIcon loadImageIcon(String path) {
        try {
            URL imgURL = getClass().getResource(path);
            if (imgURL != null) {
                return new ImageIcon(imgURL);
            } else {
                System.err.println("Couldn't find file: " + path);
                return null;
            }
        } catch (Exception e) {
            System.err.println("Error loading image: " + e.getMessage());
            return null;
        }
    }

    private String truncateText(String text, int maxLength) {
        if (text.length() <= maxLength) {
            return text;
        }
        return text.substring(0, maxLength) + "...";
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

