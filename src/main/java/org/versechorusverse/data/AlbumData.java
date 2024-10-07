package org.versechorusverse.data;

public class AlbumData {

    private String albumName;
    private int releaseYear;
    private int listeners;
    private int songs;
    private int length; // Duration in minutes
    private String coverPhotoPath;

    public AlbumData(String albumName, int releaseYear, int listeners, int songs, int length, String coverPhotoPath) {
        this.albumName = albumName;
        this.releaseYear = releaseYear;
        this.listeners = listeners;
        this.songs = songs;
        this.length = length;
        this.coverPhotoPath = coverPhotoPath;
    }

    public String getAlbumName() {
        return albumName;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public int getListeners() {
        return listeners;
    }

    public int getSongCount() {
        return songs;
    }

    public int getLength() {
        return length;
    }

    public String getCoverPhotoPath() {
        return coverPhotoPath;
    }
}
