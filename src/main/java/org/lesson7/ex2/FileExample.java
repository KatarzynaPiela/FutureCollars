package org.lesson7.ex2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileExample {
    public static void main(String[]args) throws IOException {
        String filePath = "C:\\Users\\48576\\Documents\\Repozytorium\\FutureCollars\\src\\main\\java\\org\\lesson7\\ex2\\data.txt";
        File file = new File(filePath);
        file = new File("/home/files/data.txt");
        String text = Files.readString(Path.of(filePath));
        System.out.println(text);
    }

}
