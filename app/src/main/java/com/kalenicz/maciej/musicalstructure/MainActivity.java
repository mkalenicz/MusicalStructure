package com.kalenicz.maciej.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<SongDetail> songDetails;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        songDetails = new ArrayList<>();
        songDetails.add(new SongDetail("Green Day", "American Idiot", R.drawable.greenday));
        songDetails.add(new SongDetail("Coldplay", "X & Y", R.drawable.xycover));
        songDetails.add(new SongDetail("Nirvana", "Nevermind", R.drawable.nirvana));
        songDetails.add(new SongDetail("David Guetta", "Nothing But The Beat", R.drawable.davidguetta));
        songDetails.add(new SongDetail("The Black Eyed Peas", "Monkey Business", R.drawable.blackeyedpeas));
        songDetails.add(new SongDetail("Flo Rida", "Wild Ones", R.drawable.florida));
        songDetails.add(new SongDetail("Muse", "The Resistance", R.drawable.muse));
        songDetails.add(new SongDetail("Red Hot Chili Peppers", "Stadium Arcadium", R.drawable.redhot));

        GridView gridView = findViewById(R.id.grid_view_albums);
        AlbumAdapter albumAdapter = new AlbumAdapter(this, songDetails);
        gridView.setAdapter(albumAdapter);

       gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
//                Intent intent = new Intent(MainActivity.this, AlbumDetailsAdapter.class);

                Intent albumDetailsIntent = new Intent(MainActivity.this, AlbumDetailsActivity.class);
                SongDetail currentSong = songDetails.get(position);

                Bundle bundle = new Bundle();
                bundle.putString("album_name", currentSong.getAlbumName());
                bundle.putString("artist_name", currentSong.getArtistName());
                bundle.putInt("album_image", currentSong.getAlbumImage());

                albumDetailsIntent.putExtras(bundle);
                albumDetailsIntent.putExtras(bundle);
                startActivity(albumDetailsIntent);
            }
        });
    }
}

//songDetails = new ArrayList<>();
//        songDetails.add(new SongDetail("American Idiot", "Green Day", "American Idiot", R.drawable.greenday));
//        songDetails.add(new SongDetail("Square One", "Coldplay", "X & Y", R.drawable.xycover));
//        songDetails.add(new SongDetail("Smells Like Teen Spirit", "Nirvana", "Nevermind", R.drawable.nirvana));
//        songDetails.add(new SongDetail("The Alphabeat", "David Guetta", "Nothing But The Beat", R.drawable.davidguetta));
//        songDetails.add(new SongDetail("Don't Phunk With My Heart", "The Black Eyed Peas", "Monkey Business", R.drawable.blackeyedpeas));
//        songDetails.add(new SongDetail("Let It Roll", "Flo Rida", "Wild Ones", R.drawable.florida));
//        songDetails.add(new SongDetail("Uprising", "Muse", "The Resistance", R.drawable.muse));
//        songDetails.add(new SongDetail("Dani California", "Red Hot Chili Peppers", "Stadium Arcadium", R.drawable.redhot));
