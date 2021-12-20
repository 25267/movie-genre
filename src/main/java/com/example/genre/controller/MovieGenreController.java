package com.example.genre.controller;

import com.example.genre.model.Genre;
import com.example.genre.service.MovieGenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/genre")
public class MovieGenreController {

    @Autowired
    private MovieGenreService service;

    @GetMapping("/{movieId}")
    public Optional<Genre> getGenre(@PathVariable("movieId") Long movieId) {

        return  service.getGenre(movieId);
    }
}
