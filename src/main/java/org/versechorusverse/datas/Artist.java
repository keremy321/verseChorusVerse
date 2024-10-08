package org.versechorusverse.datas;


import java.util.List;

public class Artist {
    int id;
    private String artistName;
    private int year;
    private int listeners;
    private int songs;
    private String photoPath;
    private String foundingDate;
    private String biography;
    private List<Album> albums;

    public Artist(int id,String artistName, int year, int listeners, int songs, String photoPath, String foundingDate, String biography, List<Album> albums) {
        this.id = id;
        this.artistName = artistName;
        this.year = year;
        this.listeners = listeners;
        this.songs = songs;
        this.photoPath = photoPath;
        this.foundingDate = foundingDate;
        this.biography = biography;
        this.albums = albums;


    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
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

    public String getPhotoPath() {
        return photoPath;
    }

    public void setPhotoPath(String photoPath) {
        this.photoPath = photoPath;
    }

    public String getFoundingDate() {
        return foundingDate;
    }

    public void setFoundingDate(String foundingDate) {
        this.foundingDate = foundingDate;
    }

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }

    public List<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(List<Album> albums) {
        this.albums = albums;
    }
}

