package net.salesianos.activity2;

import java.io.FileReader;
import java.io.IOException;

public class Activity2 {
    public static void main(String[] args) {
        String fileRoute = "src/net/salesianos/activity2/Activity2.txt";
        readAndDisplayText(fileRoute);
    }

    public static void readAndDisplayText(String fileRoute) {
        try (FileReader reader = new FileReader(fileRoute)) {
            int nextChar = reader.read();

            while (nextChar != -1) {
                char character = (char) nextChar;
                System.out.printf("%c_%d, ", character, nextChar);
                nextChar = reader.read();

            }

        } catch (IOException e) {
            System.out.println("ERROR: Problema de I/O.");
        }
    }
}
