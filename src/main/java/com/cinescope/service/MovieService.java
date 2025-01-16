package com.cinescope.service;

import com.cinescope.model.Movie;
import com.cinescope.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    // Lista todos os filmes
    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    // Busca filmes por gênero
    public List<Movie> getMoviesByGenre(String genre) {
        return movieRepository.findByGenre(genre);
    }

    // Adiciona um novo filme
    public Movie addMovie(Movie movie) {
        return movieRepository.save(movie);
    }
}
