package com.cinescope.model;

import jakarta.persistence.*;

@Entity
public class Rating {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "movie_id", nullable = false)
    private Movie movie;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    private int score; // Nota de 0 a 10

    @Column(length = 500)
    private String comment;

    // Construtor padrão
    public Rating() {}

    // Construtor principal para testes e uso geral
    public Rating(Movie movie, User user, int score, String comment) {
        this.movie = movie;
        this.user = user;
        this.score = score;
        this.comment = comment;
    }

    // Construtor adicional para simplificar os testes 
    public Rating(int score, String comment) {
        this.score = score;
        this.comment = comment;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
