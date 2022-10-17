package com.collection.homework.task2;

import java.util.Objects;

public class Chat{
    private String title;
    private User user;

    public Chat() {
    }

    public Chat(String title, User user) {
        this.title = title;
        this.user = user;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Chat chat)) return false;
        return Objects.equals(getTitle(), chat.getTitle()) && Objects.equals(getUser(), chat.getUser());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitle(), getUser());
    }

    @Override
    public String toString() {
        return "Chat{" +
                "title='" + title + '\'' +
                ", user=" + user +
                '}';
    }
}
