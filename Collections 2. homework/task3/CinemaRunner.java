package com.collections.homework.task3;

import java.util.*;

public class CinemaRunner{

    public void addMovie(Integer year, String title) {
        Cinema.setMovieList(Cinema.getMovieList().put(year, title));
    }

    public List receiveMovieByYear(int year) {
        List<Integer> yearList = new ArrayList<>();
        for (Map.Entry<Integer, String> entry : Cinema.getMovieList().entrySet()) {
            if (Movie.getDate().getYear() == year)
                yearList.add(Movie.getDate().getYear(), Cinema.getMovieList().lastKey());
        }
        return yearList;
    }


    public List receiveMovieByDate(Date date) {
        List<TreeMap> dateList = new ArrayList<>();
        for (Map.Entry<Integer, String> entry : Cinema.getMovieList().entrySet()) {
            if (Movie.getDate().equals(date)) {
                dateList.add((TreeMap) Cinema.getMovieList().entrySet());
            }
        }
        return dateList;
    }


    public List receiveMovieByGenre(String genre) {
        List<TreeMap> genreList = new ArrayList<>();
        for (Map.Entry<Integer, String> entry : Cinema.getMovieList().entrySet()) {
            if (Movie.getGenre().equals(genre)) {
                genreList.add((TreeMap) Cinema.getMovieList().entrySet());
            }
        }
        return genreList;
    }

    public TreeMap receiveTopDescendentMovie(TreeMap<Integer, String> treaMap) {
        TreeMap<Integer, String> reversTreeMap = new TreeMap<>(Collections.reverseOrder());
        Iterator<Map.Entry<Integer, String> > iterator = treaMap.entrySet().iterator();

        Map.Entry<Integer, String> entry = null;
        int count = 0;
        while (iterator.hasNext() && count <= 10) {
            entry = iterator.next();
            count++;
            reversTreeMap.put(entry.getKey(), entry.getValue());
        }

        return (TreeMap) reversTreeMap;

    }
}
