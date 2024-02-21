package org.lesson7ex5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Stack;

public class Text {
    private static Stack<String> lines = new Stack<>();

    public static void main(String[] args) {
        checkIfIsReversedOrder("C:\\Users\\48576\\Documents\\Repozytorium\\FutureCollars\\src\\main\\java\\org\\lesson7ex5\\data.txt");
    }

    public static void checkIfIsReversedOrder(String fileName) {
        readAndPushLines(fileName);
        displayReversedLines();
    }
    private static void readAndPushLines(String fileName) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            boolean line;
            while ((line = bufferedReader.readLine() != null)){
                lines.push(String.valueOf(line));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void displayReversedLines(){
        while (!lines.isEmpty()){
            System.out.println(lines.pop());
        }
    }


}


