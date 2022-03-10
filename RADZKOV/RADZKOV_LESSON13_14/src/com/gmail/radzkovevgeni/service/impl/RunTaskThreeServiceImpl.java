package com.gmail.radzkovevgeni.service.impl;

import com.gmail.radzkovevgeni.model.Album;
import com.gmail.radzkovevgeni.repository.AlbumRepository;
import com.gmail.radzkovevgeni.repository.impl.AlbumRepositoryImpl;
import com.gmail.radzkovevgeni.service.RunTaskThreeService;

import java.util.ArrayList;
import java.util.List;

public class RunTaskThreeServiceImpl implements RunTaskThreeService {
    private static final Integer ALBUMS_NUMBER = 10;
    private static final Integer NUMBERS_OF_TRACKS = 20;

    private final AlbumRepository albumRepository = new AlbumRepositoryImpl();

    @Override
    public void runTaskThree() {
        System.out.println('\n' + "_________Task Three_________");
        System.out.println('\n' + "albums with track length over 60 seconds");

        List<Album> albums = new ArrayList<>();
        for (int i = 0; i < ALBUMS_NUMBER; i++) {
            Album albumNew = albumRepository.create(NUMBERS_OF_TRACKS);
            albums.add(albumNew);
        }
        albums.forEach(System.out::println);

    }
}
