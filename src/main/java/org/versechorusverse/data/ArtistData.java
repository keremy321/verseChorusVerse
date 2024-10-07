package org.versechorusverse.data;

public class ArtistData {
    private String artistName;
    private int year;
    private int listeners;
    private int songs;
    private String photoPath;

    public ArtistData(String artistName, int year, int listeners, int songs, String photoPath) {
        this.artistName = artistName;
        this.year = year;
        this.listeners = listeners;
        this.songs = songs;
        this.photoPath = photoPath;
    }

    public String getArtistName() {
        return artistName;
    }

    public int getYear() {
        return year;
    }

    public int getListeners() {
        return listeners;
    }

    public int getSongCount() {
        return songs;
    }

    public String getPhotoPath() {
        return photoPath;
    }
}

