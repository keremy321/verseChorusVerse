package org.versechorusverse.sort;

import org.versechorusverse.data.SongData;
import org.versechorusverse.data.ArtistData;
import org.versechorusverse.data.AlbumData;
import org.versechorusverse.datas.Album;
import org.versechorusverse.datas.Artist;
import org.versechorusverse.datas.Song;

import java.util.ArrayList;
import java.util.List;

public class SelectionSort {

    public static void sortArtistsByListeners(List<Artist> artists, boolean descending) {
        int n = artists.size();
        for (int i = 0; i < n - 1; i++) {
            int selected = i;
            for (int j = i + 1; j < n; j++) {
                if (descending) {
                    if (artists.get(j).getListeners() > artists.get(selected).getListeners()) {
                        selected = j;
                    }
                } else {
                    if (artists.get(j).getListeners() < artists.get(selected).getListeners()) {
                        selected = j;
                    }
                }
            }


            // Swap
            Artist temp = artists.get(selected);
            artists.set(selected, artists.get(i));
            artists.set(i, temp);
        }
    }

    public static void sortArtistsByYear(List<Artist> artists, boolean descending) {
        int n = artists.size();
        for (int i = 0; i < n - 1; i++) {
            int selected = i;
            for (int j = i + 1; j < n; j++) {
                if (descending) {
                    if (artists.get(j).getYear() > artists.get(selected).getYear()) {
                        selected = j;
                    }
                } else {
                    if (artists.get(j).getYear() < artists.get(selected).getYear()) {
                        selected = j;
                    }
                }
            }
            Artist temp = artists.get(selected);
            artists.set(selected, artists.get(i));
            artists.set(i, temp);
        }
    }

    public static void sortArtistsBySongCount(List<Artist> artists, boolean descending) {
        int n = artists.size();
        for (int i = 0; i < n - 1; i++) {
            int selected = i;
            for (int j = i + 1; j < n; j++) {
                if (descending) {
                    if (artists.get(j).getSongs() > artists.get(selected).getSongs()) {
                        selected = j;
                    }
                } else {
                    if (artists.get(j).getSongs() < artists.get(selected).getSongs()) {
                        selected = j;
                    }
                }
            }
            Artist temp = artists.get(selected);
            artists.set(selected, artists.get(i));
            artists.set(i, temp);
        }
    }

    public static List<Album> sortAlbumsByListeners(List<Artist> artists, boolean descending) {
        List<Album> albums = new ArrayList<>();
        for (Artist artist : artists) {
            for (Album album : artist.getAlbums()) {
                albums.add(album);
            }
        }
        int n = albums.size();
        for (int i = 0; i < n - 1; i++) {
            int selected = i;
            for (int j = i + 1; j < n; j++) {
                if (descending) {
                    if (albums.get(j).getListeners() > albums.get(selected).getListeners()) {
                        selected = j;
                    }
                } else {
                    if (albums.get(j).getListeners() < albums.get(selected).getListeners()) {
                        selected = j;
                    }
                }
            }
            // Swap
            Album temp = albums.get(selected);
            albums.set(selected, albums.get(i));
            albums.set(i, temp);
        }
        return albums;
    }

    public static List<Album> sortAlbumsByYear(List<Artist> artists, boolean descending) {
        List<Album> albums = new ArrayList<>();
        for (Artist artist : artists) {
            for (Album album : artist.getAlbums()) {
                albums.add(album);
            }
        }
        int n = albums.size();
        for (int i = 0; i < n - 1; i++) {
            int selected = i;
            for (int j = i + 1; j < n; j++) {
                if (descending) {
                    if (albums.get(j).getReleaseYear() > albums.get(selected).getReleaseYear()) {
                        selected = j;
                    }
                } else {
                    if (albums.get(j).getReleaseYear() < albums.get(selected).getReleaseYear()) {
                        selected = j;
                    }
                }
            }
            Album temp = albums.get(selected);
            albums.set(selected, albums.get(i));
            albums.set(i, temp);
        }
        return albums;
    }

    public static List<Song> sortSongsByListeners(List<Artist> artists, boolean descending) {
        List<Song> songs = new ArrayList<>();
        for (Artist artist : artists) {
            for(Album album : artist.getAlbums()) {
                for (Song song: album.getSong()){
                    songs.add(song);
                }
            }
        }

        int n = songs.size();
        for (int i = 0; i < n - 1; i++) {
            int selected = i;
            for (int j = i + 1; j < n; j++) {
                if (descending) {
                    if (songs.get(j).getListeners() > songs.get(selected).getListeners()) {
                        selected = j;
                    }
                } else {
                    if (songs.get(j).getListeners() < songs.get(selected).getListeners()) {
                        selected = j;
                    }
                }
            }
            // Swap
            Song temp = songs.get(selected);
            songs.set(selected, songs.get(i));
            songs.set(i, temp);
        }
        return songs;
    }

    public static List<Song> sortSongsByLength(List<Artist> artists, boolean descending) {
        List<Song> songs = new ArrayList<>();
        for (Artist artist : artists) {
            for(Album album : artist.getAlbums()) {
                for (Song song: album.getSong()){
                    songs.add(song);
                }
            }
        }
        int n = songs.size();
        for (int i = 0; i < n - 1; i++) {
            int selected = i;
            for (int j = i + 1; j < n; j++) {
                if (descending) {
                    if (songs.get(j).getLength() > songs.get(selected).getLength()) {
                        selected = j;
                    }
                } else {
                    if (songs.get(j).getLength() < songs.get(selected).getLength()) {
                        selected = j;
                    }
                }
            }
            Song temp = songs.get(selected);
            songs.set(selected, songs.get(i));
            songs.set(i, temp);
        }
        return songs;
    }
    public static List<Album> sortAlbumByListeners(List<Album> albums, boolean descending) {
//        List<Album> albums = new ArrayList<>();
//
//        for (Album album : artist.getAlbums()) {
//                albums.add(album);
//            }
        int n = albums.size();
        for (int i = 0; i < n - 1; i++) {
            int selected = i;
            for (int j = i + 1; j < n; j++) {
                if (descending) {
                    if (albums.get(j).getListeners() > albums.get(selected).getListeners()) {
                        selected = j;
                    }
                } else {
                    if (albums.get(j).getListeners() < albums.get(selected).getListeners()) {
                        selected = j;
                    }
                }
            }
            // Swap
            Album temp = albums.get(selected);
            albums.set(selected, albums.get(i));
            albums.set(i, temp);
        }
        return albums;
    }
    public static List<Album> sortAlbumByYear(List<Album> albums, boolean descending) {
//        List<Album> albums = new ArrayList<>();
//
//        for (Album album : artist.getAlbums()) {
//            albums.add(album);
//        }
        int n = albums.size();
        for (int i = 0; i < n - 1; i++) {
            int selected = i;
            for (int j = i + 1; j < n; j++) {
                if (descending) {
                    if (albums.get(j).getReleaseYear() > albums.get(selected).getReleaseYear()) {
                        selected = j;
                    }
                } else {
                    if (albums.get(j).getReleaseYear() < albums.get(selected).getReleaseYear()) {
                        selected = j;
                    }
                }
            }
            // Swap
            Album temp = albums.get(selected);
            albums.set(selected, albums.get(i));
            albums.set(i, temp);
        }
        return albums;
    }
}
