package com.kalenicz.maciej.musicalstructure;

/**
 * Created by maciej on 07.12.2017.
 */

public class AlbumDetail {
    private String songName;
    private String ArtistName;
    private String AlbumName;

    public AlbumDetail(String songName, String artistName, String albumName) {
        this.songName = songName;
        this.ArtistName = artistName;
        this.AlbumName = albumName;
    }

    public String getSongName() {
        return songName;
    }

    public String getArtistName() {
        return ArtistName;
    }

    public String getAlbumName() {
        return AlbumName;
    }
}

