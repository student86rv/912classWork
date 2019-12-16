package com.company;

import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(1);
        IncThread incThread = new IncThread("A", semaphore);

    }
}
