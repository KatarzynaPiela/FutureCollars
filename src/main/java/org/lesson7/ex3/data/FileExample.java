package org.lesson7.ex3.data;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Files;

public class FileExample {
    public static void main(String[] args) throws IOException {
        String filePath = "C:\\Users\\48576\\Documents\\Repozytorium\\FutureCollars\\src\\main\\java\\org\\lesson7\\ex3\\data\\data.txt";
        File file = new File(filePath);
        String text = Files.readString(Path.of(filePath));
        System.out.println(text);
    }
}
