package com.multithreading.homework;

import java.util.Queue;
import java.util.concurrent.ThreadLocalRandom;

public class CrystalProducer implements Runnable {
    private Queue<Crystal> queue;
    private int maxCrystal;
    private int counter = 0;

    public CrystalProducer() {
    }

    public CrystalProducer(Queue<Crystal> queue, int maxCrystal) {
        this.queue = queue;
        this.maxCrystal = maxCrystal;
    }

    public Queue<Crystal> getQueue() {
        return queue;
    }

    public void setQueue(Queue<Crystal> queue) {
        this.queue = queue;
    }

    public int getMaxCrystal() {
        return maxCrystal;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    @Override
    public String toString() {
        return "CrystalProducer{" +
                "queue=" + queue +
                ", maxCrystal=" + maxCrystal +
                ", counter=" + counter +
                '}';
    }

    @Override
    public void run() {
        System.out.println(" Cristal producer start creating crystal");
        while (counter < maxCrystal) {
            synchronized (queue) {
                int totalCount = ThreadLocalRandom.current().nextInt(2, 5);
                int redCrystalCount = ThreadLocalRandom.current().nextInt(0, totalCount);
                for (int i = 0; i < redCrystalCount; i++) {
                    queue.offer(new Crystal(CrystalColorEnum.RED));
                    counter++;
                }
                for (int i = 0; i < totalCount - redCrystalCount; i++) {
                    queue.offer(new Crystal(CrystalColorEnum.WHITE));
                    counter++;
                }
                System.out.println(" Cristal producer creating " + redCrystalCount + " red and " + (totalCount - redCrystalCount) + " while crystal. Count  = " + counter);
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(" Cristal producer finished");
    }

}
