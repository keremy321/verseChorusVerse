package org.versechorusverse.sort;

import org.versechorusverse.data.SongData;
import org.versechorusverse.data.ArtistData;
import org.versechorusverse.data.AlbumData;

import java.util.List;

public class SelectionSort {

    public static void sortArtistsByListeners(List<ArtistData> dataList, boolean descending) {
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
            ArtistData temp = dataList.get(selected);
            dataList.set(selected, dataList.get(i));
            dataList.set(i, temp);
        }
    }

    public static void sortArtistsBySongCount(List<ArtistData> dataList, boolean descending) {
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
            ArtistData temp = dataList.get(selected);
            dataList.set(selected, dataList.get(i));
            dataList.set(i, temp);
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
