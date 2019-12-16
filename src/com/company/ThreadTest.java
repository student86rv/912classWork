package com.company;

import java.util.Scanner;

//public class ThreadTest {

   // public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Seconds to sleep:");
//        int milliSeconds = scanner.nextInt() * 1000;
//
//        for (int i = 0; i < 5; i++) {
//            System.out.println(i);
//            try {
//                Thread.sleep(milliSeconds);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//        FileRepo repo = new FileRepo();
//
//        Thread thread1 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                repo.writeFile("qwerty");
//            }
//        });
//
//        Thread thread2 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println(repo.readFile());
//            }
//        });
//        Thread thread3 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                repo.writeFile("asdfg");;
//            }
//        });
//
//        thread1.run();
//        thread2.run();
//        thread3.run();
//    }
//}
