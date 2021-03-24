//Java program to check whether an alphabet is a vowel or consonant

package src.com.mkpits.java.basicjavaprograms;

import java.util.*;

class ExToCheckWhetherAnAlphabetIsAVowelOrConsonant {
    public static void main(String[] args) {
        char ch;
        Scanner scan = new Scanner(System.in);
        System.out.println("\nEnter the alphabet: ");
        ch = scan.next().charAt(0);
        if (ch == 'a' || ch == 'A')
            System.out.println("The alphabet is a vowel.");
        else if (ch == 'e' || ch == 'E')
            System.out.println("The alphabet is a vowel.");
        else if (ch == 'i' || ch == 'I')
            System.out.println("The alphabet is a vowel.");
        else if (ch == 'o' || ch == 'O')
            System.out.println("The alphabet is a vowel.");
        else if (ch == 'u' || ch == 'U')
            System.out.println("The alphabet is a vowel.");
        else
            System.out.println("The alphabet is a consonant.");
        System.out.println();
    }
}