package com.oop.homework.task.home;

public class Room {
    private boolean cold;

    public Room() {
    }
    public Room(boolean cold) {
        this.cold = cold;
    }

    public boolean isCold() {
        return cold;
    }

    public void setCold(boolean cold) {
        this.cold = cold;
    }

    public String print(){
        return " room is cold - " + cold;
    }


}
