package com.kalenicz.maciej.musicalstructure;

/**
 * Created by maciej on 07.12.2017.
 */

public class AlbumDetails {
    private String songName;
    private String ArtistName;
    private String AlbumName;
    private int imageAlbumResource;

    public AlbumDetails(String songName, String artistName, String albumName, int imageAlbumResource) {
        this.songName = songName;
        this.ArtistName = artistName;
        this.AlbumName = albumName;
        this.imageAlbumResource = imageAlbumResource;
    }

    public AlbumDetails(String artistName, String albumName, int imageAlbumResource) {
        this.ArtistName = artistName;
        this.AlbumName = albumName;
        this.imageAlbumResource = imageAlbumResource;
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

    public int getImageAlbumResource() {
        return imageAlbumResource;
    }
}

