package ua.epam.threadTest;

import ua.epam.FileRepo;

public class MultiThreadTest {

    //This class uses FileRepo class!!!
    public static void main(String[] args) {

        FileRepo repo = new FileRepo();

//        Thread thread1 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                repo.writeFile("qwerty", "test.txt");
//            }
//        });

        Thread thread1 = new Thread(() -> repo.writeFile("qwerty", "test.txt"));

        Thread thread2 = new Thread(() -> System.out.println(repo.readFile("test.txt")));

        Thread thread3 = new Thread(() -> repo.writeFile("asdfg", "test.txt"));

        thread1.run();
        thread2.run();
        thread3.run();
    }
}
