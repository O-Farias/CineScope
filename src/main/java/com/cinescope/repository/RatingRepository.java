package com.cinescope.repository;

import com.cinescope.model.Rating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RatingRepository extends JpaRepository<Rating, Long> {
    // Método personalizado para buscar avaliações por filme
    List<Rating> findByMovieId(Long movieId);
}
