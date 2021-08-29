package string.problems;
import java.util.Scanner;


public class Palindrome {


        /*
          If a String is reversed and it remains unchanged, that is called a palindrome.
            Example: MOM, DAD, MADAM are palindromes.

            Write a method to check if a given String is a palindrome or not.
         */
        static boolean isPalindrome(String str)
        {
            int i = 0, j = str.length() - 1;
        while (i < j) {
        if (str.charAt(i) != str.charAt(j))
            return false;
        i++;
        j--;
    }
        return true;
}

    public static void main(String[] args){

        String str = "summer";

        if (isPalindrome(str))
            System.out.print("Yes");
        else
            System.out.print("No");
    }
}


