package com.kalenicz.maciej.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class AlbumDetailsActivity extends AppCompatActivity {
    private ArrayList<AlbumDetail> albumAmericanIdiot;
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album_details);

        albumAmericanIdiot = new ArrayList<>();
        albumAmericanIdiot.add(new AlbumDetail("1. American Idiot","Green Day","American Idiot"));
        albumAmericanIdiot.add(new AlbumDetail("2. Jesus of Suburbia","Green Day","American Idiot"));
        albumAmericanIdiot.add(new AlbumDetail("3. Holiday","Green Day","American Idiot"));
        albumAmericanIdiot.add(new AlbumDetail("4. Are We The Waiting","Green Day","American Idiot"));
        albumAmericanIdiot.add(new AlbumDetail("5. Give Me Novocaine","Green Day","American Idiot"));
        albumAmericanIdiot.add(new AlbumDetail("6. Extraordinary Girl","Green Day","American Idiot"));
        albumAmericanIdiot.add(new AlbumDetail("7. Wake Me Up When September Ends","Green Day","American Idiot"));
        albumAmericanIdiot.add(new AlbumDetail("8. Homecoming","Green Day","American Idiot"));



        Intent intent = getIntent();
        String albumName = intent.getStringExtra("album_name");
        String artistName = intent.getStringExtra("artist_name");
        int albumImage = intent.getIntExtra("album_image", R.drawable.nirvana);

        ListView listView = findViewById(R.id.album_detail_songs);


        if(albumName.equals("American Idiot")){
            AlbumDetailsAdapter albumDetailsAdapter = new AlbumDetailsAdapter(this, albumAmericanIdiot);
            listView.setAdapter(albumDetailsAdapter);
        }

        ImageView albumImageImageView = findViewById(R.id.album_detail_image);
        albumImageImageView.setImageResource(albumImage);

        TextView albumNameTextView = findViewById(R.id.album_detail_album);
        albumNameTextView.setText(albumName);

        TextView artistNameTextView = findViewById(R.id.album_detail_artist);
        artistNameTextView.setText(artistName);
    }
}
