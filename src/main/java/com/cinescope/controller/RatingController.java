package com.cinescope.controller;

import com.cinescope.model.Rating;
import com.cinescope.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingController {

    @Autowired
    private RatingService ratingService;

    // Endpoint para adicionar uma nova avaliação
    @PostMapping
    public Rating addRating(@RequestBody Rating rating) {
        return ratingService.addRating(rating);
    }

    // Endpoint para buscar avaliações por ID do filme
    @GetMapping("/movie/{movieId}")
    public List<Rating> getRatingsByMovieId(@PathVariable Long movieId) {
        return ratingService.getRatingsByMovieId(movieId);
    }

    // Endpoint para listar todas as avaliações
    @GetMapping
    public List<Rating> getAllRatings() {
        return ratingService.getAllRatings();
    }
}
