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




    // Sezen Aksu için albüm ve şarkı listeleri
    List<Song> songs6 = new ArrayList<>(); // Birinci albümün şarkıları
    List<Song> songs7 = new ArrayList<>(); // İkinci albümün şarkıları
    List<Song> songs8 = new ArrayList<>(); // Üçüncü albümün şarkıları
    List<Song> songs9 = new ArrayList<>(); // Dördüncü albümün şarkıları
    List<Song> songs10 = new ArrayList<>(); // Beşinci albümün şarkıları
    List<Album> albumsSezenAksu = new ArrayList<>(); // Albümler listesi

    // Barış Manço için albüm ve şarkı listeleri
    List<Song> songs11 = new ArrayList<>(); // Birinci albümün şarkıları
    List<Song> songs12 = new ArrayList<>(); // İkinci albümün şarkıları
    List<Song> songs13 = new ArrayList<>(); // Üçüncü albümün şarkıları
    List<Song> songs14 = new ArrayList<>(); // Dördüncü albümün şarkıları
    List<Song> songs15 = new ArrayList<>(); // Beşinci albümün şarkıları
    List<Album> albumsBaris = new ArrayList<>(); // Albümler listesi



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
    public void createSezenAksuData() {
        // Albüm 1: Firuze (1982)
        Song song1 = new Song("Firuze", 250000000, 4, 1982, "path/to/firuze.jpg",
                "Bir gün gelir de unuturmuş insan\n" +
                        "En sevdiği hatıraları bile\n" +
                        "Başa gelmez sandığın acılar\n" +
                        "Gör bak unutuluyor, birer birer...");
        Song song2 = new Song("El Gibi", 180000000, 4, 1982, "path/to/el_gibi.jpg",
                "Bu gece sensizliğin ilk gecesi\n" +
                        "Ne olur sabaha çıkmasam\n" +
                        "Görmezden gelirim ben gerçekleri...");
        Song song3 = new Song("Gidiyorum", 150000000, 3, 1982, "path/to/gidiyorum.jpg",
                "Gidiyorum bütün aşklar yüreğimde\n" +
                        "Gidiyorum kokun hala üzerimde...");
        Song song4 = new Song("Ağlamak Güzeldir", 170000000, 3, 1982, "path/to/aglamak.jpg",
                "Ağlamak güzeldir süzülürken yaşlar gözünden...");
        Song song5 = new Song("Biliyorsun", 200000000, 4, 1982, "path/to/biliyorsun.jpg",
                "Biliyorsun, gitmek gerekir bazen\n" +
                        "Biliyorsun, sevdiğini terk etmek...");
        songs6.add(song1);
        songs6.add(song2);
        songs6.add(song3);
        songs6.add(song4);
        songs6.add(song5);
        Album album1 = new Album("Firuze", 1982, 250000000, songs6.size(), 42, "path/to/firuze.jpg", songs6);

        // Albüm 2: Gülümse (1991)
        Song song6 = new Song("Gülümse", 300000000, 5, 1991, "path/to/gulumse.jpg",
                "Gülümse, hadi gülümse...\n" +
                        "Bulutlar gitsin...\n" +
                        "Yoksa ben nasıl yenilenirim?");
        Song song7 = new Song("Hadi Bakalım", 220000000, 4, 1991, "path/to/hadi_bakalim.jpg",
                "Hadi bakalım kolay gelsin...\n" +
                        "Bir acayip zor yarış...");
        Song song8 = new Song("Keskin Bıçak", 150000000, 4, 1991, "path/to/keskin_bicak.jpg",
                "Keskin bıçak gibi kesip atmak gerekiyormuş\n" +
                        "İstemesen bile\n" +
                        "Yokluğuna alışmak...");
        Song song9 = new Song("Seni Kimler Aldı", 180000000, 4, 1991, "path/to/seni_kimler.jpg",
                "Seni kimler aldı, kimler öpüyor seni...\n" +
                        "Dudağında dilinde ellerin izi var şimdi...");
        Song song10 = new Song("Küçüğüm", 260000000, 3, 1991, "path/to/kucugum.jpg",
                "Küçüğüm, daha çok küçüğüm...\n" +
                        "Bu yüzden bütün hatalarım...");
        songs7.add(song6);
        songs7.add(song7);
        songs7.add(song8);
        songs7.add(song9);
        songs7.add(song10);
        Album album2 = new Album("Gülümse", 1991, 300000000, songs7.size(), 50, "path/to/gulumse.jpg", songs7);

        // Albüm 3: Deli Kızın Türküsü (1993)
        Song song11 = new Song("Tükeneceğiz", 350000000, 4, 1993, "path/to/tukenecegiz.jpg",
                "Tükeneceğiz biz, tükeneceğiz...\n" +
                        "Su gibi, gizlice tükeneceğiz...");
        Song song12 = new Song("Rakkas", 170000000, 3, 1993, "path/to/rakkas.jpg",
                "Rakkas geldi meydane...\n" +
                        "Vurdu fiskeyi pervane...");
        Song song13 = new Song("Gidemem", 190000000, 4, 1993, "path/to/gidemem.jpg",
                "Gidemem, gidemem bu akşam gidemem...");
        Song song14 = new Song("Deli Kızın Türküsü", 250000000, 5, 1993, "path/to/deli_kizin.jpg",
                "İsterim bir sonsuz sessizlikte...\n" +
                        "Tek başıma kalmak istiyorum...");
        Song song15 = new Song("Masum Değiliz", 200000000, 4, 1993, "path/to/masum.jpg",
                "Masum değiliz hiçbirimiz...");
        songs8.add(song11);
        songs8.add(song12);
        songs8.add(song13);
        songs8.add(song14);
        songs8.add(song15);
        Album album3 = new Album("Deli Kızın Türküsü", 1993, 350000000, songs8.size(), 48, "path/to/deli_kizin.jpg", songs8);

        // Albüm 4: Işık Doğudan Yükselir (1995)
        Song song16 = new Song("Işık Doğudan Yükselir", 280000000, 4, 1995, "path/to/isik.jpg",
                "Işık doğudan yükselir...\n" +
                        "Gecenin ardından...");
        Song song17 = new Song("Rakkas (Remix)", 150000000, 3, 1995, "path/to/rakkas_remix.jpg",
                "Rakkas geldi meydane...");
        Song song18 = new Song("Değer Mi?", 220000000, 4, 1995, "path/to/deger_mi.jpg",
                "Söyle o güzel gözlerine değer mi?");
        Song song19 = new Song("Kalbim Ege'de Kaldı", 200000000, 3, 1995, "path/to/kalbim.jpg",
                "Kalbim Ege'de kaldı...");
        Song song20 = new Song("Ne Kavgam Bitti Ne Sevdam", 180000000, 3, 1995, "path/to/ne_kavgam.jpg",
                "Ne kavgam bitti ne sevdam...");
        songs9.add(song16);
        songs9.add(song17);
        songs9.add(song18);
        songs9.add(song19);
        songs9.add(song20);
        Album album4 = new Album("Işık Doğudan Yükselir", 1995, 300000000, songs9.size(), 53, "path/to/isik.jpg", songs9);

        // Albüm 5: Adı Bende Saklı (1998)
        Song song21 = new Song("Adı Bende Saklı", 300000000, 4, 1998, "path/to/adi.jpg",
                "Adı bende saklı...\n" +
                        "Bir sevda masalı...");
        Song song22 = new Song("Tutuklu", 220000000, 4, 1998, "path/to/tutuklu.jpg",
                "Gözlerim gözlerinizde, bir tutuklu gibi...");
        Song song23 = new Song("Kaç Yıl Geçti Aradan", 250000000, 4, 1998, "path/to/kac_yil.jpg",
                "Kaç yıl geçti aradan, ayrı ayrı...");
        Song song24 = new Song("Bir Çocuk Sevdim", 190000000, 3, 1998, "path/to/bir_cocuk.jpg",
                "Bir çocuk sevdim, ayrılıklar vardı...");
        Song song25 = new Song("Bir Vurgun Bu Sevda", 230000000, 3, 1998, "path/to/bir_vurgun.jpg",
                "Bir vurgun bu sevda...");
        songs10.add(song21);
        songs10.add(song22);
        songs10.add(song23);
        songs10.add(song24);
        songs10.add(song25);
        Album album5 = new Album("Adı Bende Saklı", 1998, 300000000, songs10.size(), 48, "path/to/adi.jpg", songs10);

        // Albümleri Sezen Aksu sanatçısına ekleme
        albumsSezenAksu.add(album1);
        albumsSezenAksu.add(album2);
        albumsSezenAksu.add(album3);
        albumsSezenAksu.add(album4);
        albumsSezenAksu.add(album5);


        // Sezen Aksu Sanatçısı
        Artist sezenAksu = new Artist(2, "Sezen Aksu", 1970, 500000000, 5,
                "sezenAksu.jpg", "1970",
                "Sezen Aksu, Türk pop müziğinin en önemli ve etkili sanatçılarından biridir. " +
                        "Kendi besteleri ve sözleriyle birlikte birçok sanatçının kariyerine yön vermiştir. " +
                        "Kendine has tarzı ve duygusal yorumlarıyla, Türk müziğinde derin izler bırakmıştır. " +
                        "Sezen Aksu, Türk müziğinin 'Minik Serçe' olarak tanınmaktadır.",
                albumsSezenAksu);

        artists.add(sezenAksu);
    }

    public void createBarisMancoData() {
        // Albüm 1: 2023 (1975)
        List<Song> songs1 = new ArrayList<>();
        songs1.add(new Song("2023", 150000000, 5, 1975, "path/to/cover.jpg",
                "Yıl 2023, sanki bir kâbus...\nGözlerim doldu ama yaş akmıyor..."));
        songs1.add(new Song("Baykoca Destanı", 120000000, 6, 1975, "path/to/cover.jpg",
                "Hey, Baykoca destanı dinleyin...\nBir dağın ardında kalan çocuklar..."));
        songs1.add(new Song("Anlıyorsun Değil Mi?", 180000000, 3, 1975, "path/to/cover.jpg",
                "Gözlerime bakma sakın, ne olur...\nBakışların beni yıkar..."));
        songs1.add(new Song("Bir Bahar Akşamı", 100000000, 4, 1975, "path/to/cover.jpg",
                "Bir bahar akşamı rastladım size..."));
        songs1.add(new Song("Kara Sevda", 130000000, 4, 1975, "path/to/cover.jpg",
                "Kara sevda, kara sevda...\nDedikleri daha baştan yaşandı..."));
        songs1.add(new Song("Yine Yol Göründü Gurbete", 110000000, 5, 1975, "path/to/cover.jpg",
                "Yine yol göründü gurbete...\nHasret doldu gönlüme..."));
        Album album1 = new Album("2023", 1975, 500000000, songs1.size(), 40, "path/to/cover.jpg", songs1);

        // Albüm 2: Sözüm Meclisten Dışarı (1981)
        List<Song> songs2 = new ArrayList<>();
        songs2.add(new Song("Gülpembe", 300000000, 4, 1981, "path/to/cover.jpg",
                "Gel, gülümse bana, gülpembe...\nBeni benden alırsın..."));
        songs2.add(new Song("Alla Beni Pulla Beni", 240000000, 3, 1981, "path/to/cover.jpg",
                "Alla beni pulla beni...\nKöyüne de yolla beni..."));
        songs2.add(new Song("Halil İbrahim Sofrası", 270000000, 5, 1981, "path/to/cover.jpg",
                "Buyurun dostlar, buyurun, Halil İbrahim sofrasına..."));
        songs2.add(new Song("Ali Yazar Veli Bozar", 210000000, 4, 1981, "path/to/cover.jpg",
                "Ali yazar, Veli bozar...\nDönerim dönerim aynı yere..."));
        songs2.add(new Song("Dönence", 250000000, 4, 1981, "path/to/cover.jpg",
                "Dönence...\nVakit çok geç olmadan..."));
        songs2.add(new Song("Kazma", 190000000, 3, 1981, "path/to/cover.jpg",
                "Kazma, kazma vur derine...\nToprağını işle canım memleketim..."));
        Album album2 = new Album("Sözüm Meclisten Dışarı", 1981, 900000000, songs2.size(), 45, "path/to/cover.jpg", songs2);

        // Albüm 3: Darısı Başınıza (1992)
        List<Song> songs3 = new ArrayList<>();
        songs3.add(new Song("Can Bedenden Çıkmayınca", 400000000, 5, 1992, "path/to/cover.jpg",
                "Can bedenden çıkmayınca, insan ölmezmiş..."));
        songs3.add(new Song("Domates Biber Patlıcan", 310000000, 3, 1992, "path/to/cover.jpg",
                "Domates biber patlıcan...\nBir yanda aşk bir yanda sevda..."));
        songs3.add(new Song("Sarı Çizmeli Mehmet Ağa", 350000000, 5, 1992, "path/to/cover.jpg",
                "Yaz dostum, güzel sevmeyene adam denir mi?\nYaz dostum..."));
        songs3.add(new Song("Nane Limon Kabuğu", 180000000, 3, 1992, "path/to/cover.jpg",
                "Nane limon kabuğu...\nBir tutam da aşk katılsa..."));
        songs3.add(new Song("Dağlar Dağlar", 500000000, 6, 1992, "path/to/cover.jpg",
                "Dağlar, dağlar...\nKurban olam yollarına..."));
        songs3.add(new Song("Geçti Dost Kervanı", 220000000, 4, 1992, "path/to/cover.jpg",
                "Geçti dost kervanı...\nEyleme beni..."));
        Album album3 = new Album("Darısı Başınıza", 1992, 1460000000, songs3.size(), 50, "path/to/cover.jpg", songs3);

        // Albüm 4: Ben Bilirim (1986)
        List<Song> songs4 = new ArrayList<>();
        songs4.add(new Song("Ben Bilirim", 200000000, 4, 1986, "path/to/cover.jpg",
                "Ben bilirim, ben bilirim...\nBu işler böyle sürüp gider..."));
        songs4.add(new Song("Unutamadım", 150000000, 5, 1986, "path/to/cover.jpg",
                "Unutamadım seni...\nNe olur anla..."));
        songs4.add(new Song("Gibi Gibi", 180000000, 4, 1986, "path/to/cover.jpg",
                "Gibi gibi...\nSevmek seni bir başka..."));
        songs4.add(new Song("Kara Çiçek", 120000000, 4, 1986, "path/to/cover.jpg",
                "Kara çiçek, kara çiçek...\nYaktın beni benzerin yok..."));
        songs4.add(new Song("Ne Ola Yar Ola", 140000000, 5, 1986, "path/to/cover.jpg",
                "Ne ola yar ola...\nO güzel gözlerin..."));
        songs4.add(new Song("Anlıyorsun Değil Mi?", 180000000, 4, 1986, "path/to/cover.jpg",
                "Anlıyorsun değil mi?\nSana söylemek istediğim..."));
        Album album4 = new Album("Ben Bilirim", 1986, 800000000, songs4.size(), 44, "path/to/cover.jpg", songs4);

        // Albüm 5: Mançoloji (1999)
        List<Song> songs5 = new ArrayList<>();
        songs5.add(new Song("Mançoloji", 400000000, 6, 1999, "path/to/cover.jpg",
                "Mançoloji...\nBu albüm senin için..."));
        songs5.add(new Song("Sarı Çizmeli Mehmet Ağa", 350000000, 5, 1999, "path/to/cover.jpg",
                "Yaz dostum, güzel sevmeyene adam denir mi?\nYaz dostum..."));
        songs5.add(new Song("Domates Biber Patlıcan", 310000000, 4, 1999, "path/to/cover.jpg",
                "Domates biber patlıcan...\nBir yanda aşk bir yanda sevda..."));
        songs5.add(new Song("Kara Sevda", 200000000, 5, 1999, "path/to/cover.jpg",
                "Kara sevda, kara sevda...\nDedikleri daha baştan yaşandı..."));
        songs5.add(new Song("Yine Yol Göründü Gurbete", 250000000, 5, 1999, "path/to/cover.jpg",
                "Yine yol göründü gurbete...\nHasret doldu gönlüme..."));
        songs5.add(new Song("Gülpembe", 300000000, 4, 1999, "path/to/cover.jpg",
                "Gel, gülümse bana, gülpembe...\nBeni benden alırsın..."));
        Album album5 = new Album("Mançoloji", 1999, 1700000000, songs5.size(), 60, "path/to/cover.jpg", songs5);

        // Albümleri Barış Manço sanatçısına ekleme
        List<Album> albumsBarisManco = new ArrayList<>();
        albumsBarisManco.add(album1);
        albumsBarisManco.add(album2);
        albumsBarisManco.add(album3);
        albumsBarisManco.add(album4);
        albumsBarisManco.add(album5);

        // Barış Manço sanatçısını oluşturma
        Artist barisManco = new Artist(2, "Barış Manço", 1969, 50000000, 5,
                "barisManco.jpg", "1969",
                "Barış Manço, Türk rock müziğinin öncülerinden biri olarak tanınmaktadır. " +
                        "1969'da müzik kariyerine başlayan Manço, hem Türkiye'de hem de dünya çapında büyük bir hayran kitlesi edinmiştir. " +
                        "Şarkıları, geleneksel Türk müziği ile rock müziği birleştirerek evrensel bir stil oluşturmuştur. " +
                        "Sözleri genellikle sosyal ve kültürel mesajlar içeren Barış Manço, ayrıca çocuk programlarıyla da tanınır.",
                albumsBarisManco);

        // Barış Manço sanatçısını ekleme
        artists.add(barisManco);
    }



}