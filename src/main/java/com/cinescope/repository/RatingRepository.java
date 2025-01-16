package com.cinescope.repository;

import com.cinescope.model.Rating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RatingRepository extends JpaRepository<Rating, Long> {
    // Método personalizado para buscar avaliações por ID do filme
    List<Rating> findByMovieId(Long movieId);
}
