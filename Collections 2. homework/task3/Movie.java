package com.collections.homework.task3;

import java.util.Objects;

public class Movie{
    private static int id;
    private static String title;
    private static Date date;
    private static String genre;
    private static int rating;

    public Movie() {

    }

    public Movie(int id,String title, Date date,  String genre, int rating) {
        this.id = id;
        this.date = date;
        this.title = title;
        this.genre = genre;
        this.rating = rating;
    }

    public static int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public static String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public static int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public static String getTitle() {
        return title;
    }

    public static void setTitle(String title) {
        Movie.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Movie movie)) return false;
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
}
