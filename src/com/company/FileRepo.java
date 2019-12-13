package com.company;

import java.io.*;

public class FileRepo {

    public String readFile() {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("test.txt"));
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

    public void writeFile(String input) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("test.txt"));
            writer.write(input);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
