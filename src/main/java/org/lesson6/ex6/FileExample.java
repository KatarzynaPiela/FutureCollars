package org.lesson6.ex6;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileExample {

        static String filePath = "C:\\Users\\48576\\Documents\\Repozytorium\\FutureCollars\\src\\main\\java\\org\\lesson6\\ex6\\data.txt";
        public static void main(String[]args) throws IOException {
            File file = new File(filePath);
            String text = Files.readString(Path.of(filePath));
            System.out.println(text.toUpperCase());
        }
    }

