package org.versechorusverse;

import org.versechorusverse.datas.Album;
import org.versechorusverse.datas.Artist;
import org.versechorusverse.datas.Song;
import org.versechorusverse.datas.DataCreate;
import org.versechorusverse.frames.MainFrame;

import javax.xml.crypto.Data;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MainFrame mainFrame = new MainFrame();
//        mainFrame.setVisible(true);
//        dataCreate DataCreator = new dataCreate();
//        System.out.println(DataCreator.artists.get(2).getAlbums().stream().count());
//        System.out.println(DataCreator.artists.get(3).getAlbums().stream().count());
//        System.out.println(DataCreator.artists.get(4).getAlbums().stream().count());
//        //artistte framde örnek kod var
//



        // Sanatçıları listele
       /* for (Artist artist : DataCreator.artists) {
            System.out.println("Sanatçı: " + artist.getArtistName());
            System.out.println("Kuruluş Yılı: " + artist.getFoundingDate());
            System.out.println("Dinleyici Sayısı: " + artist.getListeners());
            System.out.println("Biyografi: " + artist.getBiography());
            System.out.println("Albüm Sayısı: " + artist.getAlbums().size());
            System.out.println("Albümleri:");

            // Albümleri listele
            for (Album album : artist.getAlbums()) {
                System.out.println("  Albüm: " + album.getAlbumName());
                System.out.println("  Yayın Yılı: " + album.getReleaseYear());
                System.out.println("  Dinleyici Sayısı: " + album.getListeners());
                System.out.println("  Şarkı Sayısı: " + album.getSongs());
                System.out.println("  Albüm Süresi: " + album.getLength() + " dakika");
                System.out.println("  Şarkılar:");

                // Şarkıları listele
                for (Song song : album.getSong()) {
                    System.out.println("    Şarkı: " + song.getSongName());
                    System.out.println("    Yayın Yılı: " + song.getReleaseYear());
                    System.out.println("    Dinleyici Sayısı: " + song.getListeners());
                    System.out.println("    Şarkı Süresi: " + song.getLength() + " dakika");
                    System.out.println("    Şarkı Sözleri: " + song.getLyrics());
                    System.out.println();
                }
                System.out.println();
            }
            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        }*/

    }
}