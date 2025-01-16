package com.cinescope.service;

import com.cinescope.model.Rating;
import com.cinescope.repository.RatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RatingService {

    @Autowired
    private RatingRepository ratingRepository;

    // Adiciona uma nova avaliação
    public Rating addRating(Rating rating) {
        return ratingRepository.save(rating);
    }

    // Busca avaliações por ID do filme
    public List<Rating> getRatingsByMovieId(Long movieId) {
        return ratingRepository.findByMovieId(movieId);
    }

    // Lista todas as avaliações
    public List<Rating> getAllRatings() {
        return ratingRepository.findAll();
    }
}
