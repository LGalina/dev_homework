package com.oop.homework.task.home;

import java.util.Arrays;

public class Apartment {

    private Room[] rooms = new Room[5];
    private int number;

    public Apartment() {
    }

    public Apartment(Room[] rooms, int number) {
        for (int i = 0; i < rooms.length; i++) {
            this.rooms[i] = rooms[i];
        }
        this.number = number;
    }

    public Room[] getRoom() {
        for (int i = 0; i < this.number; i++) {
          System.out.println(rooms[i].print());
        }
        return rooms;
    }

    public void setRooms(Room room) {
        this.rooms[number] = room;
        number++;

    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String print(){
        return " apartment:  " + number +  " room: " + Arrays.toString(getRoom());

    }
}

