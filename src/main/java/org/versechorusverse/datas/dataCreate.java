package org.versechorusverse.datas;

import java.util.ArrayList;
import java.util.List;

public class dataCreate {

    // Green Day için albüm ve şarkı listeleri
    List<Song> songs1 = new ArrayList<>(); // Birinci albümün şarkıları
    List<Song> songs2 = new ArrayList<>(); // İkinci albümün şarkıları
    List<Song> songs3 = new ArrayList<>(); // Üçüncü albümün şarkıları
    List<Song> songs4 = new ArrayList<>(); // Dördüncü albümün şarkıları
    List<Song> songs5 = new ArrayList<>(); // Beşinci albümün şarkıları
    List<Album> albumsGreenDay = new ArrayList<>(); // Albümler listesi

    public List<Artist> artists = new ArrayList<>();

    public void createGreenDayData() {
        // Albüm 1: Dookie (1994)
        Song song1 = new Song("Basket Case", 500000000, 3, 1994, "path/to/cover.jpg",
                "Do you have the time to listen to me whine...\n" +
                        "About nothing and everything all at once\n" +
                        "I am one of those melodramatic fools...");
        Song song2 = new Song("When I Come Around", 450000000, 3, 1994, "path/to/cover.jpg",
                "I heard you crying loud...\n" +
                        "All the way across town...\n" +
                        "You've been searching for that someone...");
        Song song3 = new Song("Longview", 350000000, 3, 1994, "path/to/cover.jpg",
                "I sit around and watch the tube, but nothing's on...");
        Song song4 = new Song("Welcome to Paradise", 420000000, 3, 1994, "path/to/cover.jpg",
                "Dear mother, can you hear me whining?\n" +
                        "It's been three whole weeks since that I have left your home...");
        Song song5 = new Song("She", 380000000, 2, 1994, "path/to/cover.jpg",
                "She... she screams in silence...\n" +
                        "A sullen riot penetrating through her mind...");
        songs1.add(song1);
        songs1.add(song2);
        songs1.add(song3);
        songs1.add(song4);
        songs1.add(song5);
        Album album1 = new Album("Dookie", 1994, 600000000, songs1.size(), 39, "path/to/cover.jpg", songs1);

        // Albüm 2: American Idiot (2004)
        Song song6 = new Song("American Idiot", 700000000, 3, 2004, "path/to/cover.jpg",
                "Don't wanna be an American idiot...\n" +
                        "Don't want a nation under the new media...");
        Song song7 = new Song("Boulevard of Broken Dreams", 750000000, 4, 2004, "path/to/cover.jpg",
                "I walk a lonely road, the only one that I have ever known...");
        Song song8 = new Song("Holiday", 580000000, 3, 2004, "path/to/cover.jpg",
                "Hear the sound of the falling rain...\n" +
                        "Coming down like an Armageddon flame...");
        Song song9 = new Song("Wake Me Up When September Ends", 900000000, 4, 2004, "path/to/cover.jpg",
                "Summer has come and passed\n" +
                        "The innocent can never last...");
        Song song10 = new Song("Jesus of Suburbia", 670000000, 9, 2004, "path/to/cover.jpg",
                "I'm the son of rage and love...\n" +
                        "The Jesus of Suburbia...");
        songs2.add(song6);
        songs2.add(song7);
        songs2.add(song8);
        songs2.add(song9);
        songs2.add(song10);
        Album album2 = new Album("American Idiot", 2004, 800000000, songs2.size(), 57, "path/to/cover.jpg", songs2);

        // Albüm 3: Nimrod (1997)
        Song song11 = new Song("Good Riddance (Time of Your Life)", 500000000, 2, 1997, "path/to/cover.jpg",
                "Another turning point, a fork stuck in the road...\n" +
                        "Time grabs you by the wrist, directs you where to go...");
        Song song12 = new Song("Hitchin' a Ride", 340000000, 3, 1997, "path/to/cover.jpg",
                "Hey mister, where you headed?\n" +
                        "Are you in a hurry?");
        Song song13 = new Song("Redundant", 270000000, 3, 1997, "path/to/cover.jpg",
                "We're living in repetition...");
        Song song14 = new Song("Nice Guys Finish Last", 310000000, 3, 1997, "path/to/cover.jpg",
                "Nice guys finish last...\n" +
                        "You're running out of gas...");
        Song song15 = new Song("King for a Day", 290000000, 3, 1997, "path/to/cover.jpg",
                "Started at the age of four...\n" +
                        "My mother went to the grocery store...");
        songs3.add(song11);
        songs3.add(song12);
        songs3.add(song13);
        songs3.add(song14);
        songs3.add(song15);
        Album album3 = new Album("Nimrod", 1997, 450000000, songs3.size(), 49, "path/to/cover.jpg", songs3);

        // Albüm 4: 21st Century Breakdown (2009)
        Song song16 = new Song("21 Guns", 600000000, 5, 2009, "path/to/cover.jpg",
                "Do you know what's worth fighting for?\n" +
                        "When it's not worth dying for?");
        Song song17 = new Song("21st Century Breakdown", 370000000, 5, 2009, "path/to/cover.jpg",
                "Born into Nixon, I was raised in hell...");
        Song song18 = new Song("Know Your Enemy", 520000000, 4, 2009, "path/to/cover.jpg",
                "Do you know the enemy?\n" +
                        "Do you know your enemy?");
        Song song19 = new Song("Last of the American Girls", 450000000, 3, 2009, "path/to/cover.jpg",
                "She puts her makeup on like graffiti on the walls of the heartland...");
        Song song20 = new Song("Before the Lobotomy", 310000000, 4, 2009, "path/to/cover.jpg",
                "Dreaming, I was only dreaming...");
        songs4.add(song16);
        songs4.add(song17);
        songs4.add(song18);
        songs4.add(song19);
        songs4.add(song20);
        Album album4 = new Album("21st Century Breakdown", 2009, 700000000, songs4.size(), 69, "path/to/cover.jpg", songs4);

        // Albüm 5: Revolution Radio (2016)
        Song song21 = new Song("Bang Bang", 550000000, 3, 2016, "path/to/cover.jpg",
                "I get my kicks and I wanna start a rager...");
        Song song22 = new Song("Still Breathing", 480000000, 3, 2016, "path/to/cover.jpg",
                "I'm like a child looking off on the horizon...");
        Song song23 = new Song("Revolution Radio", 410000000, 3, 2016, "path/to/cover.jpg",
                "Scream with your hands up in the sky...");
        Song song24 = new Song("Somewhere Now", 370000000, 4, 2016, "path/to/cover.jpg",
                "I'm running late to somewhere now...");
        Song song25 = new Song("Ordinary World", 450000000, 4, 2016, "path/to/cover.jpg",
                "Where can I find the city of shining light...");
        songs5.add(song21);
        songs5.add(song22);
        songs5.add(song23);
        songs5.add(song24);
        songs5.add(song25);
        Album album5 = new Album("Revolution Radio", 2016, 600000000, songs5.size(), 44, "path/to/cover.jpg", songs5);

        // Albümleri Green Day sanatçısına ekleme
        albumsGreenDay.add(album1);
        albumsGreenDay.add(album2);
        albumsGreenDay.add(album3);
        albumsGreenDay.add(album4);
        albumsGreenDay.add(album5);

        // Green Day Sanatçısı
        // Green Day Sanatçısı

        Artist greenDay = new Artist(1, "Green Day", 1987, 1000000000, 5,
                "greenDay.jpg", "1987",
                "Green Day, 1987 yılında Berkeley, Kaliforniya'da kurulmuş bir rock grubudur. " +
                        "Grup, punk rock, alternatif rock ve pop punk türlerinde eserler vermektedir. " +
                        "Dookie albümü ile dünya çapında büyük bir başarı yakalamış ve bu albüm, punk rock müziğini " +
                        "ana akım haline getirmiştir. Green Day, politik ve sosyal konuları ele alan şarkı sözleriyle " +
                        "tanınmaktadır ve birçok Grammy ödülü kazanmıştır.",
                albumsGreenDay);

        artists.add(greenDay);

        // Sanatçıyı listeye ekleme
    }
}