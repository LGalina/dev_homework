package com.collection.homework.task1;

import java.util.Comparator;

public class ChatComparatorByNumbers implements Comparator<Chat> {
    @Override
    public int compare(Chat o1, Chat o2) {
        return o2.getNumberOfUsers() - o1.getNumberOfUsers();
    }
}
