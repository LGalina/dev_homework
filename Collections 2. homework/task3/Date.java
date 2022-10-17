package com.collections.homework.task3;

import java.util.Objects;

public class Date {
    private int month;
    private int year;

    public Date() {
    }

    public Date(int month, int year) {
        this.month = month;
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Date)) return false;
        Date date = (Date) o;
        return getMonth() == date.getMonth() && getYear() == date.getYear();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMonth(), getYear());
    }

    @Override
    public String toString() {
        return "Date{" +
                "month=" + month +
                ", year=" + year +
                '}';
    }
}
