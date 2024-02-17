package org.lesson6.ex1;

public class Text {
    public static void main (String[]args){
        String inputText = "Potop";
        if(containsAnyCharacters(inputText)){
            System.out.println("Tekst zawiera jakiekolwiek znaki");
            if(isPalimdrome(inputText)){
                System.out.println(("tekst jest palindromem"));
            } else {
                System.out.println(("tekst nie jest palindromem"));
            }
            int textLength = calculateTextLength(inputText);
            System.out.println("Długośc tekstu:" + textLength);
        }else{
            System.out.println("Tekst nie zawiera żadnych znaków");
        }
    }
    private static boolean containsAnyCharacters(String text){return !text.isEmpty();}
    private  static boolean isPalimdrome(String text){
        String reversedText = new StringBuilder(text).reverse().toString();
        return text.equals(reversedText);
    }
    private static int calculateTextLength(String text){return text.length();}
}
