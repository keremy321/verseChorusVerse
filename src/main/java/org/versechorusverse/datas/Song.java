package org.versechorusverse.datas;


public class Song {

    private String songName;
    private int listeners;
    private int length; // Song duration in minutes
    private int releaseYear;
    private String coverPhotoPath;
    private String lyrics;

    public Song(String songName, int listeners, int length, int releaseYear, String coverPhotoPath, String lyrics) {
        this.songName = songName;
        this.listeners = listeners;
        this.length = length;
        this.releaseYear = releaseYear;
        this.coverPhotoPath = coverPhotoPath;
        this.lyrics = lyrics;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public int getListeners() {
        return listeners;
    }

    public void setListeners(int listeners) {
        this.listeners = listeners;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getCoverPhotoPath() {
        return coverPhotoPath;
    }

    public void setCoverPhotoPath(String coverPhotoPath) {
        this.coverPhotoPath = coverPhotoPath;
    }

    public String getLyrics() {
        return lyrics;
    }

    public void setLyrics(String lyrics) {
        this.lyrics = lyrics;
    }
}
