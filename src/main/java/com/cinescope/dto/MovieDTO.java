package com.cinescope.dto;

public class MovieDTO {

    private String title;
    private String genre;

    // Construtores
    public MovieDTO() {}

    public MovieDTO(String title, String genre) {
        this.title = title;
        this.genre = genre;
    }

    // Getters e Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
