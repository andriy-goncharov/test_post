package org.example;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    FileWriter writer;

    public WriteToFile() {
    }

    public void writeData(String msg) {
        try {
            writer = new FileWriter("src/main/resources/result.txt", true);
            writer.append(msg);
            writer.append('\n');
            writer.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


}
