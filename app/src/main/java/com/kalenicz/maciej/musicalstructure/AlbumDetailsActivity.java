package com.kalenicz.maciej.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class AlbumDetailsActivity extends AppCompatActivity {
    private ArrayList<AlbumDetail> albumAmericanIdiot;
    private ArrayList<AlbumDetail> albumXandY;
    private ArrayList<AlbumDetail> albumNevermind;
    private ArrayList<AlbumDetail> albumNothingButTheBeat;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album_details);

        albumAmericanIdiot = new ArrayList<>();
        albumAmericanIdiot.add(new AlbumDetail("1. American Idiot", "Green Day", "American Idiot", R.drawable.greenday));
        albumAmericanIdiot.add(new AlbumDetail("2. Jesus of Suburbia", "Green Day", "American Idiot", R.drawable.greenday));
        albumAmericanIdiot.add(new AlbumDetail("3. Holiday", "Green Day", "American Idiot", R.drawable.greenday));
        albumAmericanIdiot.add(new AlbumDetail("4. Are We The Waiting", "Green Day", "American Idiot", R.drawable.greenday));
        albumAmericanIdiot.add(new AlbumDetail("5. Give Me Novocaine", "Green Day", "American Idiot", R.drawable.greenday));
        albumAmericanIdiot.add(new AlbumDetail("6. Extraordinary Girl", "Green Day", "American Idiot", R.drawable.greenday));
        albumAmericanIdiot.add(new AlbumDetail("7. Wake Me Up When September Ends", "Green Day", "American Idiot", R.drawable.greenday));
        albumAmericanIdiot.add(new AlbumDetail("8. Homecoming", "Green Day", "American Idiot", R.drawable.greenday));

        albumXandY = new ArrayList<>();
        albumXandY.add(new AlbumDetail("1. Square One", "Coldplay", "X & Y", R.drawable.xycover));
        albumXandY.add(new AlbumDetail("2. Twisted Logic", "Coldplay", "X & Y", R.drawable.xycover));
        albumXandY.add(new AlbumDetail("3. Shallowed in the Sea", "Coldplay", "X & Y", R.drawable.xycover));
        albumXandY.add(new AlbumDetail("4. The Hardest Part", "Coldplay", "X & Y", R.drawable.xycover));
        albumXandY.add(new AlbumDetail("5. Low", "Coldplay", "X & Y", R.drawable.xycover));
        albumXandY.add(new AlbumDetail("6. A Message", "Coldplay", "X & Y", R.drawable.xycover));
        albumXandY.add(new AlbumDetail("7. Speed of Sound", "Coldplay", "X & Y", R.drawable.xycover));
        albumXandY.add(new AlbumDetail("8. X & Y", "Coldplay", "X & Y", R.drawable.xycover));

        albumNevermind = new ArrayList<>();
        albumNevermind.add(new AlbumDetail("1. Smells Like Teen Spirit", "Nirvana", "Nevermind", R.drawable.nirvana));
        albumNevermind.add(new AlbumDetail("2. In Bloom", "Nirvana", "Nevermind", R.drawable.nirvana));
        albumNevermind.add(new AlbumDetail("3. Come As You Are", "Nirvana", "Nevermind", R.drawable.nirvana));
        albumNevermind.add(new AlbumDetail("4. Breed", "Nirvana", "Nevermind", R.drawable.nirvana));
        albumNevermind.add(new AlbumDetail("5. Lithium", "Nirvana", "Nevermind", R.drawable.nirvana));
        albumNevermind.add(new AlbumDetail("6. Polly", "Nirvana", "Nevermind", R.drawable.nirvana));
        albumNevermind.add(new AlbumDetail("7. Territorial Pissings", "Nirvana", "Nevermind", R.drawable.nirvana));
        albumNevermind.add(new AlbumDetail("8. Drain You", "Nirvana", "Nevermind", R.drawable.nirvana));

        albumNothingButTheBeat = new ArrayList<>();
        albumNothingButTheBeat.add(new AlbumDetail("1. Where Them Girls At", "David Guetta", "Nothing But The Beat",R.drawable.davidguetta));
        albumNothingButTheBeat.add(new AlbumDetail("2. Little Bad Girl", "David Guetta", "Nothing But The Beat",R.drawable.davidguetta));
        albumNothingButTheBeat.add(new AlbumDetail("3. Turn Me On", "David Guetta", "Nothing But The Beat",R.drawable.davidguetta));
        albumNothingButTheBeat.add(new AlbumDetail("4. Sweat", "David Guetta", "Nothing But The Beat",R.drawable.davidguetta));
        albumNothingButTheBeat.add(new AlbumDetail("5. Without You", "David Guetta", "Nothing But The Beat",R.drawable.davidguetta));
        albumNothingButTheBeat.add(new AlbumDetail("6. Nothing Really Matters", "David Guetta", "Nothing But The Beat",R.drawable.davidguetta));
        albumNothingButTheBeat.add(new AlbumDetail("7. I Can Only Imagine", "David Guetta", "Nothing But The Beat",R.drawable.davidguetta));
        albumNothingButTheBeat.add(new AlbumDetail("8. Crank It Up", "David Guetta", "Nothing But The Beat",R.drawable.davidguetta));

        Intent intent = getIntent();
        String albumName = intent.getStringExtra("album_name");
        String artistName = intent.getStringExtra("artist_name");
        int albumImage = intent.getIntExtra("album_image", R.drawable.nirvana);

        ListView listView = findViewById(R.id.album_detail_songs);


        if (albumName.equals("American Idiot")) {
            final ArrayList<AlbumDetail> currentAlbum = albumAmericanIdiot;
            AlbumDetailsAdapter albumDetailsAdapter = new AlbumDetailsAdapter(this, albumAmericanIdiot);
            listView.setAdapter(albumDetailsAdapter);
            showNowPlaySong(listView, currentAlbum);
        }

        if (albumName.equals("X & Y")) {
            final ArrayList<AlbumDetail> currentAlbum = albumXandY;
            AlbumDetailsAdapter albumDetailsAdapter = new AlbumDetailsAdapter(this, albumXandY);
            listView.setAdapter(albumDetailsAdapter);
            showNowPlaySong(listView, currentAlbum);

        }

        if (albumName.equals("Nevermind")) {
            final ArrayList<AlbumDetail> currentAlbum = albumNevermind;
            AlbumDetailsAdapter albumDetailsAdapter = new AlbumDetailsAdapter(this, albumNevermind);
            listView.setAdapter(albumDetailsAdapter);
            showNowPlaySong(listView, currentAlbum);
        }

        if (albumName.equals("Nothing But The Beat")) {
            final ArrayList<AlbumDetail> currentAlbum = albumNothingButTheBeat;
            AlbumDetailsAdapter albumDetailsAdapter = new AlbumDetailsAdapter(this, albumNothingButTheBeat);
            listView.setAdapter(albumDetailsAdapter);
            showNowPlaySong(listView, currentAlbum);
        }

        ImageView albumImageImageView = findViewById(R.id.album_detail_image);
        albumImageImageView.setImageResource(albumImage);

        TextView albumNameTextView = findViewById(R.id.album_detail_album);
        albumNameTextView.setText(albumName);

        TextView artistNameTextView = findViewById(R.id.album_detail_artist);
        artistNameTextView.setText(artistName);
    }

    private void showNowPlaySong (ListView listView, final ArrayList<AlbumDetail> currentAlbum) {
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Intent intent = new Intent(AlbumDetailsActivity.this, NowPlayActivity.class);

                AlbumDetail currentSong = currentAlbum.get(position);

                Bundle bundle = new Bundle();
                bundle.putString("song_name", currentSong.getSongName());
                bundle.putString("artist_name", currentSong.getArtistName());
                bundle.putInt("album_image", currentSong.getImageAlbumResource());

                intent.putExtras(bundle);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }
}
