package com.collection.homework.task1;

import java.util.Comparator;


public class ChatComparatorByTitle implements Comparator<Chat> {
    @Override
    public int compare(Chat o1, Chat o2) {
        return String.CASE_INSENSITIVE_ORDER.compare(o1.getTitle(), o2.getTitle());
    }
}
