package com.gmail.radzkovevgeni.repository.impl;

import com.gmail.radzkovevgeni.model.Track;
import com.gmail.radzkovevgeni.repository.TrackRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class TrackRepositoryImpl implements TrackRepository {

    private static final Integer MIN_LENGTH = 15;
    private static final Integer MAX_LENGTH = 300;

    private static final String[] RANDOM_NAME = {"MadisonNick", "Jack", "Joe", "Liza", "Kate", "Eva", "Emily",
            "Hannah", "Kaitlyn", "Sarah", "Madison", "Michael", "James", "MatthewDaniel", "Nicholas", "Christopher",
            "Brianna", "Kaylee", "Hailey", "Alexis", "Elizabeth", "Joseph", "Zachary", "Joshua", "Andrew", "William",
            "Taylor", "Lauren", "Ashley", "Katherine", "Jessica", "Daniel", "Christian", "Tyler", "Ryan", "Anthony",
            "Anna", "Samantha", "Alissa", "Kayla", "Madeline", "Alexander", "Jonathan", "David", "Dylan", "Jacob"};

    private final Random random = new Random();

    @Override
    public List<Track> createTracks(Integer numbers) {

        List<Track> tracks = new ArrayList<>();
        for (int i = 0; i < numbers; i++) {
            String name = getRandomName();
            Integer length = getRandomLength();
            Track track = new Track(name, length);
            tracks.add(track);
        }
        List<Track> collectTracks = tracks.stream()
                .filter(t -> t.getLength() >= 60)
                .collect(Collectors.toList());
        return collectTracks;
    }

    private String getRandomName() {
        int name = random.nextInt(RANDOM_NAME.length);
        return RANDOM_NAME[name];
    }

    private Integer getRandomLength() {
        int differanceLength = MAX_LENGTH - MIN_LENGTH + 1;
        return random.nextInt(differanceLength) + MIN_LENGTH;
    }
}
