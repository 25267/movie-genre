package com.example.genre.service;

import com.example.genre.model.Genre;
import com.example.genre.repository.MovieGenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MovieGenreService {

    @Autowired
    private MovieGenreRepository repository;

    public Optional<Genre> getGenre(Long movieId) {
        return  repository.findById(movieId);
    }
}
