package org.lesson7.ex3.data;

import java.io.*;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class FileExample {
    private static BufferedReader BufferedReader;
    static String pathName = "data.txt";

    public static void main(String[] args) {
        File myFile = new File(pathName);
        List<String> lineText = new ArrayList<>();
        String text;
        if (pathName == null || pathName.isBlank()) {
            throw new NullPointerException("Wrong path, null or empty!");
        } else if (!myFile.exists()) {
            throw new IllegalArgumentException("There's no such file exist");
        } else {
            try (BufferedReader reader = new BufferedReader(new FileReader(pathName))) {
                while ((text = reader.readLine()) != null) {
                    lineText.add(text);
                }
            } catch (FileNotFoundException e) {
                System.out.println(e.getMessage());
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }

            for (int i = 0; i < lineText.size(); i += 2) {
                System.out.println(lineText.get(i));
            }


        }


    }
}
