package com.company;

import java.util.concurrent.Semaphore;

public class IncThread implements Runnable{

    String name;
    Semaphore sem;

    public IncThread(String name, Semaphore sem) {
        this.name = name;
        this.sem = sem;
        new Thread(this).start();
    }

    @Override
    public void run() {
        System.out.println("Starting " + name);
        try{
            System.out.println(name + "is waiting for permit");
            sem.acquire();
            System.out.println(name + " gets a permit");
            for (int i = 0; i < 5; i++) {
                Shared.count++;
                System.out.println(name + ":" + Shared.count);
                Thread.sleep(10);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println(name + " released the permit");
        sem.release();
    }
}
