package org.lesson5.ex1;

public class main {
    public static void main(String[] args) {
        Message window = new WindowMessage("This is class WindowMessage");
        Message console = new ConsoleMessage("This is class ConsoleMessage ");
        System.out.println(window.getMessage());
        System.out.println(console.getMessage());
    }
}
