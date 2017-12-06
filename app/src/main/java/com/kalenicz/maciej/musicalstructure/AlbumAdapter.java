package com.kalenicz.maciej.musicalstructure;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by maciej on 06.12.2017.
 */

public class AlbumAdapter extends ArrayAdapter<SongDetail> {

    public AlbumAdapter(Context context, ArrayList<SongDetail> albumList) {
        super(context, 0, albumList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View gridItemView = convertView;

        if (gridItemView == null) {
            gridItemView = LayoutInflater.from(getContext()).inflate(R.layout.album_grid_item, parent, false);
        }
        SongDetail currentSong = getItem(position);

        ImageView albumImage = gridItemView.findViewById(R.id.album_grid_image);
        albumImage.setImageResource(currentSong.getAlbumImage());

        TextView albumName = gridItemView.findViewById(R.id.album_grid_name);
        albumName.setText(currentSong.getAlbumName().toString());

        TextView artistName = gridItemView.findViewById(R.id.album_grid_artist);
        artistName.setText(currentSong.getArtistName().toString());

        return gridItemView;

    }
}
