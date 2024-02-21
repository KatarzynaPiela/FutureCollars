package org.lesson7.ex1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileExample {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\48576\\Documents\\Repozytorium\\FutureCollars\\src\\main\\java\\org\\lesson7\\ex1\\data.txt";
        String text = "Kurs\n" +
                "Java\n" +
                "Lekcja 6\n" +
                "Pliki\n" +
                "Wyjątki\n" +
                "Pliki\n" +
                "Koniec pliku";

        Files.writeString(Path.of(path), text);
    }
}

