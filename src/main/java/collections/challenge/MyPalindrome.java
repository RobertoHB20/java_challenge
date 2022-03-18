package collections.challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyPalindrome {

    public static void main(String[] args) {

        List<String> p_words = new ArrayList<>(Arrays.asList("ana", "oso", "ala", "rayar" ));
        List<String> np_words = new ArrayList<>(Arrays.asList("ibm", "carro", "perro", "tesoro" ));

        for(String w: p_words){
            System.out.println("Es "+ w + " palindromo? " + Palindrome.isPalindrome(w));
        }
        System.out.println("\n\n");
        for(String w: np_words){
            System.out.println("Es "+ w + " palindromo? " + Palindrome.isPalindrome(w));
        }

//        Palindrome.isPalindrome("ana");


    }

}
