package com.gmail.radzkovevgeni.repository.impl;

import com.gmail.radzkovevgeni.model.Album;
import com.gmail.radzkovevgeni.model.Track;
import com.gmail.radzkovevgeni.repository.AlbumRepository;

import java.util.List;
import java.util.Random;

public class AlbumRepositoryImpl implements AlbumRepository {

    private static final String[] ALBUM_NAMES = {"Smith", "Johnson", "Williams", "Brown", "Jones", "Miller", "Davis", "Garcia",
            "Rodriguez", "Wilson", "Martinez", "Anderson", "Taylor", "Thomas", "Hernandez", "Moore", "Martin", "Jackson",
            "Thompson", "White", "Lopez", "Lee", "Gonzalez", "Harris", "Clark", "Lewis", "Robinson", "Walker", "Perez",
            "Hall", "Young", "Allen", "Sanchez", "Wright", "King", "Scott", "Green", "Baker", "Adams", "Nelson"};

    private final Random random = new Random();

    TrackRepositoryImpl trackrepository = new TrackRepositoryImpl();

    @Override
    public Album create(Integer numbersOfTrack) {
        Album album = new Album();
        album.setAlbumName(getRandomName());
        List<Track> tracks = trackrepository.createTracks(numbersOfTrack);
        album.setTrackList(tracks);
        return album;
    }

    private String getRandomName() {
        int randomName = random.nextInt(ALBUM_NAMES.length);
        return ALBUM_NAMES[randomName];
    }
}
