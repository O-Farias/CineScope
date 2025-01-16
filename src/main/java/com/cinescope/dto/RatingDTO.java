package com.cinescope.dto;

public class RatingDTO {

    private String movieTitle;
    private String userName;
    private int score;
    private String comment;

    // Construtores
    public RatingDTO() {}

    public RatingDTO(String movieTitle, String userName, int score, String comment) {
        this.movieTitle = movieTitle;
        this.userName = userName;
        this.score = score;
        this.comment = comment;
    }

    // Getters e Setters
    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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
