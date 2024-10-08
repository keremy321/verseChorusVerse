package org.versechorusverse.datas;

import java.util.ArrayList;
import java.util.List;

public class DataCreate {

    // Green Day için albüm ve şarkı listeleri

    List<Song> songs1 = new ArrayList<>(); // Birinci albümün şarkıları
    List<Song> songs2 = new ArrayList<>(); // İkinci albümün şarkıları
    List<Song> songs3 = new ArrayList<>(); // Üçüncü albümün şarkıları
    List<Song> songs4 = new ArrayList<>(); // Dördüncü albümün şarkıları
    List<Song> songs5 = new ArrayList<>(); // Beşinci albümün şarkıları
    List<Album> albumsGreenDay = new ArrayList<>(); // Albümler listesi

    public DataCreate() {

        createGreenDayData();
        createMetallicaData();
        createEminemData();
        createArcticMonkeysData();
        createNirvanaData();


    }

    List<Song> eminemSongs1 = new ArrayList<>(); // Birinci albümün şarkıları
    List<Song> eminemSongs2 = new ArrayList<>(); // İkinci albümün şarkıları
    List<Song> eminemSongs3 = new ArrayList<>(); // Üçüncü albümün şarkıları
    List<Song> eminemSongs4 = new ArrayList<>(); // Dördüncü albümün şarkıları
    List<Song> eminemSongs5 = new ArrayList<>(); // Beşinci albümün şarkıları
    List<Album> albumsEminem = new ArrayList<>(); // Albümler listesi

    // Metallica için albüm ve şarkı listeleri
    List<Song> songs11 = new ArrayList<>(); // Birinci albümün şarkıları
    List<Song> songs12 = new ArrayList<>(); // İkinci albümün şarkıları
    List<Song> songs13 = new ArrayList<>(); // Üçüncü albümün şarkıları
    List<Song> songs14 = new ArrayList<>(); // Dördüncü albümün şarkıları
    List<Song> songs15 = new ArrayList<>(); // Beşinci albümün şarkıları
    List<Album> albumsMetallica = new ArrayList<>(); // Albümler listesi

    // Arctic Monkeys sanatçısını oluşturma
    List<Song> songs16 = new ArrayList<>();
    List<Song> songs17 = new ArrayList<>();
    List<Song> songs18 = new ArrayList<>();
    List<Song> songs19 = new ArrayList<>();
    List<Album> albumsArcticMonkeys = new ArrayList<>();


    // Nirvana için albüm ve şarkı listeleri
    List<Song> songs21 = new ArrayList<>(); // Birinci albümün şarkıları
    List<Song> songs22 = new ArrayList<>(); // İkinci albümün şarkıları
    List<Song> songs23 = new ArrayList<>(); // Üçüncü albümün şarkıları
    List<Song> songs24 = new ArrayList<>(); // Dördüncü albümün şarkıları
    List<Song> songs25 = new ArrayList<>(); // Beşinci albümün şarkıları

    List<Album> albumsNirvana = new ArrayList<>();



    public List<Artist> artists = new ArrayList<>();

