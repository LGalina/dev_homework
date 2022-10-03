package com.oop.homework.task.home;

import java.util.Arrays;

public class Home {

    private Floor[] floors = new Floor[3];
    private int number;

    public Home() {
    }

    public Home(Floor[] floors, int number) {
        for (int i = 0; i < floors.length; i++) {
            this.floors[i] = floors[i];
        }
        this.number = number;
    }

    public Floor[] getFloors() {
        for (int i = 0; i < this.number; i++) {
           System.out.println(floors[i].print());
        }
        return floors;
    }

   public void setFloors(Floor floor){
       this.floors[number] = floor;
       number++;
   }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String print() {
        return "home:  " +  number + "floors:  " + Arrays.toString(getFloors());
    }
}

