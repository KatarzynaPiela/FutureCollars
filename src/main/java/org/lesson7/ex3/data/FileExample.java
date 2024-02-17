package org.lesson7.ex3.data;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Files;

public class FileExample {
    private static BufferedReader BufferedReader;

    public static void main(String[] args) {

        try {
            String filePath = "C:\\Users\\48576\\Documents\\Repozytorium\\FutureCollars\\src\\main\\java\\org\\lesson7\\ex3\\data\\data.txt";
            int lineNumber = 0;
            String line;
            BufferedReader = new BufferedReader(new FileReader(filePath));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
