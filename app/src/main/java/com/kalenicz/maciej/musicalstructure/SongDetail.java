package com.kalenicz.maciej.musicalstructure;

/**
 * Created by maciej on 06.12.2017.
 */

public class SongDetail {
    private String mArtistName;
    private String mAlbumName;
    private int mAlbumImage;

    public SongDetail(String mArtistName, String mAlbumName, int mAlbumImage) {
        this.mArtistName = mArtistName;
        this.mAlbumName = mAlbumName;
        this.mAlbumImage = mAlbumImage;
    }

    public String getArtistName() {
        return mArtistName;
    }

    public String getAlbumName() {
        return mAlbumName;
    }

    public int getAlbumImage() {
        return mAlbumImage;
    }
}

