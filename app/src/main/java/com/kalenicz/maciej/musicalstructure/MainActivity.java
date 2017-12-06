package com.kalenicz.maciej.musicalstructure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set the action bar elevation to 0dp
        getSupportActionBar().setElevation(0);

        ArrayList<SongDetail> songDetails = new ArrayList<>();
        songDetails.add(new SongDetail("American Idiot", "Green Day", "American Idiot", R.drawable.greenday));
        songDetails.add(new SongDetail("American Idiot", "Green Day", "American Idiot", R.drawable.greenday));
        songDetails.add(new SongDetail("American Idiot", "Green Day", "American Idiot", R.drawable.greenday));
        songDetails.add(new SongDetail("American Idiot", "Green Day", "American Idiot", R.drawable.greenday));
        songDetails.add(new SongDetail("American Idiot", "Green Day", "American Idiot", R.drawable.greenday));
        songDetails.add(new SongDetail("American Idiot", "Green Day", "American Idiot", R.drawable.greenday));
        songDetails.add(new SongDetail("American Idiot", "Green Day", "American Idiot", R.drawable.greenday));
        songDetails.add(new SongDetail("American Idiot", "Green Day", "American Idiot", R.drawable.greenday));
        songDetails.add(new SongDetail("American Idiot", "Green Day", "American Idiot", R.drawable.greenday));
        songDetails.add(new SongDetail("American Idiot", "Green Day", "American Idiot", R.drawable.greenday));
        songDetails.add(new SongDetail("American Idiot", "Green Day", "American Idiot", R.drawable.greenday));
        songDetails.add(new SongDetail("American Idiot", "Green Day", "American Idiot", R.drawable.greenday));



        GridView gridView = findViewById(R.id.grid_view_albums);
        AlbumAdapter albumAdapter = new AlbumAdapter(this, songDetails);
        gridView.setAdapter(albumAdapter);
    }
}
