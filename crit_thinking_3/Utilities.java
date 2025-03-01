package crit_thinking_3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Utilities {

    public static void writeToFile(String fileName, String content) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(content);
        }
    }
}