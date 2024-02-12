package org.lesson6.ex1;

public class Palindrome {
    public static boolean palindrome(String s) {
        StringBuffer buffer = new StringBuffer(s);
        buffer.reverse();
        String data = buffer.toString();
        if (s.equals(data)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "potop";
        boolean b = palindrome(s);
        System.out.println("is" + "a palnidrome ?");

    }
}

