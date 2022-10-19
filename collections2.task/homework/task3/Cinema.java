package com.collections.homework.task3;

import java.util.*;

public class Cinema {
   private final TreeMap<Integer, LinkedHashSet<Movie>> cinema;

    public Cinema(TreeMap<Integer, LinkedHashSet<Movie>> cinema) {
        this.cinema = cinema;
    }


    public TreeMap<Integer, LinkedHashSet<Movie>> getCinema() {
        return cinema;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cinema cinema1)) return false;
        return Objects.equals(cinema, cinema1.cinema);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cinema);
    }
    @Override
    public String toString() {
        return "Cinema{" +
                "cinema=" + cinema +
                '}';
    }

    public void addMovie(Movie movie) {
        cinema.putIfAbsent(movie.getDate().getYear(), new LinkedHashSet<>());
       cinema.get(movie.getDate().getYear()).add(movie);
    }
    public void receiveMovieByYear(int year) {
        for (Map.Entry<Integer, LinkedHashSet<Movie>> entry : cinema.entrySet()) {
            if (entry.getKey() == year) {
                System.out.println("movies by year" + entry.getKey() + " " + entry.getValue());
            }
        }
    }

    public void receiveMovieByDate(int month, int year) {
        for (Map.Entry<Integer, LinkedHashSet<Movie>> entry : cinema.entrySet()) {
            if (entry.getKey() == year) {
                for (Movie value : entry.getValue()) {
                    if (month == value.getDate().getMonth()){
                        System.out.println("\nmovies by date" + entry.getKey() + " " + entry.getValue());
                    }
                }
            }
        }
    }

    public void receiveMovieByGenre(String genre) {

       for (Map.Entry<Integer, LinkedHashSet<Movie>> entry : cinema.entrySet()) {
           for (Movie value : entry.getValue()) {
               if (entry.getValue().equals(genre)) {
                   System.out.println("movies by genre" + entry.getValue());
               }
           }
        }
    }
    public Set<Movie> receiveTopDescendentMovie(Map<Integer, LinkedHashSet<Movie>> map) {
        Set<Movie> result = new LinkedHashSet<>();
        for (Map.Entry<Integer, LinkedHashSet<Movie>> setEntry : map.entrySet()) {
           result.addAll(setEntry.getValue());
        }
        return result;
    }
}
