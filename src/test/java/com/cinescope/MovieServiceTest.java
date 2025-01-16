package com.cinescope;

import com.cinescope.model.Movie;
import com.cinescope.repository.MovieRepository;
import com.cinescope.service.MovieService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

class MovieServiceTest {

    @Mock
    private MovieRepository movieRepository;

    @InjectMocks
    private MovieService movieService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGetMovieById() {
        Movie movie = new Movie("Inception", "Sci-Fi", "A mind-bending thriller.");
        movie.setId(1L);

        when(movieRepository.findById(1L)).thenReturn(Optional.of(movie));

        Optional<Movie> foundMovie = movieService.getMovieById(1L);

        assertTrue(foundMovie.isPresent());
        assertEquals("Inception", foundMovie.get().getTitle());
        verify(movieRepository, times(1)).findById(1L);
    }

    @Test
    void testGetAllMovies() {
        when(movieRepository.findAll()).thenReturn(List.of(
                new Movie("Inception", "Sci-Fi", "A mind-bending thriller."),
                new Movie("The Dark Knight", "Action", "A gritty and intense tale.")
        ));

        List<Movie> movies = movieService.getAllMovies();

        assertEquals(2, movies.size());
        verify(movieRepository, times(1)).findAll();
    }
}
