package com.cinescope.repository;

import com.cinescope.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {
    // Método personalizado para buscar filmes por gênero
    List<Movie> findByGenre(String genre);
}