    public void createGreenDayData() {
        // Albüm 1: Dookie (1994)
        Song song1 = new Song("Basket Case", 500000000, 3, 1994, "/albumsPhoto/greenDay/GreenDayDookie.jpg",
                "Do you have the time to listen to me whine...\n" +
                        "About nothing and everything all at once\n" +
                        "I am one of those melodramatic fools...");
        Song song2 = new Song("When I Come Around", 450000000, 3, 1994, "/albumsPhoto/greenDay/GreenDayDookie.jpg",
                "I heard you crying loud...\n" +
                        "All the way across town...\n" +
                        "You've been searching for that someone...");
        Song song3 = new Song("Longview", 350000000, 3, 1994, "/albumsPhoto/greenDay/GreenDayDookie.jpg",
                "I sit around and watch the tube, but nothing's on...");
        Song song4 = new Song("Welcome to Paradise", 420000000, 3, 1994, "/albumsPhoto/greenDay/GreenDayDookie.jpg",
                "Dear mother, can you hear me whining?\n" +
                        "It's been three whole weeks since that I have left your home...");
        Song song5 = new Song("She", 380000000, 2, 1994, "/albumsPhoto/greenDay/GreenDayDookie.jpg",
                "She... she screams in silence...\n" +
                        "A sullen riot penetrating through her mind...");
        songs1.add(song1);
        songs1.add(song2);
        songs1.add(song3);
        songs1.add(song4);
        songs1.add(song5);
        Album album1 = new Album("Dookie", 1994, 600000000, songs1.size(), 39, "/albumsPhoto/greenDay/GreenDayDookie.jpg", songs1);

        // Albüm 2: American Idiot (2004)
        Song song6 = new Song("American Idiot", 700000000, 3, 2004, "/albumsPhoto/greenDay/Green_Day_-_American_Idiot_album_cover.png",
                "Don't wanna be an American idiot...\n" +
                        "Don't want a nation under the new media...");
        Song song7 = new Song("Boulevard of Broken Dreams", 750000000, 4, 2004, "/albumsPhoto/greenDay/Green_Day_-_American_Idiot_album_cover.png",
                "I walk a lonely road, the only one that I have ever known...");
        Song song8 = new Song("Holiday", 580000000, 3, 2004, "/albumsPhoto/greenDay/Green_Day_-_American_Idiot_album_cover.png",
                "Hear the sound of the falling rain...\n" +
                        "Coming down like an Armageddon flame...");
        Song song9 = new Song("Wake Me Up When September Ends", 900000000, 4, 2004, "/albumsPhoto/greenDay/Green_Day_-_American_Idiot_album_cover.png",
                "Summer has come and passed\n" +
                        "The innocent can never last...");
        Song song10 = new Song("Jesus of Suburbia", 670000000, 9, 2004, "/albumsPhoto/greenDay/Green_Day_-_American_Idiot_album_cover.png",
                "I'm the son of rage and love\n" +
                        "The Jesus of Suburbia\n" +
                        "The bible of \"none of the above\"\n" +
                        "On a steady diet of\n" +
                        "Soda pop and Ritalin\n" +
                        "No one ever died for my sins in hell\n" +
                        "As far as I can tell\n" +
                        "At least the ones I got away with\n" +
                        "And there's nothing wrong with me\n" +
                        "This is how I'm supposed to be\n" +
                        "In a land of make-believe\n" +
                        "That don't believe in me\n" +
                        "Get my television fix\n" +
                        "Sitting on my crucifix\n" +
                        "The living room or my private womb\n" +
                        "While the moms and Brads are away\n" +
                        "To fall in love and fall in debt\n" +
                        "To alcohol and cigarettes and Mary Jane\n" +
                        "To keep me insane\n" +
                        "Doing someone else's cocaine\n" +
                        "And there's nothing wrong with me\n" +
                        "This is how I'm supposed to be\n" +
                        "In a land of make-believe\n" +
                        "That don't believe in me\n" +
                        "At the center of the earth, in the parking lot\n" +
                        "Of the 7-11 where I was taught\n" +
                        "The motto was just a lie\n" +
                        "It says, \"Home is where your heart is, \" but what a shame\n" +
                        "'Cause everyone's heart doesn't beat the same\n" +
                        "It's beating out of time\n" +
                        "City of the dead (hey, hey)\n" +
                        "At the end of another lost highway (hey, hey)\n" +
                        "Signs misleading to nowhere\n" +
                        "City of the damned (hey, hey)\n" +
                        "Lost children with dirty faces today (hey, hey)\n" +
                        "No one really seems to care\n" +
                        "I read the graffiti in the bathroom stall\n" +
                        "Like the holy scriptures of the shopping mall\n" +
                        "And so it seemed to confess\n" +
                        "It didn't say much, but it only confirmed\n" +
                        "That the center of the earth is the end of the world\n" +
                        "And I could really care less\n" +
                        "City of the dead (hey, hey)\n" +
                        "At the end of another lost highway (hey, hey)\n" +
                        "Signs misleading to nowhere\n" +
                        "City of the damned (hey, hey)\n" +
                        "Lost children with dirty faces today (hey, hey)\n" +
                        "No one really seems to care (hey)\n" +
                        "I don't care if you don't\n" +
                        "I don't care if you don't\n" +
                        "I don't care if you don't care\n" +
                        "I don't care if you don't\n" +
                        "I don't care if you don't\n" +
                        "I don't care if you don't care\n" +
                        "I don't care if you don't\n" +
                        "I don't care if you don't\n" +
                        "I don't care if you don't care\n" +
                        "I don't care if you don't\n" +
                        "I don't care if you don't\n" +
                        "I don't care if you don't care\n" +
                        "I don't care\n" +
                        "Everyone's so full of shit\n" +
                        "Born and raised by hypocrites\n" +
                        "Hearts recycled, but never saved\n" +
                        "From the cradles to the grave\n" +
                        "We are the kids of war and peace\n" +
                        "From Anaheim to the Middle East\n" +
                        "We are the stories and disciples of\n" +
                        "The Jesus of Suburbia\n" +
                        "Land of make-believe\n" +
                        "And it don't believe in me\n" +
                        "Land of make-believe (said, now it's, it's another lie)\n" +
                        "And I don't believe\n" +
                        "And I don't care (whoo, whoo, whoo)\n" +
                        "I don't care (whoo, whoo, whoo)\n" +
                        "I don't care (whoo, whoo, whoo)\n" +
                        "I don't care (whoo, whoo, whoo)\n" +
                        "I don't care\n" +
                        "Dearly beloved, are you listening?\n" +
                        "I can't remember a word that you were saying\n" +
                        "Are we demented, or am I disturbed?\n" +
                        "The space that's in between insane and insecure\n" +
                        "Ooh\n" +
                        "Ooh\n" +
                        "oh therapy, can you please fill the void?\n" +
                        "(Ooh) am I retarded, or am I just overjoyed?\n" +
                        "(Ooh) nobody's perfect, and I stand accused\n" +
                        "(Ooh) for lack of a better word, and that's my best excuse\n" +
                        "Ooh\n" +
                        "Ooh\n" +
                        "To live and not to breathe\n" +
                        "Is to die in tragedy\n" +
                        "To run, to run away\n" +
                        "To find what you believe\n" +
                        "And I leave behind\n" +
                        "This hurricane of fucking lies\n" +
                        "I lost my faith to this\n" +
                        "This town that don't exist\n" +
                        "So I run, I run away\n" +
                        "To the light of masochists\n" +
                        "And I leave behind\n" +
                        "This hurricane of fucking lies\n" +
                        "And I've walked this line\n" +
                        "A million and one fucking times\n" +
                        "But not this time\n" +
                        "I don't feel any shame, I won't apologize\n" +
                        "When there ain't nowhere you can go\n" +
                        "Runnin' away from pain when you've been victimized\n" +
                        "Tales from another broken home\n" +
                        "You're leavin'\n" +
                        "You're leavin'\n" +
                        "You're leavin'\n" +
                        "Are you leavin' home?\n");
        songs2.add(song6);
        songs2.add(song7);
        songs2.add(song8);
        songs2.add(song9);
        songs2.add(song10);
        Album album2 = new Album("American Idiot", 2004, 800000000, songs2.size(), 57, "/albumsPhoto/greenDay/Green_Day_-_American_Idiot_album_cover.png", songs2);

        // Albüm 3: Nimrod (1997)
        Song song11 = new Song("Good Riddance (Time of Your Life)", 500000000, 2, 1997, "/albumsPhoto/greenDay/nimrod.jpg",
                "Another turning point, a fork stuck in the road...\n" +
                        "Time grabs you by the wrist, directs you where to go...");
        Song song12 = new Song("Hitchin' a Ride", 340000000, 3, 1997, "/albumsPhoto/greenDay/nimrod.jpg",
                "Hey mister, where you headed?\n" +
                        "Are you in a hurry?");
        Song song13 = new Song("Redundant", 270000000, 3, 1997, "/albumsPhoto/greenDay/nimrod.jpg",
                "We're living in repetition...");
        Song song14 = new Song("Nice Guys Finish Last", 310000000, 3, 1997, "/albumsPhoto/greenDay/nimrod.jpg",
                "Nice guys finish last...\n" +
                        "You're running out of gas...");
        Song song15 = new Song("King for a Day", 290000000, 3, 1997, "/albumsPhoto/greenDay/nimrod.jpg",
                "Started at the age of four...\n" +
                        "My mother went to the grocery store...");
        songs3.add(song11);
        songs3.add(song12);
        songs3.add(song13);
        songs3.add(song14);
        songs3.add(song15);
        Album album3 = new Album("Nimrod", 1997, 450000000, songs3.size(), 49, "/albumsPhoto/greenDay/nimrod.jpg", songs3);

        // Albüm 4: 21st Century Breakdown (2009)
        Song song16 = new Song("21 Guns", 600000000, 5, 2009, "/albumsPhoto/greenDay/Green_Day_-_21st_Century_Breakdown_cover.jpg",
                "Do you know what's worth fighting for?\n" +
                        "When it's not worth dying for?");
        Song song17 = new Song("21st Century Breakdown", 370000000, 5, 2009, "/albumsPhoto/greenDay/Green_Day_-_21st_Century_Breakdown_cover.jpg",
                "Born into Nixon, I was raised in hell...");
        Song song18 = new Song("Know Your Enemy", 520000000, 4, 2009, "/albumsPhoto/greenDay/Green_Day_-_21st_Century_Breakdown_cover.jpg",
                "Do you know the enemy?\n" +
                        "Do you know your enemy?");
        Song song19 = new Song("Last of the American Girls", 450000000, 3, 2009, "/albumsPhoto/greenDay/Green_Day_-_21st_Century_Breakdown_cover.jpg",
                "She puts her makeup on like graffiti on the walls of the heartland...");
        Song song20 = new Song("Before the Lobotomy", 310000000, 4, 2009, "/albumsPhoto/greenDay/Green_Day_-_21st_Century_Breakdown_cover.jpg",
                "Dreaming, I was only dreaming...");
        songs4.add(song16);
        songs4.add(song17);
        songs4.add(song18);
        songs4.add(song19);
        songs4.add(song20);
        Album album4 = new Album("21st Century Breakdown", 2009, 700000000, songs4.size(), 69, "/albumsPhoto/greenDay/Green_Day_-_21st_Century_Breakdown_cover.jpg", songs4);

        // Albüm 5: Revolution Radio (2016)
        Song song21 = new Song("Bang Bang", 550000000, 3, 2016, "/albumsPhoto/greenDay/RevolutionRadio-single.jpg",
                "I get my kicks and I wanna start a rager...");
        Song song22 = new Song("Still Breathing", 480000000, 3, 2016, "/albumsPhoto/greenDay/RevolutionRadio-single.jpg",
                "I'm like a child looking off on the horizon...");
        Song song23 = new Song("Revolution Radio", 410000000, 3, 2016, "/albumsPhoto/greenDay/RevolutionRadio-single.jpg",
                "Scream with your hands up in the sky...");
        Song song24 = new Song("Somewhere Now", 370000000, 4, 2016, "/albumsPhoto/greenDay/RevolutionRadio-single.jpg",
                "I'm running late to somewhere now...");
        Song song25 = new Song("Ordinary World", 450000000, 4, 2016, "/albumsPhoto/greenDay/RevolutionRadio-single.jpg",
                "Where can I find the city of shining light...");
        songs5.add(song21);
        songs5.add(song22);
        songs5.add(song23);
        songs5.add(song24);
        songs5.add(song25);
        Album album5 = new Album("Revolution Radio", 2016, 600000000, songs5.size(), 44, "/albumsPhoto/greenDay/RevolutionRadio-single.jpg", songs5);

        // Albümleri Green Day sanatçısına ekleme
        albumsGreenDay.add(album1);
        albumsGreenDay.add(album2);
        albumsGreenDay.add(album3);
        albumsGreenDay.add(album4);
        albumsGreenDay.add(album5);

        // Green Day Sanatçısı
        // Green Day Sanatçısı

        Artist greenDay = new Artist(1, "Green Day", 1987, 1000000000, 5,
                "/artistPhoto/greenDay.jpg", "1987",
                "Green Day, 1987 yilinda Berkeley, Kaliforniya'da kurulmus bir rock grubudur. " +
                        "Grup, punk rock, alternatif rock ve pop punk turlerinde eserler vermektedir. " +
                        "Dookie albumu ile dunya capında buyuk bir basarı yakalamis ve bu album, punk rock müzigini " +
                        "ana akım haline getirmiştir. Green Day, politik ve sosyal konulari ele alan sarkı sözleriyle " +
                        "taninmaktadır ve bircok Grammy odulu kazanmıstir.",
                albumsGreenDay);

        artists.add(greenDay);

        // Sanatçıyı listeye ekleme
    }
    public void createMetallicaData() {
        // Albüm 1: Master of Puppets (1986)
        List<Song> songs1 = new ArrayList<>();
        songs11.add(new Song("Battery", 350000000, 5, 1986, "/albumsPhoto/metallica/masterofpuppets.jpeg",
                "Lashing out the action, returning the reaction...\nWeak are ripped and torn away..."));
        songs11.add(new Song("Master of Puppets", 600000000, 8, 1986, "/albumsPhoto/metallica/masterofpuppets.jpeg",
                "Master, master, where's the dreams that I've been after?\nMaster, master, you promised only lies..."));
        songs11.add(new Song("The Thing That Should Not Be", 250000000, 7, 1986, "/albumsPhoto/metallica/masterofpuppets.jpeg",
                "Messenger of fear in sight...\nDark deception kills the light..."));
        songs11.add(new Song("Welcome Home (Sanitarium)", 400000000, 6, 1986, "/albumsPhoto/metallica/masterofpuppets.jpeg",
                "Welcome to where time stands still...\nNo one leaves and no one will..."));
        songs11.add(new Song("Disposable Heroes", 280000000, 8, 1986, "/albumsPhoto/metallica/masterofpuppets.jpeg",
                "Back to the front, you will do what I say...\nWhen I say back to the front..."));
        songs11.add(new Song("Damage, Inc.", 220000000, 5, 1986, "/albumsPhoto/metallica/masterofpuppets.jpeg",
                "Dealing out the agony within...\nCharging hard and no one's gonna give in..."));
        Album album1 = new Album("Master of Puppets", 1986, 1500000000, songs11.size(), 55, "/albumsPhoto/metallica/masterofpuppets.jpeg", songs11);

        // Albüm 2: Ride the Lightning (1984)
        List<Song> songs2 = new ArrayList<>();
        songs12.add(new Song("Fight Fire with Fire", 220000000, 4, 1984, "/albumsPhoto/metallica/ridethelightning.jpg",
                "Do unto others as they've done to you...\nBut what the hell is this world coming to?"));
        songs12.add(new Song("Ride the Lightning", 360000000, 6, 1984, "/albumsPhoto/metallica/ridethelightning.jpg",
                "Guilty as charged, but damn it, it ain't right...\nThere's someone else controlling me..."));
        songs12.add(new Song("For Whom the Bell Tolls", 550000000, 5, 1984, "/albumsPhoto/metallica/ridethelightning.jpg",
                "For whom the bell tolls...\nTime marches on..."));
        songs12.add(new Song("Fade to Black", 580000000, 7, 1984, "/albumsPhoto/metallica/ridethelightning.jpg",
                "Life, it seems, will fade away...\nDrifting further every day..."));
        songs12.add(new Song("Creeping Death", 490000000, 6, 1984, "/albumsPhoto/metallica/ridethelightning.jpg",
                "So let it be written...\nSo let it be done..."));
        songs12.add(new Song("Call of Ktulu", 300000000, 9, 1984, "/albumsPhoto/metallica/ridethelightning.jpg",
                "Instrumental..."));
        Album album2 = new Album("Ride the Lightning", 1984, 1800000000, songs12.size(), 47, "/albumsPhoto/metallica/ridethelightning.jpg", songs12);

        // Albüm 3: Metallica (The Black Album) (1991)
        List<Song> songs3 = new ArrayList<>();
        songs13.add(new Song("Enter Sandman", 1000000000, 5, 1991, "/albumsPhoto/metallica/metalicablack.jpg",
                "Exit light, enter night...\nTake my hand, we're off to never-never land..."));
        songs13.add(new Song("Sad But True", 720000000, 5, 1991, "/albumsPhoto/metallica/metalicablack.jpg",
                "I'm your dream, make you real...\nI'm your eyes when you must steal..."));
        songs13.add(new Song("The Unforgiven", 900000000, 6, 1991, "/albumsPhoto/metallica/metalicablack.jpg",
                "What I've felt, what I've known...\nNever shined through in what I've shown..."));
        songs13.add(new Song("Wherever I May Roam", 620000000, 6, 1991, "/albumsPhoto/metallica/metalicablack.jpg",
                "And the road becomes my bride...\nI have stripped of all but pride..."));
        songs13.add(new Song("Nothing Else Matters", 1200000000, 6, 1991, "/albumsPhoto/metallica/metalicablack.jpg",
                "So close, no matter how far...\nCouldn't be much more from the heart..."));
        songs13.add(new Song("Of Wolf and Man", 450000000, 4, 1991, "/albumsPhoto/metallica/metalicablack.jpg",
                "Off through the new day's mist I run...\nOut from the new day's mist I have come..."));
        Album album3 = new Album("Metallica (The Black Album)", 1991, 50000000, songs13.size(), 62, "/albumsPhoto/metallica/metalicablack.jpg", songs13);

        // Albüm 4: ...And Justice for All (1988)
        List<Song> songs4 = new ArrayList<>();
        songs14.add(new Song("Blackened", 300000000, 6, 1988, "/albumsPhoto/metallica/Metallica-AndJusticeForAll.jpg",
                "Blackened is the end...\nWinter it will send..."));
        songs14.add(new Song("...And Justice for All", 350000000, 10, 1988, "/albumsPhoto/metallica/Metallica-AndJusticeForAll.jpg",
                "Halls of justice painted green...\nMoney talking..."));
        songs14.add(new Song("Eye of the Beholder", 200000000, 6, 1988, "/albumsPhoto/metallica/Metallica-AndJusticeForAll.jpg",
                "Do you see what I see?\nTruth is an offense..."));
        songs14.add(new Song("One", 800000000, 7, 1988, "/albumsPhoto/metallica/Metallica-AndJusticeForAll.jpg",
                "I can't remember anything...\nCan't tell if this is true or a dream..."));
        songs14.add(new Song("The Shortest Straw", 190000000, 6, 1988, "/albumsPhoto/metallica/Metallica-AndJusticeForAll.jpg",
                "Shortest straw...\nChallenge liberty..."));
        songs14.add(new Song("Dyers Eve", 170000000, 5, 1988, "/albumsPhoto/metallica/Metallica-AndJusticeForAll.jpg",
                "Dear mother, dear father...\nWhat is this hell you have put me through?"));
        Album album4 = new Album("...And Justice for All", 1988, 22000000, songs14.size(), 65, "/albumsPhoto/metallica/Metallica-AndJusticeForAll.jpg", songs14);

        // Albüm 5: Death Magnetic (2008)
        List<Song> songs5 = new ArrayList<>();
        songs15.add(new Song("That Was Just Your Life", 230000000, 7, 2008, "/albumsPhoto/metallica/Metallica_Death_Magnetic.jpg",
                "Like a siren in my head that always threatens to repeat..."));
        songs15.add(new Song("The Day That Never Comes", 450000000, 7, 2008, "/albumsPhoto/metallica/Metallica_Death_Magnetic.jpg",
                "Born to push you around...\nBetter just stay down..."));
        songs15.add(new Song("Broken, Beat & Scarred", 190000000, 6, 2008, "/albumsPhoto/metallica/Metallica_Death_Magnetic.jpg",
                "You rise, you fall, you're down, then you rise again..."));
        songs15.add(new Song("The Unforgiven III", 250000000, 8, 2008, "/albumsPhoto/metallica/Metallica_Death_Magnetic.jpg",
                "How can I be lost, if I've got nowhere to go?\nSearch for seas of gold, how come it's got so cold?"));
        songs15.add(new Song("All Nightmare Long", 300000000, 8, 2008, "/albumsPhoto/metallica/Metallica_Death_Magnetic.jpg",
                "Luck runs out...\nCrawl from the wreckage one more time..."));
        songs15.add(new Song("Cyanide", 280000000, 7, 2008, "/albumsPhoto/metallica/Metallica_Death_Magnetic.jpg",
                "Sleep and dream of this...\nDeath angel's kiss..."));
        Album album5 = new Album("Death Magnetic", 2008, 1700000000, songs15.size(), 75, "/albumsPhoto/metallica/Metallica_Death_Magnetic.jpg", songs15);

        // Albümleri Metallica sanatçısına ekleme
        List<Album> albumsMetallica = new ArrayList<>();
        albumsMetallica.add(album1);
        albumsMetallica.add(album2);
        albumsMetallica.add(album3);
        albumsMetallica.add(album4);
        albumsMetallica.add(album5);

        // Metallica sanatçısını oluşturma
        Artist metallica = new Artist(3, "Metallica", 1981, 1000000000, 5,
                "/artistPhoto/metallica.jpeg", "1981",
                "Metallica, Amerikan heavy metal grubudur ve 1981 yılında kurulmustur. " +
                        "Grup, agresif gitar riffleri, güçlü vokalleri ve anlamli sozleriyle taninmaktadir. " +
                        "Metal muzigin dünyadaki en büyük temsilcilerinden biri olup, bircok Grammy odolu kazanmıstır.",
                albumsMetallica);

        // Sanatçıyı listeye ekleme
        artists.add(metallica);
    }

