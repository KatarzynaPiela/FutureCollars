package org.lesson7ex4;

import java.io.*;

public class SearchWorld {
    public static void main (String[]args){
        File file = new File("C:\\Users\\48576\\Documents\\Repozytorium\\FutureCollars\\src\\main\\java\\org\\lesson7ex4\\data.txt");
        String filePath = "\"C:\\\\Users\\\\48576\\\\Documents\\\\Repozytorium\\\\FutureCollars\\\\src\\\\main\\\\java\\\\org\\\\lesson7ex4\\\\data.txt\"";
        findSearchWorld(filePath, "Java");
    }
    public static void findSearchWorld(String filePath, String searchWorld){
        System.out.println(filePath);
    try {
        FileReader fileReader = new FileReader(filePath);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String textLine;
        while ((textLine = bufferedReader.readLine()) !=null){
    if(textLine.contains(searchWorld)){
        System.out.println ("Słowo \" " + searchWorld);
    }
        }
        bufferedReader.close();
fileReader.close();

    } catch (FileNotFoundException e) {
       e.printStackTrace();
    } catch (IOException e) {
        throw new RuntimeException(e);
    }

    }
}
