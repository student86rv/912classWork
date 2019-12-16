package com.company;

import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(1);
//        IncThread incThread = new IncThread("A", semaphore);

        StringBuilder sb = new StringBuilder();

        FileAccessThread threadA = new FileAccessThread("A", "file1.txt", semaphore);
        FileAccessThread threadB = new FileAccessThread("B", "file2.txt", semaphore);
        FileAccessThread threadC = new FileAccessThread("C", "file3.txt", semaphore);
    }
}
