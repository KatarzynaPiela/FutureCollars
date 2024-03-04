package org.lesson7.ex3.data;

import java.io.*;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class FileExample {
    static String pathName = "data.txt";

    public static void main(String[] args) {

        List<String> lineText = new ArrayList<>();

        String text;
        try (BufferedReader reader = new BufferedReader(new FileReader(pathName))) {
            while ((text = reader.readLine()) != null) {
                lineText.add(text);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        for (int i = 0; i < lineText.size(); i += 2) {
            System.out.println(lineText.get(i));
        }


    }


}

