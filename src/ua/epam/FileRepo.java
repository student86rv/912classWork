package ua.epam;

import java.io.*;

//Used by semaphoreTest app, MultiThreadTest class!!!
public class FileRepo {

    public String readFile(String fileName) {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String currentLine;
            while ((currentLine = reader.readLine()) != null){
                sb.append(currentLine);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    public void writeFile(String input, String fileName) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            writer.write(input);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
