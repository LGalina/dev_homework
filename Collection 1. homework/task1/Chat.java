package com.collection.homework.task1;

import com.collection.homework.task2.User;

import java.util.Objects;

public class Chat implements Comparable<Chat>{
    private String title;
    private int numberOfUsers;

    public Chat(String strings, User numberOfUsers) {
    }

    public Chat(String title, int numberOfUsers) {
        this.title = title;
        this.numberOfUsers = numberOfUsers;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public void setNumberOfUsers(int numberOfUsers) {
        this.numberOfUsers = numberOfUsers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Chat chat)) return false;
        return Objects.equals(getTitle(), chat.getTitle());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitle(), getNumberOfUsers());
    }

    @Override
    public String toString() {
        return "Chat{" +
                "title='" + title + '\'' +
                ", numberOfUsers=" + numberOfUsers +
                '}';
    }

    @Override
    public int compareTo(Chat o) {
        return String.CASE_INSENSITIVE_ORDER.compare(this.title, o.getTitle());
    }
}
