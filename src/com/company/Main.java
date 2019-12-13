package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Seconds to sleep:");
        int milliSeconds = scanner.nextInt() * 1000;

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(milliSeconds);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
