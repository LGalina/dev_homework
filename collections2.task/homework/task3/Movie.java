package com.collections.homework.task3;

import java.util.Comparator;
import java.util.Objects;

public class Movie implements Comparator<Movie> {
    private static int id;
    private static Date date;
    private static String genre;
    private static int rating;

    public Movie() {
    }

    public Movie(int id, Date date,  String genre, int rating) {
        this.id = id;
        this.date = date;
        this.genre = genre;
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof com.collections.homework.task3old.Movie movie)) return false;
        return getId() == movie.getId() && getRating() == movie.getRating() && Objects.equals(getDate(), movie.getDate()) && Objects.equals(getGenre(), movie.getGenre());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getDate(), getGenre(), getRating());
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", date=" + date +
                ", genre='" + genre + '\'' +
                ", rating=" + rating +
                '}';
    }


    @Override
    public int compare(Movie o1, Movie o2) {
        return o2.getRating() - o1.getRating();
    }

}
