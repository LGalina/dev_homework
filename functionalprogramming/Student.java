package com.functionalprograming;

import java.util.List;
import java.util.Objects;

public class Student {
    private String firstName;
    private String lastName;
    private int numberCourses;
    private List<Integer> grades;

    public Student() {
    }

    public Student(String firstName, String lastName, int numberCourses, List<Integer> grades) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.numberCourses = numberCourses;
        this.grades = grades;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getNumberCourses() {
        return numberCourses;
    }

    public void setNumberCourses(int numberCourses) {
        this.numberCourses = numberCourses;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public void setGrades(List<Integer> grades) {
        this.grades = grades;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return getNumberCourses() == student.getNumberCourses() && Objects.equals(getFirstName(), student.getFirstName()) && Objects.equals(getLastName(), student.getLastName()) && Objects.equals(getGrades(), student.getGrades());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName(), getNumberCourses(), getGrades());
    }

    @Override
    public String toString() {
        return "\nStudent{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", numberCourses=" + numberCourses +
                ", grades=" + grades +
                '}';
    }
    public String getFullName(){
        return firstName + " " + lastName;
    }
}
