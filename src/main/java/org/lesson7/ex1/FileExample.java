package org.lesson7.ex1;

import java.io.File;

public class FileExample {

    public static void main(String[]args) {
        File file = new File("C:\\Users\\48576\\Documents\\Repozytorium\\FutureCollars\\src\\main\\java\\org\\lesson7\\ex1\\data.txt");
        System.out.println(file.canWrite());
        }
    }

