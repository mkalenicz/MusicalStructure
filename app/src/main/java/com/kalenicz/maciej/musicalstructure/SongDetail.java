package com.kalenicz.maciej.musicalstructure;

/**
 * Created by maciej on 06.12.2017.
 */

public class SongDetail {
    private String mSongName;
    private String mArtistName;
    private String mAlbumName;
    private int mAlbumImage;

//
    public SongDetail(String mSongName, String mArtistName, String mAlbumName, int mAlbumImage) {
        this.mSongName = mSongName;
        this.mArtistName = mArtistName;
        this.mAlbumName = mAlbumName;
        this.mAlbumImage = mAlbumImage;
    }

    public String getmSongName() {
        return mSongName;
    }

    public String getmArtistName() {
        return mArtistName;
    }

    public String getmAlbumName() {
        return mAlbumName;
    }

    public int getmAlbumImage() {
        return mAlbumImage;
    }
}

