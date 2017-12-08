package com.kalenicz.maciej.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class NowPlayActivity extends AppCompatActivity {
private static final String TAG = "NowPlayActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_play);
        Log.v(TAG, "NowPlayActivity works");

        Intent intent = getIntent();
        String songName = intent.getStringExtra("song_name");
//        String albumName = intent.getStringExtra("album_name");
        String artistName = intent.getStringExtra("artist_name");
        int albumImage = intent.getIntExtra("album_image", R.drawable.nirvana);

        ImageView albumImageImageView = findViewById(R.id.now_play_image_album);
        albumImageImageView.setImageResource(albumImage);

        TextView songNameTextView = findViewById(R.id.now_play_song_name);
        songNameTextView.setText(songName);

        TextView artistNameTextView = findViewById(R.id.now_play_artist_name);
        artistNameTextView.setText(artistName);
    }
}