    public void createEminemData() {
        // Albüm 1: The Slim Shady LP (1999)
        Song eminemSong1 = new Song("My Name Is", 550000000, 4, 1999, "/albumsPhoto/eminem/Eminem_-_The_Slim_Shady_LP_CD_cover.jpg",
                "Hi, kids, do you like violence?\n" +
                        "Wanna see me stick nine inch nails through each one of my eyelids?");
        Song eminemSong2 = new Song("Guilty Conscience", 430000000, 4, 1999, "/albumsPhoto/eminem/Eminem_-_The_Slim_Shady_LP_CD_cover.jpg",
                "Meet Eddie, twenty-three years old\n" +
                        "Fed up with life and the way things are going...");
        Song eminemSong3 = new Song("Role Model", 320000000, 3, 1999, "/albumsPhoto/eminem/Eminem_-_The_Slim_Shady_LP_CD_cover.jpg",
                "I'm cancerous, so when I diss, you wouldn't wanna answer this...");
        Song eminemSong4 = new Song("Brain Damage", 280000000, 3, 1999, "/albumsPhoto/eminem/Eminem_-_The_Slim_Shady_LP_CD_cover.jpg",
                "Scalpel, no, I just dropped it and slipped on this wet floor...");
        Song eminemSong5 = new Song("97' Bonnie & Clyde", 300000000, 5, 1999, "/albumsPhoto/eminem/Eminem_-_The_Slim_Shady_LP_CD_cover.jpg",
                "Just the two of us...\nWe can make it if we try, just the two of us...");
        eminemSongs1.add(eminemSong1);
        eminemSongs1.add(eminemSong2);
        eminemSongs1.add(eminemSong3);
        eminemSongs1.add(eminemSong4);
        eminemSongs1.add(eminemSong5);
        Album eminemAlbum1 = new Album("The Slim Shady LP", 1999, 700000000, eminemSongs1.size(), 45, "/albumsPhoto/eminem/Eminem_-_The_Slim_Shady_LP_CD_cover.jpg", eminemSongs1);

        // Albüm 2: The Marshall Mathers LP (2000)
        Song eminemSong6 = new Song("The Real Slim Shady", 950000000, 4, 2000, "/albumsPhoto/eminem/marshaleeminem.jpg",
                "May I have your attention, please?\n" +
                        "Will the real Slim Shady please stand up?");
        Song eminemSong7 = new Song("Stan", 1000000000, 6, 2000, "/albumsPhoto/eminem/marshaleeminem.jpg",
                "Dear Slim, I wrote you but still ain't callin'...\n" +
                        "I left my cell, my pager, and my home phone at the bottom...");
        Song eminemSong8 = new Song("The Way I Am", 850000000, 5, 2000, "/albumsPhoto/eminem/marshaleeminem.jpg",
                "And I am, whatever you say I am...\n" +
                        "If I wasn't, then why would I say I am?");
        Song eminemSong9 = new Song("Kim", 600000000, 6, 2000, "/albumsPhoto/eminem/marshaleeminem.jpg",
                "Agh! Look at you! You're so precious!");
        Song eminemSong10 = new Song("Criminal", 580000000, 5, 2000, "/albumsPhoto/eminem/marshaleeminem.jpg",
                "A criminal! You're goddamn right\n" +
                        "I'm a criminal!");
        eminemSongs2.add(eminemSong6);
        eminemSongs2.add(eminemSong7);
        eminemSongs2.add(eminemSong8);
        eminemSongs2.add(eminemSong9);
        eminemSongs2.add(eminemSong10);
        Album eminemAlbum2 = new Album("The Marshall Mathers LP", 2000, 1200000000, eminemSongs2.size(), 53, "/albumsPhoto/eminem/marshaleeminem.jpg", eminemSongs2);

        // Albüm 3: The Eminem Show (2002)
        Song eminemSong11 = new Song("Without Me", 1100000000, 5, 2002, "/albumsPhoto/eminem/eminemshow.jpeg",
                "Guess who's back, back again...\n" +
                        "Shady's back, tell a friend...");
        Song eminemSong12 = new Song("Cleanin' Out My Closet", 870000000, 5, 2002, "/albumsPhoto/eminem/eminemshow.jpeg",
                "I'm sorry, Mama!\nI never meant to hurt you...");
        Song eminemSong13 = new Song("Sing for the Moment", 720000000, 5, 2002, "/albumsPhoto/eminem/eminemshow.jpeg",
                "These ideas are nightmares to white parents\n" +
                        "Whose worst fear is a child with dyed hair and who likes earrings...");
        Song eminemSong14 = new Song("Superman", 690000000, 6, 2002, "/albumsPhoto/eminem/eminemshow.jpeg",
                "They call me Superman, leap tall hoes in a single bound...");
        Song eminemSong15 = new Song("Till I Collapse", 1400000000, 5, 2002, "/albumsPhoto/eminem/eminemshow.jpeg",
                "Cause sometimes you just feel tired, you feel weak...\nBut when you feel weak, you feel like you wanna just give up...");
        eminemSongs3.add(eminemSong11);
        eminemSongs3.add(eminemSong12);
        eminemSongs3.add(eminemSong13);
        eminemSongs3.add(eminemSong14);
        eminemSongs3.add(eminemSong15);
        Album eminemAlbum3 = new Album("The Eminem Show", 2002, 1800000000, eminemSongs3.size(), 57, "/albumsPhoto/eminem/eminemshow.jpeg", eminemSongs3);

        // Albüm 4: Recovery (2010)
        Song eminemSong16 = new Song("Not Afraid", 1500000000, 4, 2010, "/albumsPhoto/eminem/Recovery_Album_Cover.jpg",
                "I'm not afraid, to take a stand\n" +
                        "Everybody, come take my hand...");
        Song eminemSong17 = new Song("Love the Way You Lie", 24000000, 5, 2010, "/albumsPhoto/eminem/Recovery_Album_Cover.jpg",
                "Just gonna stand there and watch me burn\n" +
                        "But that's alright because I like the way it hurts...");
        Song eminemSong18 = new Song("No Love", 850000000, 5, 2010, "/albumsPhoto/eminem/Recovery_Album_Cover.jpg",
                "It's a little too late to say that you're sorry now...");
        Song eminemSong19 = new Song("Space Bound", 700000000, 5, 2010, "/albumsPhoto/eminem/Recovery_Album_Cover.jpg",
                "I'm a space-bound rocket ship and your heart's the moon...");
        Song eminemSong20 = new Song("Cinderella Man", 480000000, 4, 2010, "/albumsPhoto/eminem/Recovery_Album_Cover.jpg",
                "If I had a time machine, I'd be Cinderella, man...");
        eminemSongs4.add(eminemSong16);
        eminemSongs4.add(eminemSong17);
        eminemSongs4.add(eminemSong18);
        eminemSongs4.add(eminemSong19);
        eminemSongs4.add(eminemSong20);
        Album eminemAlbum4 = new Album("Recovery", 2010, 30000000, eminemSongs4.size(), 48, "/albumsPhoto/eminem/Recovery_Album_Cover.jpg", eminemSongs4);

        // Albüm 5: Kamikaze (2018)
        Song eminemSong21 = new Song("Lucky You", 1000000000, 4, 2018, "/albumsPhoto/eminem/Eminem_-_Kamikaze.jpg",
                "I done won a couple Grammys, but I sold my soul to get 'em...");
        Song eminemSong22 = new Song("The Ringer", 850000000, 5, 2018, "/albumsPhoto/eminem/Eminem_-_Kamikaze.jpg",
                "I'm just gonna write down my first thoughts\nSee where this takes me...");
        Song eminemSong23 = new Song("Venom", 770000000, 4, 2018, "/albumsPhoto/eminem/Eminem_-_Kamikaze.jpg",
                "I got a song filled with sh- for the strong-willed\n" +
                        "When the world gives you a raw deal\n" +
                        "Sets you off 'til you scream, \"Piss off! Screw you!\"\n" +
                        "When it talks to you like you don't belong\n" +
                        "Or tells you you're in the wrong field\n" +
                        "When something's in your mitochondrial\n" +
                        "'Cause it latched on to you, like-\n" +
                        "Knock knock, let the devil in\n" +
                        "Manevolent as I've ever been, head is spinnin'\n" +
                        "This medicine's screamin', \"l-l-l-let us in!\"\n" +
                        "L-l-l-like a salad bowl, Edgar Allan Poe\n" +
                        "Bedridden, shoulda been dead a long time ago\n" +
                        "Liquid tylenol, gelatins, think my skeleton's meltin'\n" +
                        "Wicked, I get all high when I think I've smelled the scent\n" +
                        "Of elephant manure, hell, I meant Kahlúa\n" +
                        "Screw it, to hell with it, I went through hell with accelerants\n" +
                        "And blew up my-my-myself again\n" +
                        "Volkswagen, tailspin, bucket matches my pale skin\n" +
                        "Mayo and went from hellmann's and being rail thin\n" +
                        "Filet-o-Fish, Scribble Jam, Rap Olympics '97 Freaknik\n" +
                        "How can I be down? Me and Bizarre in Florida\n" +
                        "Proof's room slept on the floor of da motel then\n" +
                        "Dr. Dre said, \"Hell yeah!\"\n" +
                        "And I got his stamp like a postcard, word to Mel-Man\n" +
                        "And I know they're gonna hate\n" +
                        "But I don't care, I barely can wait\n" +
                        "To hit 'em with the snare and the bass\n" +
                        "Square in the face, this f- world better prepare to get laced\n" +
                        "Because they're gonna taste my\n" +
                        "Venom, (I got that) adrenaline momentum\n" +
                        "And I'm not knowin' when I'm\n" +
                        "Ever gonna slow up and I'm\n" +
                        "Ready to snap any moment I'm\n" +
                        "Thinkin' it's time to go get 'em\n" +
                        "They ain't gonna know what hit 'em\n" +
                        "(W-w-when they get bit with the)\n" +
                        "Venom, (I got that) adrenaline momentum\n" +
                        "And I'm not knowin' when I'm\n" +
                        "Ever gonna slow up and I'm\n" +
                        "Ready to snap any moment I'm\n" +
                        "Thinkin' it's time to go get 'em\n" +
                        "They ain't gonna know what hit 'em\n" +
                        "(W-w-when they get bit with the)\n" +
                        "I said knock knock, let the devil in\n" +
                        "Shotgun p-p-pellets in the felt pen\n" +
                        "Cocked, f- around and catch a hot one\n" +
                        "It-it's evident, I'm not done\n" +
                        "V-venomous, the thoughts spun\n" +
                        "Like a web and you just caught in 'em\n" +
                        "Held against your will like a hubcap or mud flap\n" +
                        "Beat strangler attack\n" +
                        "So this ain't gonna feel like a love tap\n" +
                        "Eat painkiller pills, f- up the track\n" +
                        "Like, what's her name's at the wheel? Danica Patrick\n" +
                        "Threw the car into reverse at the Indy, a nut crashin'\n" +
                        "Into ya, the back of it just mangled steel\n" +
                        "My Mustang and the jeep Wrangler grill\n" +
                        "With the front smashed, much as my rear fender, assassin\n" +
                        "Slim be a combination of an actual kamikaze and Gandhi (Gandhi)\n" +
                        "Translation, I will probably kill us both\n" +
                        "When I end up backin' into ya\n" +
                        "You ain't gonna be able to tell what the fuck's happenin' to ya\n" +
                        "When you're bit with the\n" +
                        "Venom, adrenaline momentum\n" +
                        "And I'm not knowin' when I'm\n" +
                        "Ever gonna slow up and I'm\n" +
                        "Ready to snap any moment I'm\n" +
                        "Thinkin' it's time to go get 'em\n" +
                        "They ain't gonna know what hit 'em\n" +
                        "(W-w-when they get bit with the)\n" +
                        "Venom, (I got that) adrenaline momentum\n" +
                        "And I'm not knowin' when I'm\n" +
                        "Ever gonna slow up and I'm\n" +
                        "Ready to snap any moment I'm\n" +
                        "Thinkin' it's time to go get 'em\n" +
                        "They ain't gonna know what hit 'em\n" +
                        "(W-w-when they get bit with the)\n" +
                        "I said knock knock, let the devil in\n" +
                        "Alien, E-E-Elliott phone home\n" +
                        "Ain't no telling when this chokehold\n" +
                        "On this game will end, I'm loco\n" +
                        "Became a symbiote, so\n" +
                        "My fangs are in your throat, h-\n" +
                        "You're snake-bitten with my, venom\n" +
                        "With the ballpoint pen, I'm\n" +
                        "Gun cocked, bump stock, double-aught, buckshot\n" +
                        "Tire thumper, a garrote, tie a couple knots\n" +
                        "Fired up and caught fire, juggernaut\n" +
                        "Punk rock, b-, it's goin' down like Yung Joc\n" +
                        "'Cause the Doc put me on like sunblock\n" +
                        "Why the f-not, you only get one shot\n" +
                        "Ate sh- 'til I can't taste it\n" +
                        "Chased it with straight liquor\n" +
                        "Then paint thinner, then drank 'til I faint\n" +
                        "And awake with a headache\n" +
                        "And I take anything in rectangular shape\n" +
                        "Then I wait to face the demons I'm bonded to\n" +
                        "'Cause they're chasin' me, but I'm part of you\n" +
                        "So escapin' me is impossible\n" +
                        "I latch onto you like a parasite\n" +
                        "And I probably ruined your parents' life\n" +
                        "And your childhood too\n" +
                        "'Cause if I'm the music that y'all grew up on\n" +
                        "I'm responsible for you - fools\n" +
                        "I'm the super villain Dad and Mom was losin' their marbles to\n" +
                        "You marvel that? Eddie Brock is you\n" +
                        "And I'm the suit, so call me\n" +
                        "Venom, (I got that) adrenaline momentum\n" +
                        "And I'm not knowing when I'm\n" +
                        "Ever gonna slow up and I'm\n" +
                        "Ready to snap any moment I'm\n" +
                        "Thinkin' it's time to go get 'em\n" +
                        "They ain't gonna know what hit 'em\n" +
                        "(W-w-when they get bit with the)\n" +
                        "Venom, (I got that) adrenaline momentum\n" +
                        "And I'm not knowing when I'm\n" +
                        "Ever gonna slow up and I'm\n" +
                        "Ready to snap any moment I'm\n" +
                        "Thinkin' it's time to go get 'em\n" +
                        "They ain't gonna know what hit 'em\n" +
                        "(W-w-when they get bit with the)");
        Song eminemSong24 = new Song("Fall", 650000000, 4, 2018, "/albumsPhoto/eminem/Eminem_-_Kamikaze.jpg",
                "Don't fall on my face, don't fall on my faith, oh...");
        Song eminemSong25 = new Song("Good Guy", 450000000, 5, 2018, "/albumsPhoto/eminem/Eminem_-_Kamikaze.jpg",
                "Here we go again, from heroes to villains...");
        eminemSongs5.add(eminemSong21);
        eminemSongs5.add(eminemSong22);
        eminemSongs5.add(eminemSong23);
        eminemSongs5.add(eminemSong24);
        eminemSongs5.add(eminemSong25);
        Album eminemAlbum5 = new Album("Kamikaze", 2018, 1500000000, eminemSongs5.size(), 42, "/albumsPhoto/eminem/Eminem_-_Kamikaze.jpg", eminemSongs5);

        // Albümleri listeye ekleyelim
        albumsEminem.add(eminemAlbum1);
        albumsEminem.add(eminemAlbum2);
        albumsEminem.add(eminemAlbum3);
        albumsEminem.add(eminemAlbum4);
        albumsEminem.add(eminemAlbum5);

        // Eminem sanatçısını oluşturma
        Artist eminem = new Artist(4, "Eminem", 1999, 220000000, 11,
                "/artistPhoto/eminem.jpeg", "1972",
                "Eminem, Amerikali rapci, söz yazari ve produktordur. 1999 yilinda 'The Slim Shady LP' ile buyuk bir cıkıs yakalamıstır. " +
                        "Kendine has tarzi ve keskin sözleriyle, hip hop müziginde çıgır açmış ve bircok odul kazanmıstır. " +
                        "Eminem, ozellikle kisisel hayatı ve sosyal konular üzerine yazdıgı sarkılarla taninmaktadir.",
                albumsEminem);

        // Sanatçı biyografisi
        artists.add(eminem);
    }
    public void createArcticMonkeysData() {


        // Albüm 1: Whatever People Say I Am, That's What I'm Not (2006)
        Song song1 = new Song("I Bet You Look Good on the Dancefloor", 350000000, 3, 2006, "/albumsPhoto/arcticmonkeys/Whatever_People_Say_I_Am,_That's_What_I'm_Not_(2006_Arctic_Monkeys_album).jpg",
                "Dancing to electro-pop like a robot from 1984...");
        Song song2 = new Song("When the Sun Goes Down", 450000000, 3, 2006, "/albumsPhoto/arcticmonkeys/Whatever_People_Say_I_Am,_That's_What_I'm_Not_(2006_Arctic_Monkeys_album).jpg",
                "There's a story in my eyes, and I'm not the one to tell it...");
        Song song3 = new Song("The View from the Afternoon", 400000000, 3, 2006, "/albumsPhoto/arcticmonkeys/Whatever_People_Say_I_Am,_That's_What_I'm_Not_(2006_Arctic_Monkeys_album).jpg",
                "The view from the afternoon...");
        Song song4 = new Song("I Never Thought I'd See You Again", 300000000, 3, 2006, "/albumsPhoto/arcticmonkeys/Whatever_People_Say_I_Am,_That's_What_I'm_Not_(2006_Arctic_Monkeys_album).jpg",
                "I never thought I'd see you again...");
        Song song5 = new Song("Fake Tales of San Francisco", 350000000, 3, 2006, "/albumsPhoto/arcticmonkeys/Whatever_People_Say_I_Am,_That's_What_I'm_Not_(2006_Arctic_Monkeys_album).jpg",
                "Fake tales of San Francisco...");
        Song song6 = new Song("A Certain Romance", 320000000, 3, 2006, "/albumsPhoto/arcticmonkeys/Whatever_People_Say_I_Am,_That's_What_I'm_Not_(2006_Arctic_Monkeys_album).jpg",
                "A certain romance, it seems...");

        songs16.add(song1);
        songs16.add(song2);
        songs16.add(song3);
        songs16.add(song4);
        songs16.add(song5);
        songs16.add(song6);
        Album album1 = new Album("Whatever People Say I Am, That's What I'm Not", 2006, 800000000, songs16.size(), 43, "/albumsPhoto/arcticmonkeys/Whatever_People_Say_I_Am,_That's_What_I'm_Not_(2006_Arctic_Monkeys_album).jpg", songs16);

        // Albüm 2: Favourite Worst Nightmare (2007)
        Song song7 = new Song("Brianstorm", 600000000, 3, 2007, "/albumsPhoto/arcticmonkeys/aritcmonkeysfavoriteworst.jpeg",
                "Brian, you know, we need to get together...");
        Song song8 = new Song("Teddy Picker", 500000000, 3, 2007, "/albumsPhoto/arcticmonkeys/aritcmonkeysfavoriteworst.jpeg",
                "How'd you find out I was a winner...");
        Song song9 = new Song("D Is for Dangerous", 400000000, 3, 2007, "/albumsPhoto/arcticmonkeys/aritcmonkeysfavoriteworst.jpeg",
                "D is for dangerous...");
        Song song10 = new Song("Balaclava", 450000000, 3, 2007, "/albumsPhoto/arcticmonkeys/aritcmonkeysfavoriteworst.jpeg",
                "You might think I’m a bit of a coward...");
        Song song11 = new Song("Fluorescent Adolescent", 700000000, 4, 2007, "/albumsPhoto/arcticmonkeys/aritcmonkeysfavoriteworst.jpeg",
                "Flicking through a little book of sex tips...");
        Song song12 = new Song("505", 600000000, 4, 2007, "/albumsPhoto/arcticmonkeys/aritcmonkeysfavoriteworst.jpeg",
                "I'm going back to 505...");

        songs17.add(song7);
        songs17.add(song8);
        songs17.add(song9);
        songs17.add(song10);
        songs17.add(song11);
        songs17.add(song12);
        Album album2 = new Album("Favourite Worst Nightmare", 2007, 900000000, songs17.size(), 43, "/albumsPhoto/arcticmonkeys/aritcmonkeysfavoriteworst.jpeg", songs17);

        // Albüm 3: Humbug (2009)
        Song song13 = new Song("My Propeller", 450000000, 3, 2009, "/albumsPhoto/arcticmonkeys/Arcticmonkeys-humbug.jpg",
                "My propeller won't spin...");
        Song song14 = new Song("Crying Lightning", 500000000, 3, 2009, "/albumsPhoto/arcticmonkeys/Arcticmonkeys-humbug.jpg",
                "I've got a feeling in my stomach...");
        Song song15 = new Song("Cornerstone", 400000000, 3, 2009, "/albumsPhoto/arcticmonkeys/Arcticmonkeys-humbug.jpg",
                "I’m going to the corner store...");
        Song song16 = new Song("Dancefloor", 380000000, 3, 2009, "/albumsPhoto/arcticmonkeys/Arcticmonkeys-humbug.jpg",
                "Dancefloor, oh, dancefloor...");
        Song song17 = new Song("Secret Door", 350000000, 3, 2009, "/albumsPhoto/arcticmonkeys/Arcticmonkeys-humbug.jpg",
                "There's a secret door...");
        Song song18 = new Song("The Jeweller's Hands", 300000000, 3, 2009, "/albumsPhoto/arcticmonkeys/Arcticmonkeys-humbug.jpg",
                "The jeweller's hands are cold...");

        songs18.add(song13);
        songs18.add(song14);
        songs18.add(song15);
        songs18.add(song16);
        songs18.add(song17);
        songs18.add(song18);
        Album album3 = new Album("Humbug", 2009, 700000000, songs18.size(), 47, "/albumsPhoto/arcticmonkeys/Arcticmonkeys-humbug.jpg", songs18);

        // Albüm 4: AM (2013)
        Song song19 = new Song("Do I Wanna Know?", 700000000, 4, 2013, "/albumsPhoto/arcticmonkeys/AMarcticmonkey.jpg",
                "Have you got colour in your cheeks?\n" +
                        "Do you ever get that fear that you can't shift\n" +
                        "The type that sticks around like summat in your teeth?\n" +
                        "Are there some aces up your sleeve?\n" +
                        "Have you no idea that you're in deep?\n" +
                        "I dreamt about you nearly every night this week\n" +
                        "How many secrets can you keep?\n" +
                        "'Cause there's this tune I found that makes me think of you somehow\n" +
                        "And I play it on repeat\n" +
                        "Until I fall asleep\n" +
                        "Spilling drinks on my settee\n" +
                        "\n" +
                        "(Do I wanna know?)\n" +
                        "If this feeling flows both ways?\n" +
                        "(Sad to see you go)\n" +
                        "Was sort of hoping that you'd stay\n" +
                        "(Baby, we both know)\n" +
                        "That the nights were mainly made for saying things that you can't say tomorrow day\n" +
                        "\n" +
                        "Crawling back to you\n" +
                        "\n" +
                        "Ever thought of calling when you've had a few?\n" +
                        "'Cause I always do\n" +
                        "Maybe I'm too busy being yours to fall for somebody new\n" +
                        "Now I've thought it through\n" +
                        "\n" +
                        "Crawling back to you\n" +
                        "\n" +
                        "So have you got the guts?\n" +
                        "Been wondering if your heart's still open and if so I wanna know what time it shuts\n" +
                        "Simmer down and pucker up\n" +
                        "I'm sorry to interrupt\n" +
                        "It's just I'm constantly on the cusp\n" +
                        "Of trying to kiss you\n" +
                        "I don't know if you feel the same as I do\n" +
                        "But we could be together\n" +
                        "If you wanted to\n" +
                        "\n" +
                        "(Do I wanna know?)\n" +
                        "If this feeling flows both ways?\n" +
                        "(Sad to see you go)\n" +
                        "Was sort of hoping that you'd stay\n" +
                        "(Baby, we both know)\n" +
                        "That the nights were mainly made for saying things that you can't say tomorrow day\n" +
                        "\n" +
                        "Crawling back to you (crawling back to you)\n" +
                        "\n" +
                        "Ever thought of calling when you've had a few? (you've had a few)\n" +
                        "'Cause I always do ('cause I always do)\n" +
                        "Maybe I'm too (maybe I'm too busy) busy being yours to fall for somebody new\n" +
                        "Now I've thought it through\n" +
                        "\n" +
                        "Crawling back to you\n" +
                        "\n" +
                        "(Do I wanna know?)\n" +
                        "If this feeling flows both ways?\n" +
                        "(Sad to see you go)\n" +
                        "Was sort of hoping that you'd stay\n" +
                        "(Baby, we both know)\n" +
                        "That the nights were mainly made for saying things that you can't say tomorrow day\n" +
                        "\n" +
                        "(Do I wanna know?)\n" +
                        "Too busy being yours to fall\n" +
                        "(Sad to see you go)\n" +
                        "Ever thought of calling darling?\n" +
                        "(Do I wanna know?)\n" +
                        "Do you want me crawling back to you?");
        Song song20 = new Song("R U Mine?", 600000000, 4, 2013, "/albumsPhoto/arcticmonkeys/AMarcticmonkey.jpg",
                "I'm a puppet on a string\n" +
                        "Tracy Island, time-travelin' diamond cutter-shaped heartaches\n" +
                        "Come to find you four in some velvet mornin' years too late\n" +
                        "She's a silver linin', lone ranger ridin' through an open space\n" +
                        "In my mind, when she's not right there beside me\n" +
                        "I go crazy 'cause here isn't where I wanna be\n" +
                        "And satisfaction feels like a distant memory\n" +
                        "And I can't help myself\n" +
                        "All I wanna ever say is, \"Are you mine?\"\n" +
                        "Well, are you mine?\n" +
                        "Are you mine?\n" +
                        "Are you mine? Oh, ah\n" +
                        "I guess what I'm tryin' to say is I need the deep end\n" +
                        "Keep imaginin' meetin', wished away entire lifetimes\n" +
                        "Unfair we're not somewhere misbehavin' for days\n" +
                        "Great escape, lost track of time and space\n" +
                        "She's a silver linin', climbin' on my desire\n" +
                        "And I go crazy 'cause here isn't where I wanna be\n" +
                        "And satisfaction feels like a distant memory\n" +
                        "And I can't help myself\n" +
                        "All I wanna ever say is, \"Are you mine?\"\n" +
                        "Well, are you mine? (Are you mine tomorrow?)\n" +
                        "Are you mine? (Or just mine tonight?)\n" +
                        "Are you mine? (Are you mine? Mine?)\n" +
                        "And the thrill of the chase moves in mysterious ways\n" +
                        "So in case I'm mistaken, I\n" +
                        "Just wanna hear you say, \"You got me baby\"\n" +
                        "\"Are you mine?\"\n" +
                        "She's a silver linin', lone ranger ridin' through an open space\n" +
                        "In my mind, when she's not right there beside me\n" +
                        "I go crazy 'cause here isn't where I wanna be\n" +
                        "And satisfaction feels like a distant memory\n" +
                        "And I can't help myself\n" +
                        "All I wanna ever say is, \"Are you mine?\"\n" +
                        "Well, are you mine? (Are you mine tomorrow?)\n" +
                        "Are you mine? (Or just mine tonight?)\n" +
                        "Are you mine? (Are you mine tomorrow?)\n" +
                        "(Oh, ah, or just mine tonight?)");
        Song song21 = new Song("One for the Road", 550000000, 4, 2013, "/albumsPhoto/arcticmonkeys/AMarcticmonkey.jpg",
                "You know I could never give you up...");
        Song song22 = new Song("Arabella", 500000000, 4, 2013, "/albumsPhoto/arcticmonkeys/AMarcticmonkey.jpg",
                "Arabella's got some business...");
        Song song23 = new Song("I Want It All", 450000000, 4, 2013, "/albumsPhoto/arcticmonkeys/AMarcticmonkey.jpg",
                "I want it all, I want it all...");
        Song song24 = new Song("No. 1 Party Anthem", 400000000, 3, 2013, "/albumsPhoto/arcticmonkeys/AMarcticmonkey.jpg",
                "The No. 1 party anthem...");

        songs19.add(song19);
        songs19.add(song20);
        songs19.add(song21);
        songs19.add(song22);
        songs19.add(song23);
        songs19.add(song24);
        Album album4 = new Album("AM", 2013, 800000000, songs19.size(), 40, "/albumsPhoto/arcticmonkeys/AMarcticmonkey.jpg", songs19);

        // Albümleri Arctic Monkeys sanatçısına ekleme
        albumsArcticMonkeys.add(album1);
        albumsArcticMonkeys.add(album2);
        albumsArcticMonkeys.add(album3);
        albumsArcticMonkeys.add(album4);

        // Arctic Monkeys sanatçısını oluşturma
        Artist arcticMonkeys = new Artist(5, "Arctic Monkeys", 2002, 1000000000, 4,
                "/artistPhoto/arcticmonkeys.jpeg", "2002",
                "Arctic Monkeys, 2002 yılında Sheffield, İngiltere'de kurulmuş bir rock grubudur. " +
                        "Grup, enerjik performanslari ve akilda kalici melodileriyle tanınmaktadır. " +
                        "Cikis albumleri 'Whatever People Say I Am, That's What I'm Not' ile buyuk bir basari yakalamsitir.",
                albumsArcticMonkeys);

        // Sanatçıyı listeye ekleme
        artists.add(arcticMonkeys);
    }


