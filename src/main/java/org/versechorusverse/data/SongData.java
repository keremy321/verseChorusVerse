package org.versechorusverse.data;

public class SongData {

    private String songName;
    private int listeners;
    private int length; // Song duration in minutes
    private int releaseYear;
    private String coverPhotoPath;

    public SongData(String songName, int listeners, int length, int releaseYear, String coverPhotoPath) {
        this.songName = songName;
        this.listeners = listeners;
        this.length = length;
        this.releaseYear = releaseYear;
        this.coverPhotoPath = coverPhotoPath;
    }

    public String getSongName() {
        return songName;
    }

    public int getListeners() {
        return listeners;
    }

    public int getLength() {
        return length;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public String getCoverPhotoPath() {
        return coverPhotoPath;
    }
}
