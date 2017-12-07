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
    private ArrayList<AlbumDetail> albumDetails;

    public ArrayList<AlbumDetail> getAlbumDetails() {
        return albumDetails;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album_details);

        albumDetails = new ArrayList<>();
        albumDetails.add(new AlbumDetail("1. American Idiot","Green Day","American Idiot"));
        albumDetails.add(new AlbumDetail("2. Jesus of Suburbia","Green Day","American Idiot"));


        ListView listView = findViewById(R.id.album_detail_songs);
        AlbumDetailsAdapter albumDetailsAdapter = new AlbumDetailsAdapter(this, albumDetails);
        listView.setAdapter(albumDetailsAdapter);

        Intent intent = getIntent();
        String albumName = intent.getStringExtra("album_name");
        String artistName = intent.getStringExtra("artist_name");
        int albumImage = intent.getIntExtra("album_image", R.drawable.nirvana);

        ImageView albumImageImageView = findViewById(R.id.album_detail_image);
        albumImageImageView.setImageResource(albumImage);

        TextView albumNameTextView = findViewById(R.id.album_detail_album);
        albumNameTextView.setText(albumName);

        TextView artistNameTextView = findViewById(R.id.album_detail_artist);
        artistNameTextView.setText(artistName);
    }
}
