package org.versechorusverse.sort;

import org.versechorusverse.data.SongData;
import org.versechorusverse.data.ArtistData;
import org.versechorusverse.data.AlbumData;
import org.versechorusverse.datas.Album;
import org.versechorusverse.datas.Artist;

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
        for(Artist artist : artists) {
            for(Album album : artist.getAlbums()) {
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
        for(Artist artist : artists) {
            for(Album album : artist.getAlbums()) {
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

    public static void sortSongsByListeners(List<SongData> dataList, boolean descending) {
        int n = dataList.size();
        for (int i = 0; i < n - 1; i++) {
            int selected = i;
            for (int j = i + 1; j < n; j++) {
                if (descending) {
                    if (dataList.get(j).getListeners() > dataList.get(selected).getListeners()) {
                        selected = j;
                    }
                } else {
                    if (dataList.get(j).getListeners() < dataList.get(selected).getListeners()) {
                        selected = j;
                    }
                }
            }
            // Swap
            SongData temp = dataList.get(selected);
            dataList.set(selected, dataList.get(i));
            dataList.set(i, temp);
        }
    }

    public static void sortSongsByLength(List<SongData> dataList, boolean descending) {
        int n = dataList.size();
        for (int i = 0; i < n - 1; i++) {
            int selected = i;
            for (int j = i + 1; j < n; j++) {
                if (descending) {
                    if (dataList.get(j).getLength() > dataList.get(selected).getLength()) {
                        selected = j;
                    }
                } else {
                    if (dataList.get(j).getLength() < dataList.get(selected).getLength()) {
                        selected = j;
                    }
                }
            }
            SongData temp = dataList.get(selected);
            dataList.set(selected, dataList.get(i));
            dataList.set(i, temp);
        }
    }

    public static void sortSongsByYear(List<SongData> dataList, boolean descending) {
        int n = dataList.size();
        for (int i = 0; i < n - 1; i++) {
            int selected = i;
            for (int j = i + 1; j < n; j++) {
                if (descending) {
                    if (dataList.get(j).getReleaseYear() > dataList.get(selected).getReleaseYear()) {
                        selected = j;
                    }
                } else {
                    if (dataList.get(j).getReleaseYear() < dataList.get(selected).getReleaseYear()) {
                        selected = j;
                    }
                }
            }
            SongData temp = dataList.get(selected);
            dataList.set(selected, dataList.get(i));
            dataList.set(i, temp);
        }
    }
}
