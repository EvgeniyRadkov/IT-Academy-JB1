package com.gmail.radzkovevgeni.model;


import java.util.List;

public class Album {
    private String albumName;
    private List<Track> trackList;

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public List<Track> getTrackList() {
        return trackList;
    }

    public void setTrackList(List<Track> trackList) {
        this.trackList = trackList;
    }

    @Override
    public String toString() {
        return "Album{" +
                "albumName='" + albumName + '\'' +
                ", trackList=" + trackList +
                '}';
    }
}
