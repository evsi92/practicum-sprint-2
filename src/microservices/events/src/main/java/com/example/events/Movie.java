package com.example.events;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Movie {

    @JsonProperty("movie_id")
    Integer movieId;
    @JsonProperty("title")
    String title;
    @JsonProperty("action")
    String action;
    @JsonProperty("user_id")
    Integer userId;

    public Integer getMovieId() {
        return movieId;
    }

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieId=" + movieId +
                ", title='" + title + '\'' +
                ", action='" + action + '\'' +
                ", userId=" + userId +
                '}';
    }
}
