package com.kalenicz.maciej.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class NowPlayActivity extends AppCompatActivity {
    boolean isPlaying = false;
    int currentIndex = 0;
    int clickIndex = 0;
    ArrayList<AlbumDetails> currentAlbum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        ArrayList<AlbumDetails> albumAmericanIdiot = SongsList.getAmericanIdiot();
        ArrayList<AlbumDetails> albumXandY = SongsList.getAlbumXandY();
        ArrayList<AlbumDetails> albumNevermind = SongsList.getAlbumNevermind();
        ArrayList<AlbumDetails> albumNothingButTheBeat = SongsList.getAlbumNothingButTheBeat();
        ArrayList<AlbumDetails> albumMonkeyBusiness = SongsList.getAlbumMonkeyBusiness();
        ArrayList<AlbumDetails> albumWildOnes = SongsList.getAlbumWildOnes();
        ArrayList<AlbumDetails> albumTheResistance = SongsList.getAlbumTheResistance();
        ArrayList<AlbumDetails> albumStadiumArcadium = SongsList.getAlbumStadiumArcadium();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_play);

        final Intent intent = getIntent();
        final String songName = intent.getStringExtra("song_name");
        final String albumName = intent.getStringExtra("album_name");
        final String artistName = intent.getStringExtra("artist_name");
        final int albumImage = intent.getIntExtra("album_image", R.drawable.nirvana);
        final int songId = intent.getIntExtra("song_id", 0);

        ImageView homeImageView = findViewById(R.id.go_home_now_play);
        homeImageView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent goHomeIntent = new Intent(NowPlayActivity.this, MainActivity.class);
                startActivity(goHomeIntent);
            }
        });

        ImageView albumImageView = findViewById(R.id.go_album_now_play);
        albumImageView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent goAlbumIntent = new Intent(NowPlayActivity.this, AlbumDetailsActivity.class);

                Bundle bundle = new Bundle();
                bundle.putString("album_name", albumName);
                bundle.putString("artist_name", artistName);
                bundle.putInt("album_image", albumImage);
                goAlbumIntent.putExtras(bundle);
                startActivity(goAlbumIntent);
            }
        });

        switch (albumName) {
            case "American Idiot":
                currentAlbum = albumAmericanIdiot;
                break;
            case "X & Y":
                currentAlbum = albumXandY;
                break;
            case "Nevermind":
                currentAlbum = albumNevermind;
                break;
            case "Nothing But The Beat":
                currentAlbum = albumNothingButTheBeat;
                break;
            case "Monkey Business":
                currentAlbum = albumMonkeyBusiness;
                break;
            case "Wild Ones":
                currentAlbum = albumWildOnes;
                break;
            case "The Resistance":
                currentAlbum = albumTheResistance;
                break;
            case "Stadium Arcadium":
                currentAlbum = albumStadiumArcadium;
                break;
        }

        ImageView albumImageImageView = findViewById(R.id.now_play_image_album);
        albumImageImageView.setImageResource(albumImage);

        TextView songNameTextView = findViewById(R.id.now_play_song_name);
        songNameTextView.setText(songName);

        TextView artistNameTextView = findViewById(R.id.now_play_artist_name);
        artistNameTextView.setText(artistName);

        ImageView playButton = findViewById(R.id.play_pause_button);
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isPlaying = !isPlaying;
                if (isPlaying) {
                    ImageView pauseButton = findViewById(R.id.play_pause_button);
                    pauseButton.setImageResource(R.drawable.ic_pause_circle_outline_black_24dp);

                    String currentSongName = currentAlbum.get(currentIndex).getSongName();

                    if (clickIndex == 0) {
                        Toast toast = Toast.makeText(getApplicationContext(), "Now you are listening song: " + songName, Toast.LENGTH_SHORT);
                        toast.show();
                    } else {
                        Toast toast = Toast.makeText(getApplicationContext(), "Now you are listening song: " + currentSongName, Toast.LENGTH_SHORT);
                        toast.show();
                    }

                } else {
                    ImageView playButton = findViewById(R.id.play_pause_button);
                    playButton.setImageResource(R.drawable.ic_play_circle_outline_black_24dp);
                }
            }
        });

        ImageView nextButton = findViewById(R.id.next_button);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (currentIndex == 0 && clickIndex == 0) {
                    currentIndex = songId;
                } else {
                    currentIndex++;
                    clickIndex++;
                }
                if (!(currentIndex < currentAlbum.size())) {
                    currentIndex = 0;
                }
                String songName = currentAlbum.get(currentIndex).getSongName();
                TextView songNameTextView = findViewById(R.id.now_play_song_name);
                songNameTextView.setText(songName);
            }
        });

        ImageView reverseButton = findViewById(R.id.reverse_button);
        reverseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (clickIndex == 0) {
                    currentIndex = songId - 1;
                    currentIndex = currentIndex - 1;
                    clickIndex++;
                } else {
                    currentIndex = currentIndex - 1;
                    clickIndex++;
                }
                if (currentIndex < 0) {
                    currentIndex = 0;
                }
                String songName = currentAlbum.get(currentIndex).getSongName();
                TextView songNameTextView = findViewById(R.id.now_play_song_name);
                songNameTextView.setText(songName);
            }
        });

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
