package org.versechorusverse.datas;


import java.util.List;

public class Album {

    private String albumName;
    private int releaseYear;
    private int listeners;
    private int songs;
    private int length; // Duration in minutes
    private String coverPhotoPath;
    private List<Song> song;


    public Album(String albumName, int releaseYear, int listeners, int songs, int length, String coverPhotoPath, List<Song> Song) {
        this.albumName = albumName;
        this.releaseYear = releaseYear;
        this.listeners = listeners;
        this.songs = songs;
        this.length = length;
        this.coverPhotoPath = coverPhotoPath;
        this.song = Song;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getListeners() {
        return listeners;
    }

    public void setListeners(int listeners) {
        this.listeners = listeners;
    }

    public int getSongs() {
        return songs;
    }

    public void setSongs(int songs) {
        this.songs = songs;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getCoverPhotoPath() {
        return coverPhotoPath;
    }

    public void setCoverPhotoPath(String coverPhotoPath) {
        this.coverPhotoPath = coverPhotoPath;
    }

    public List<Song> getSong() {
        return song;
    }

    public void setSong(List<Song> song) {
        this.song = song;
    }
}
