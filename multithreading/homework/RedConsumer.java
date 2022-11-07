package com.multithreading.homework;

import java.util.Queue;

public class RedConsumer extends CrystalConsumer implements Runnable {
    private final CrystalColorEnum color = CrystalColorEnum.RED;
    private int i = 0;

    public RedConsumer() {
    }

    public RedConsumer(Queue<Crystal> crystalQueue, int capacity, boolean flag) {
        super(crystalQueue, capacity, flag);
    }

    @Override
    public void run() {
        System.out.println(color + " consumer - start collecting crystals");
        while (isFlag() && getCounter() < getCapacity()) {
            synchronized (getCrystalQueue()) {
                if (!getCrystalQueue().isEmpty()) {
                    Crystal crystal = getCrystalQueue().peek();
                    if (crystal.getColorEnum() == color) {
                        getCrystalQueue().poll();
                        i++;
                        setCounter(i);
                        System.out.println(color + " consumer - found " + i + " crystals");
                    } else {
                        System.out.println(color + " consumer - crystal not found!");
                    }
                }
            }
            if (getCounter() >= getCapacity()) {
                setFlag(false);
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
