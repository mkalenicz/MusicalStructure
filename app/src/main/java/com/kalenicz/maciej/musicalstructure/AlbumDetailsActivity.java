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
    public ArrayList<AlbumDetail> albumAmericanIdiot;
    private ArrayList<AlbumDetail> albumXandY;
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album_details);

        albumAmericanIdiot = new ArrayList<>();
        albumAmericanIdiot.add(new AlbumDetail("1. American Idiot","Green Day","American Idiot", R.drawable.greenday));
        albumAmericanIdiot.add(new AlbumDetail("2. Jesus of Suburbia","Green Day","American Idiot", R.drawable.greenday));
        albumAmericanIdiot.add(new AlbumDetail("3. Holiday","Green Day","American Idiot", R.drawable.greenday));
        albumAmericanIdiot.add(new AlbumDetail("4. Are We The Waiting","Green Day","American Idiot", R.drawable.greenday));
        albumAmericanIdiot.add(new AlbumDetail("5. Give Me Novocaine","Green Day","American Idiot", R.drawable.greenday));
        albumAmericanIdiot.add(new AlbumDetail("6. Extraordinary Girl","Green Day","American Idiot", R.drawable.greenday));
        albumAmericanIdiot.add(new AlbumDetail("7. Wake Me Up When September Ends","Green Day","American Idiot", R.drawable.greenday));
        albumAmericanIdiot.add(new AlbumDetail("8. Homecoming","Green Day","American Idiot", R.drawable.greenday));

        albumXandY = new ArrayList<>();
        albumXandY.add(new AlbumDetail("1. Square One","Coldplay","X & Y", R.drawable.xycover));
        albumXandY.add(new AlbumDetail("2. Twisted Logic","Coldplay","X & Y", R.drawable.xycover));
        albumXandY.add(new AlbumDetail("3. Shallowed in the Sea","Coldplay","X & Y", R.drawable.xycover));
        albumXandY.add(new AlbumDetail("4. The Hardest Part","Coldplay","X & Y", R.drawable.xycover));
        albumXandY.add(new AlbumDetail("5. Low","Coldplay","X & Y", R.drawable.xycover));
        albumXandY.add(new AlbumDetail("6. A Message","Coldplay","X & Y", R.drawable.xycover));
        albumXandY.add(new AlbumDetail("7. Speed of Sound","Coldplay","X & Y", R.drawable.xycover));
        albumXandY.add(new AlbumDetail("8. X & Y","Coldplay","X & Y", R.drawable.xycover));

        Intent intent = getIntent();
        String albumName = intent.getStringExtra("album_name");
        String artistName = intent.getStringExtra("artist_name");
        int albumImage = intent.getIntExtra("album_image", R.drawable.nirvana);

        ListView listView = findViewById(R.id.album_detail_songs);


        if(albumName.equals("American Idiot")){
            AlbumDetailsAdapter albumDetailsAdapter = new AlbumDetailsAdapter(this, albumAmericanIdiot);
            listView.setAdapter(albumDetailsAdapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                    Intent intent = new Intent(AlbumDetailsActivity.this, NowPlayActivity.class);

                    AlbumDetail currentSong = albumAmericanIdiot.get(position);

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

        if(albumName.equals("X & Y")){
            AlbumDetailsAdapter albumDetailsAdapter = new AlbumDetailsAdapter(this, albumXandY);
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
