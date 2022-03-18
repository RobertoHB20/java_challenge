package collections.challenge;

import java.util.ArrayDeque;
import java.util.Deque;

public class Palindrome {

    public static boolean isPalindrome(String word){

        Deque<String> stack = new ArrayDeque<>();
        Deque<String> queue = new ArrayDeque<>();

        for( String ch : word.split("") ){
            stack.push( ch );
            queue.offer( ch );
        }

        String str_stack = "";
        String str_queu = "";

        for(int i = 0 ; i <= stack.size() + 1 ; i++){
            str_stack += stack.pop();
            str_queu += queue.poll();
        }

        return str_queu.equals(str_stack);
    }

}
