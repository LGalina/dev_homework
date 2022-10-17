package com.collections.homework.task3;

public class Task3 {
    public static void main(String[] args) {
        new Movie(1,"abc", new Date(2,2020),"dram",7);
        new Movie(2,"qwerty", new Date(3, 2021), "comedy", 2);
        CinemaRunner cinemaRunner = new CinemaRunner();
        cinemaRunner.addMovie(2020, "abc");
        cinemaRunner.addMovie(2021, "qwerty");
        cinemaRunner.receiveMovieByDate(new Date(2,2020));
        System.out.println(cinemaRunner);





    }
}
