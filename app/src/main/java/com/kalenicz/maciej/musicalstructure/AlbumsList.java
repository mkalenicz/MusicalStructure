package com.kalenicz.maciej.musicalstructure;

import java.util.ArrayList;

/**
 * Created by maciej on 10.12.2017.
 */

public class AlbumsList {
    public static ArrayList<AlbumDetails> getSongDetails() {
        ArrayList<AlbumDetails> albumDetails;
        albumDetails = new ArrayList<>();
        albumDetails.add(new AlbumDetails("Green Day", "American Idiot", R.drawable.greenday));
        albumDetails.add(new AlbumDetails("Coldplay", "X & Y", R.drawable.xycover));
        albumDetails.add(new AlbumDetails("Nirvana", "Nevermind", R.drawable.nirvana));
        albumDetails.add(new AlbumDetails("David Guetta", "Nothing But The Beat", R.drawable.davidguetta));
        albumDetails.add(new AlbumDetails("The Black Eyed Peas", "Monkey Business", R.drawable.blackeyedpeas));
        albumDetails.add(new AlbumDetails("Flo Rida", "Wild Ones", R.drawable.florida));
        albumDetails.add(new AlbumDetails("Muse", "The Resistance", R.drawable.muse));
        albumDetails.add(new AlbumDetails("Red Hot Chili Peppers", "Stadium Arcadium", R.drawable.redhot));
        return albumDetails;
    }
}
