package com.multithreading.homework;

import java.util.Queue;

public class CrystalConsumer {
    private int capacity;
    private int counter = 0;
    private Queue<Crystal> crystalQueue;
    private boolean flag;
    public CrystalConsumer() {
    }

    public CrystalConsumer(Queue<Crystal> crystalQueue, int capacity, boolean flag) {
        this.capacity = capacity;
        this.crystalQueue = crystalQueue;
        this.flag = flag;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public Queue<Crystal> getCrystalQueue() {
        return crystalQueue;
    }

    public void setCrystalQueue(Queue<Crystal> crystalQueue) {
        this.crystalQueue = crystalQueue;
    }

    @Override
    public String toString() {
        return "Consumer{" +
                "capacity=" + capacity +
                ", counter=" + counter +
                ", crystalQueue=" + crystalQueue +
                '}';
    }
}
