package com.gmail.radzkovevgeni.repository;

import com.gmail.radzkovevgeni.model.Track;

import java.util.List;

public interface TrackRepository {
    List<Track> createTracks(Integer numbers);
}
