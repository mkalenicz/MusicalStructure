package com.kalenicz.maciej.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class NowPlayActivity extends AppCompatActivity {
    boolean isPlaying = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_play);

        Intent intent = getIntent();
        final String songName = intent.getStringExtra("song_name");
        String artistName = intent.getStringExtra("artist_name");
        int albumImage = intent.getIntExtra("album_image", R.drawable.nirvana);

        ImageView albumImageImageView = findViewById(R.id.now_play_image_album);
        albumImageImageView.setImageResource(albumImage);

        TextView songNameTextView = findViewById(R.id.now_play_song_name);
        songNameTextView.setText(songName);

        TextView artistNameTextView = findViewById(R.id.now_play_artist_name);
        artistNameTextView.setText(artistName);

        ImageView playbutton = findViewById(R.id.play_pause_button);
        playbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isPlaying){
                    ImageView pausebutton = findViewById(R.id.play_pause_button);
                    pausebutton.setImageResource(R.drawable.icons8pause);
                    Toast toast = Toast.makeText(getApplicationContext(), "Now you are listening song: " + songName, Toast.LENGTH_SHORT);
                    toast.show();
                } else {
                    ImageView playbutton = findViewById(R.id.play_pause_button);
                    playbutton.setImageResource(R.drawable.icons8play);
                }
                isPlaying = !isPlaying;
            }
        });

        ImageView nextButton = findViewById(R.id.next_button);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Toast toast =  Toast.makeText(getApplicationContext(), "Next song", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        ImageView reverseButton = findViewById(R.id.reverse_button);
        reverseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast =  Toast.makeText(getApplicationContext(), "Previous song", Toast.LENGTH_SHORT);
                toast.show();
            }
        });
    }
}
