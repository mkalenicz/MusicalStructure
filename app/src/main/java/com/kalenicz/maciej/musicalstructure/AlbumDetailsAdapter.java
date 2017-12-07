package com.kalenicz.maciej.musicalstructure;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by maciej on 07.12.2017.
 */

public class AlbumDetailsAdapter extends ArrayAdapter<AlbumDetail> {
    private static final String TAG = "AlbumDetailsAdapter";
    public AlbumDetailsAdapter(@NonNull Context context, ArrayList<AlbumDetail> albumDetailArrayList) {
        super(context,0, albumDetailArrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.album_song_list_item, parent, false);
        }
        AlbumDetail currentAlbum = getItem(position);



//Log.v(TAG,"wartosc myValue" +myValue);
//        if(currentAlbum.getAlbumName().equals(AlbumDetail.class.gets)) {
            TextView songAlbum = listItemView.findViewById(R.id.song_item_list);
            songAlbum.setText(currentAlbum.getSongName().toString());
//            songAlbum.setText(currentAlbum.getAlbumName().toString());

        return listItemView;
    }
}