    public void createNirvanaData() {
        // Albüm 1: Bleach (1989)
        List<Song> songs1 = new ArrayList<>();
        songs21.add(new Song("About a Girl", 200000000, 3, 1989, "/albumsPhoto/nirvana/bleachnirvana.jpeg",
                "I need an easy friend...\nI do with an ear to lend..."));
        songs21.add(new Song("Dive", 300000000, 3, 1989, "/albumsPhoto/nirvana/bleachnirvana.jpeg",
                "I can't see you, I'm so far away...\nI'm so far away..."));
        songs21.add(new Song("Been a Son", 250000000, 2, 1989, "/albumsPhoto/nirvana/bleachnirvana.jpeg",
                "I wish I could be a little more like you...\nBut I just can't..."));
        songs21.add(new Song("Negative Creep", 280000000, 2, 1989, "/albumsPhoto/nirvana/bleachnirvana.jpeg",
                "I'm a negative creep, I'm a negative creep..."));
        songs21.add(new Song("Stain", 270000000, 2, 1989, "/albumsPhoto/nirvana/bleachnirvana.jpeg",
                "I've got a stain on my shirt...\nIt's a permanent stain..."));
        Album album1 = new Album("Bleach", 1989, 400000000, songs21.size(), 42, "/albumsPhoto/nirvana/bleachnirvana.jpeg", songs21);

        // Albüm 2: Nevermind (1991)

        songs22.add(new Song("Smells Like Teen Spirit", 1200000000, 5, 1991, "/albumsPhoto/nirvana/Nevermind_album_kapak.jpg",
                "Load up on guns, bring your friends\n" +
                        "It's fun to lose and to pretend\n" +
                        "She's over-bored and self-assured\n" +
                        "Oh no, I know a dirty word\n" +
                        "Hello, hello, hello, how low\n" +
                        "Hello, hello, hello, how low\n" +
                        "Hello, hello, hello, how low\n" +
                        "Hello, hello, hello\n" +
                        "With the lights out, it's less dangerous\n" +
                        "Here we are now, entertain us\n" +
                        "I feel stupid and contagious\n" +
                        "Here we are now, entertain us\n" +
                        "A mulatto, an albino\n" +
                        "A mosquito, my libido\n" +
                        "Yeah\n" +
                        "Hey\n" +
                        "Yay\n" +
                        "I'm worse at what I do best\n" +
                        "And for this gift I feel blessed\n" +
                        "Our little group has always been\n" +
                        "And always will until the end\n" +
                        "Hello, hello, hello, how low\n" +
                        "Hello, hello, hello, how low\n" +
                        "Hello, hello, hello, how low\n" +
                        "Hello, hello, hello\n" +
                        "With the lights out, it's less dangerous\n" +
                        "Here we are now, entertain us\n" +
                        "I feel stupid and contagious\n" +
                        "Here we are now, entertain us\n" +
                        "A mulatto, an albino\n" +
                        "A mosquito, my libido\n" +
                        "Yeah\n" +
                        "Hey\n" +
                        "Yay\n" +
                        "And I forget just why I taste\n" +
                        "Oh yeah, I guess it makes me smile\n" +
                        "I found it hard, it's hard to find\n" +
                        "Ooh well, whatever, nevermind\n" +
                        "Hello, hello, hello, how low\n" +
                        "Hello, hello, hello, how low\n" +
                        "Hello, hello, hello, how low\n" +
                        "Hello, hello, hello\n" +
                        "With the lights out, it's less dangerous\n" +
                        "Here we are now, entertain us\n" +
                        "I feel stupid and contagious\n" +
                        "Here we are now, entertain us\n" +
                        "A mulatto, an albino\n" +
                        "A mosquito, my libido\n" +
                        "A denial\n" +
                        "A denial\n" +
                        "A denial\n" +
                        "A denial\n" +
                        "A denial\n" +
                        "A denial\n" +
                        "A denial\n" +
                        "A denial\n" +
                        "A denial"));
        songs22.add(new Song("Come as You Are", 850000000, 4, 1991, "/albumsPhoto/nirvana/Nevermind_album_kapak.jpg",
                "Come as you are, as you were...\nAs I want you to be..."));
        songs22.add(new Song("Lithium", 700000000, 4, 1991, "/albumsPhoto/nirvana/Nevermind_album_kapak.jpg",
                "I'm so happy 'cause today...\nI've found my friends..."));
        songs22.add(new Song("In Bloom", 600000000, 4, 1991, "/albumsPhoto/nirvana/Nevermind_album_kapak.jpg",
                "Sell the kids for food...\nWeather changes moods..."));
        songs22.add(new Song("Heart-Shaped Box", 600000000, 5, 1991, "/albumsPhoto/nirvana/Nevermind_album_kapak.jpg",
                "I've been locked inside your heart-shaped box for weeks..."));
        Album album2 = new Album("Nevermind", 1991, 800000000, songs22.size(), 49, "/albumsPhoto/nirvana/Nevermind_album_kapak.jpg", songs22);

        // Albüm 3: In Utero (1993)

        songs23.add(new Song("Heart-Shaped Box", 900000000, 4, 1993, "/albumsPhoto/nirvana/In_Utero_(Nirvana)_album_cover.jpg",
                "I've been locked inside your heart-shaped box for weeks..."));
        songs23.add(new Song("Rape Me", 750000000, 3, 1993, "/albumsPhoto/nirvana/In_Utero_(Nirvana)_album_cover.jpg",
                "Rape me, rape me, my friend...\nRape me, rape me again..."));
        songs23.add(new Song("Frances Farmer Will Have Her Revenge on Seattle", 650000000, 4, 1993, "/albumsPhoto/nirvana/In_Utero_(Nirvana)_album_cover.jpg",
                "Frances Farmer will have her revenge on Seattle..."));
        songs23.add(new Song("Dumb", 600000000, 3, 1993, "/albumsPhoto/nirvana/In_Utero_(Nirvana)_album_cover.jpg",
                "My girl, my girl, don't lie to me...\nTell me, where did you sleep last night?"));
        songs23.add(new Song("All Apologies", 650000000, 3, 1993, "/albumsPhoto/nirvana/In_Utero_(Nirvana)_album_cover.jpg",
                "What else should I be?\nAll apologies..."));
        Album album3 = new Album("In Utero", 1993, 700000000, songs23.size(), 45, "/albumsPhoto/nirvana/In_Utero_(Nirvana)_album_cover.jpg", songs23);

        // Albüm 4: MTV Unplugged in New York (1994)

        songs24.add(new Song("About a Girl", 400000000, 3, 1994, "/albumsPhoto/nirvana/MTVUnpluggedinNewYork.jpeg",
                "I need an easy friend...\nI do with an ear to lend..."));
        songs24.add(new Song("Come as You Are", 600000000, 4, 1994, "/albumsPhoto/nirvana/MTVUnpluggedinNewYork.jpeg",
                "Come as you are, as you were...\nAs I want you to be..."));
        songs24.add(new Song("Plateau", 300000000, 4, 1994, "/albumsPhoto/nirvana/MTVUnpluggedinNewYork.jpeg",
                "If you were in my position...\nWould you do the same?"));
        songs24.add(new Song("Lake of Fire", 300000000, 4, 1994, "/albumsPhoto/nirvana/MTVUnpluggedinNewYork.jpeg",
                "Where do bad folks go when they die?\nThey don't go to heaven where the angels fly..."));
        songs24.add(new Song("All Apologies", 500000000, 4, 1994, "/albumsPhoto/nirvana/MTVUnpluggedinNewYork.jpeg",
                "What else should I be?\nAll apologies..."));
        Album album4 = new Album("MTV Unplugged in New York", 1994, 500000000, songs24.size(), 52, "/albumsPhoto/nirvana/MTVUnpluggedinNewYork.jpeg", songs24);

        // Albüm 5: From the Muddy Banks of the Wishkah (1996)

        songs25.add(new Song("Smells Like Teen Spirit", 800000000, 5, 1996, "/albumsPhoto/nirvana/FromtheMuddyBanksoftheWishkah.jpg",
                "With the lights out, it's less dangerous...\nHere we are now, entertain us..."));
        songs25.add(new Song("Aneurysm", 600000000, 4, 1996, "/albumsPhoto/nirvana/FromtheMuddyBanksoftheWishkah.jpg",
                "Love you so much, I can't stop..."));
        songs25.add(new Song("Been a Son", 450000000, 2, 1996, "/albumsPhoto/nirvana/FromtheMuddyBanksoftheWishkah.jpg",
                "I wish I could be a little more like you...\nBut I just can't..."));
        songs25.add(new Song("Heart-Shaped Box", 500000000, 5, 1996, "/albumsPhoto/nirvana/FromtheMuddyBanksoftheWishkah.jpg",
                "I've been locked inside your heart-shaped box for weeks..."));
        songs25.add(new Song("All Apologies", 600000000, 3, 1996, "/albumsPhoto/nirvana/FromtheMuddyBanksoftheWishkah.jpg",
                "What else should I be?\nAll apologies..."));
        Album album5 = new Album("From the Muddy Banks of the Wishkah", 1996, 600000000, songs25.size(), 58, "/albumsPhoto/nirvana/FromtheMuddyBanksoftheWishkah.jpg", songs25);

        // Albümleri Nirvana sanatçısına ekleme

        albumsNirvana.add(album1);
        albumsNirvana.add(album2);
        albumsNirvana.add(album3);
        albumsNirvana.add(album4);
        albumsNirvana.add(album5);

        // Nirvana sanatçısını oluşturma
        Artist nirvana = new Artist(2, "Nirvana", 1987, 750000000, 5,
                "/artistPhoto/nirvana.jpeg", "1987",
                "Nirvana, 1987 yılında Seattle, Washington'da kurulmuş bir rock grubudur. " +
                        "Grup, alternatif rock ve grunge turlerinde müzik yapmis ve 'Nevermind' albumu ile dunya capinda " +
                        "buyuk bir basari elde etmistir. Kurt Cobain, Krist Novoselic ve Dave Grohl'dan olusan Nirvana, " +
                        "müzik dünyasinda derin bir etki birakmis ve genç nesillerin sesi haline gelmistir.",
                albumsNirvana);

        // Sanatçıyı listeye ekleme
        artists.add(nirvana);
    }


}