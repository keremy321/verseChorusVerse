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

public class ArtistFrame extends JFrame implements ActionListener {
    DataCreate dataCreate = new DataCreate();

    private JComboBox comboBoxChartType;
    JLabel sort;

    public ArtistFrame(Artist artist) {

        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setBounds(0, 0, 1016, 839);

        BackgroundImage panel = new BackgroundImage("/artistPage.png");
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

        JLabel labelPhoto = new JLabel();
        labelPhoto.setBounds(75, 117, 200, 200);

        ImageIcon artistPhoto = loadImageIcon("/artistPhoto/greenday.jpg");
        if (artistPhoto != null) {
            Image img = artistPhoto.getImage();
            Image scaledImg = img.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
            labelPhoto.setIcon(new ImageIcon(scaledImg));
        } else {
            labelPhoto.setText("No Image");
            labelPhoto.setHorizontalAlignment(JLabel.CENTER);
        }

        JLabel artistName = new JLabel();
        artistName.setText(artist.getArtistName());
        artistName.setBounds(317, 117, 760, 53);
        artistName.setFont(new Font("Akira Expanded", Font.PLAIN, 40));
        artistName.setForeground(Color.WHITE);

        JLabel labelBio = new JLabel();
        labelBio.setBounds(317, 184, 608, 135);
        labelBio.setText(artist.getBiography());
        labelBio.setFont(new Font("Roboto Light", Font.PLAIN, 15));
        labelBio.setForeground(Color.WHITE);
        labelBio.setHorizontalAlignment(SwingConstants.LEFT);
        labelBio.setVerticalAlignment(SwingConstants.TOP);

        String[] chartTypes = {"(Popularity) Least to Greatest", "(Popularity) Greatest to Least", "(Song Count) Least to Greatest", "(Song Count) Greatest to Least"};
        comboBoxChartType = new JComboBox(chartTypes);
        comboBoxChartType.setBounds(468, 341, 300, 32);
        comboBoxChartType.addActionListener(this);
        comboBoxChartType.setFont(new Font("Arial Black", Font.PLAIN, 15));
        comboBoxChartType.setBackground(new Color(0x109456));
        comboBoxChartType.setForeground(Color.WHITE);
        comboBoxChartType.setFocusable(false);
        comboBoxChartType.insertItemAt("Sort By", 0);
        comboBoxChartType.setSelectedIndex(0);
        comboBoxChartType.setAlignmentX(Component.CENTER_ALIGNMENT);

        sort = new JLabel();
        sort.setBounds(790, 341, 132, 32);
        sort.setIcon(new ImageIcon(getClass().getResource("/sort.png")));
        sort.addMouseListener(new SortMouseListener(sort, "/sort.png"));

        JPanel cardPanel = new JPanel();
        cardPanel.setLayout(new GridLayout(0, 1, 10, 0));
        cardPanel.setOpaque(false);

        for (int i = 0; i < artist.getAlbums().size(); i++) {
            Album album = artist.getAlbums().get(i);
            JPanel artistCard = createArtistCard(album.getAlbumName(), album.getReleaseYear() ,album.getListeners(), album.getSongs(), album.getLength() ,album.getCoverPhotoPath());


            artistCard.setName(album.getAlbumName());

            artistCard.addMouseListener(new CardMouseListener(artistCard, this, "album", artist, album));

            cardPanel.add(artistCard);
        }

        JScrollPane scrollPane = new JScrollPane(cardPanel);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setBounds(75, 397, 850, 339);

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
        layeredPane.add(labelPhoto, Integer.valueOf(1));
        layeredPane.add(artistName, Integer.valueOf(1));
        layeredPane.add(labelBio, Integer.valueOf(1));
        layeredPane.add(comboBoxChartType, Integer.valueOf(1));
        layeredPane.add(sort, Integer.valueOf(1));
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

        JLabel nameLabel = new JLabel(artistName);
        nameLabel.setFont(new Font("Roboto Black", Font.BOLD, 20));
        nameLabel.setForeground(Color.WHITE);
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

//        panel.addMouseListener(new CardMouseListener(panel, this, "album"));

        return panel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

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
}
