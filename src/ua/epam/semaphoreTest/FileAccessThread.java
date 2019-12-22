package ua.epam.semaphoreTest;

import ua.epam.FileRepo;

import java.util.concurrent.Semaphore;

//Use FileRepo class!!!
public class FileAccessThread implements Runnable{

    String name;
    String fileName;
    Semaphore sem;

    public FileAccessThread(String name, String fileName, Semaphore sem) {
        this.name = name;
        this.fileName = fileName;
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

            FileRepo fileRepo = new FileRepo();

            String writeToFile = fileRepo.readFile("finalFile.txt") + " " + fileRepo.readFile(fileName);

            fileRepo.writeFile(writeToFile, "finalFile.txt");


        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println(name + " released the permit");
        sem.release();
    }
}
