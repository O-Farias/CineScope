package com.cinescope;

import com.cinescope.model.Rating;
import com.cinescope.repository.RatingRepository;
import com.cinescope.service.RatingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class RatingServiceTest {

    @InjectMocks
    private RatingService ratingService;

    @Mock
    private RatingRepository ratingRepository;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testAddRating() {
        Rating rating = new Rating(9, "Excellent movie"); 
        when(ratingRepository.save(rating)).thenReturn(rating);

        Rating savedRating = ratingService.addRating(rating);

        assertEquals(9, savedRating.getScore());
        assertEquals("Excellent movie", savedRating.getComment());
        verify(ratingRepository, times(1)).save(rating);
    }

    @Test
    void testGetRatingById() {
        Rating rating = new Rating(8, "Great movie"); 
        rating.setId(1L);
        when(ratingRepository.findById(1L)).thenReturn(Optional.of(rating));

        Optional<Rating> foundRating = ratingService.getRatingById(1L);

        assertEquals(true, foundRating.isPresent());
        assertEquals(8, foundRating.get().getScore());
        assertEquals("Great movie", foundRating.get().getComment());
        verify(ratingRepository, times(1)).findById(1L);
    }

    @Test
    void testGetAllRatings() {
        Rating rating1 = new Rating(10, "Amazing!"); 
        rating1.setId(1L);
        Rating rating2 = new Rating(7, "Good movie"); 
        rating2.setId(2L);

        when(ratingRepository.findAll()).thenReturn(Arrays.asList(rating1, rating2));

        List<Rating> ratings = ratingService.getAllRatings();

        assertEquals(2, ratings.size());
        assertEquals(10, ratings.get(0).getScore());
        assertEquals("Amazing!", ratings.get(0).getComment());
        assertEquals(7, ratings.get(1).getScore());
        assertEquals("Good movie", ratings.get(1).getComment());
        verify(ratingRepository, times(1)).findAll();
    }
}
