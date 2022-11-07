package com.multithreading.homework;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class Magician {
    public void magicianWorking() {
        Queue<Crystal> queue = new LinkedBlockingQueue<>();
        Thread white = new Thread(new WhiteConsumer(queue, 500, true));
        Thread red = new Thread(new RedConsumer(queue, 500, true));
        Thread producer = new Thread(new CrystalProducer(queue, 10000));

        producer.start();
        white.start();
        red.start();
    }
}
