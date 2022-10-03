package com.oop.homework.task.home;

import java.util.Arrays;

public class Floor {

    private Apartment[] apartments = new Apartment[10];
    private int number;

    public Floor() {
    }

    public Floor(Apartment[] apartments, int number) {
        for (int i = 0; i < apartments.length; i++) {
            this.apartments[i] = apartments[i];
        }
        this.number = number;
    }

    public Apartment[] getApartments() {
        for (int i = 0; i < this.number; i++) {
          System.out.println(apartments[i].print());
        }
       return apartments;
    }

    public void setApartments(Apartment apartment){
         this.apartments[number] = apartment;
        this.number++;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }


    public String print(){
        return " floor: " + number +  " apartment: " + Arrays.toString(getApartments());

    }

}
