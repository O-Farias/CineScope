package com.cinescope.service;

import com.cinescope.model.Rating;
import com.cinescope.repository.RatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RatingService {

    @Autowired
    private RatingRepository ratingRepository;

    // Adiciona uma nova avaliação
    public Rating addRating(Rating rating) {
        return ratingRepository.save(rating);
    }

    // Retorna uma avaliação pelo ID
    public Optional<Rating> getRatingById(Long id) {
        return ratingRepository.findById(id);
    }

    // Retorna todas as avaliações
    public List<Rating> getAllRatings() {
        return ratingRepository.findAll();
    }
}
