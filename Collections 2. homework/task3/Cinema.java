package com.collections.homework.task3;

import java.util.Objects;
import java.util.TreeMap;

public class Cinema{
    private static TreeMap<Integer, String> movieList;

    public Cinema(TreeMap<Integer, String> movieList) {
        this.movieList = movieList;
    }

    public static TreeMap<Integer, String>  getMovieList() {
        return movieList;
    }

    public static void setMovieList(String movieList) {
        this.movieList.put(Movie.getId(),Movie.getTitle());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cinema cinema)) return false;
        return Objects.equals(getMovieList(), cinema.getMovieList());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMovieList());
    }

    @Override
    public String toString() {
        return "Cinema{" +
                "movieList=" + movieList +
                '}';
    }
}
