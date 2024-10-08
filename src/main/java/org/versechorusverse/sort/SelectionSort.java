package org.versechorusverse.sort;

import org.versechorusverse.data.SongData;
import org.versechorusverse.data.ArtistData;
import org.versechorusverse.data.AlbumData;
import org.versechorusverse.datas.Album;
import org.versechorusverse.datas.Artist;

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

    public static void sortAlbumsByListeners(List<AlbumData> dataList, boolean descending) {
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
            AlbumData temp = dataList.get(selected);
            dataList.set(selected, dataList.get(i));
            dataList.set(i, temp);
        }
    }

    public static void sortAlbumsBySongCount(List<AlbumData> dataList, boolean descending) {
        int n = dataList.size();
        for (int i = 0; i < n - 1; i++) {
            int selected = i;
            for (int j = i + 1; j < n; j++) {
                if (descending) {
                    if (dataList.get(j).getSongCount() > dataList.get(selected).getSongCount()) {
                        selected = j;
                    }
                } else {
                    if (dataList.get(j).getSongCount() < dataList.get(selected).getSongCount()) {
                        selected = j;
                    }
                }
            }
            AlbumData temp = dataList.get(selected);
            dataList.set(selected, dataList.get(i));
            dataList.set(i, temp);
        }
    }

    public static void sortAlbumsByYear(List<AlbumData> dataList, boolean descending) {
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
            AlbumData temp = dataList.get(selected);
            dataList.set(selected, dataList.get(i));
            dataList.set(i, temp);
        }
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
