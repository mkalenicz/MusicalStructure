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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album_details);

        ArrayList<AlbumDetail> albumAmericanIdiot = SongsList.getAmericanIdiot();
        ArrayList<AlbumDetail> albumXandY = SongsList.getAlbumXandY();
        ArrayList<AlbumDetail> albumNevermind = SongsList.getAlbumNevermind();
        ArrayList<AlbumDetail> albumNothingButTheBeat = SongsList.getAlbumNothingButTheBeat();
        ArrayList<AlbumDetail> albumMonkeyBusiness = SongsList.getAlbumMonkeyBusiness();
        ArrayList<AlbumDetail> albumWildOnes = SongsList.getAlbumWildOnes();
        ArrayList<AlbumDetail> albumTheResistance = SongsList.getAlbumTheResistance();
        ArrayList<AlbumDetail> albumStadiumArcadium = SongsList.getAlbumStadiumArcadium();

        Intent intent = getIntent();
        String albumName = intent.getStringExtra("album_name");
        String artistName = intent.getStringExtra("artist_name");
        int albumImage = intent.getIntExtra("album_image", R.drawable.nirvana);

        ListView listView = findViewById(R.id.album_detail_songs);

        switch (albumName) {
            case "American Idiot":
                AlbumDetailsAdapter americanIdiotAdapter = new AlbumDetailsAdapter(this, albumAmericanIdiot);
                listView.setAdapter(americanIdiotAdapter);
                showNowPlaySong(listView, albumAmericanIdiot);
                break;

            case "X & Y":
                AlbumDetailsAdapter albumXandYAdapter = new AlbumDetailsAdapter(this, albumXandY);
                listView.setAdapter(albumXandYAdapter);
                showNowPlaySong(listView, albumXandY);
                break;

            case "Nevermind":
                AlbumDetailsAdapter albumNevermindAdapter = new AlbumDetailsAdapter(this, albumNevermind);
                listView.setAdapter(albumNevermindAdapter);
                showNowPlaySong(listView, albumNevermind);
                break;

            case "Nothing But The Beat":
                AlbumDetailsAdapter nothingButTheBeatAdapter = new AlbumDetailsAdapter(this, albumNothingButTheBeat);
                listView.setAdapter(nothingButTheBeatAdapter);
                showNowPlaySong(listView, albumNothingButTheBeat);
                break;

            case "Monkey Business":
                AlbumDetailsAdapter monkeyBusinessAdapter = new AlbumDetailsAdapter(this, albumMonkeyBusiness);
                listView.setAdapter(monkeyBusinessAdapter);
                showNowPlaySong(listView, albumMonkeyBusiness);
                break;

            case "Wild Ones":
                AlbumDetailsAdapter wildOnesAdapter = new AlbumDetailsAdapter(this, albumWildOnes);
                listView.setAdapter(wildOnesAdapter);
                showNowPlaySong(listView, albumWildOnes);
                break;

            case "The Resistance":
                AlbumDetailsAdapter theResistanceAdapter = new AlbumDetailsAdapter(this, albumTheResistance);
                listView.setAdapter(theResistanceAdapter);
                showNowPlaySong(listView, albumTheResistance);
                break;

            case "Stadium Arcadium":
                AlbumDetailsAdapter stadiumArcadiumAdapter = new AlbumDetailsAdapter(this, albumStadiumArcadium);
                listView.setAdapter(stadiumArcadiumAdapter);
                showNowPlaySong(listView, albumStadiumArcadium);
                break;

        }

        ImageView albumImageImageView = findViewById(R.id.album_detail_image);
        albumImageImageView.setImageResource(albumImage);

        TextView albumNameTextView = findViewById(R.id.album_detail_album);
        albumNameTextView.setText(albumName);

        TextView artistNameTextView = findViewById(R.id.album_detail_artist);
        artistNameTextView.setText(artistName);
    }

    private void showNowPlaySong(ListView listView, final ArrayList<AlbumDetail> currentAlbum) {
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
