package com.collections.homework.task3;

import java.util.LinkedHashSet;
import java.util.TreeMap;

public class CinemaRunner {
    public static void main(String[] args) {
        TreeMap<Integer, LinkedHashSet<Movie>> listMovie = new TreeMap<>();
        listMovie.put(2020, new LinkedHashSet<>());

        Cinema listCinema = new Cinema(listMovie);
        listCinema.addMovie(new Movie(1, new Date(2, 2020), "dram", 7));
        listCinema.addMovie(new Movie(2, new Date(3, 2021), "comedy", 1));
        listCinema.addMovie(new Movie(3, new Date(2, 2021), "comedy", 2));
        listCinema.addMovie(new Movie(4, new Date(5, 2017), "action", 18));
        listCinema.addMovie(new Movie(5, new Date(9, 2020), "action", 3));
        System.out.println(listCinema);

        listCinema.receiveMovieByDate(2,2021);
        listCinema.receiveMovieByYear(2021);
        listCinema.receiveMovieByGenre("comedy");

        System.out.println(listCinema.receiveTopDescendentMovie(listMovie));



    }
}
