/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment5;

import java.util.Scanner;

/**
 *
 * @author macdn5071
 */
public class UbbiDubbiTranslator {

    static boolean checkVowels(char a) {
        if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u') {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        //create a new scanner to use as input
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a word to translate to Ubbi Dubbi.");
        String word = input.nextLine();
        
        //convert words to lowercase
        StringBuilder translation = new StringBuilder();
        boolean prevVowel = false;
        String wordlower = word.toLowerCase();

        //search for vowels to translate to "ub"
        //find the vowels by going through each word
        for (int i = 0; i < wordlower.length(); i++) {
            //look for a vowel at spot i to add a 'ub' before
            if (checkVowels(wordlower.charAt(i))) {
                if (prevVowel == false) {
                    translation.append("ub");
                }
                prevVowel = true;
            } else {
                prevVowel = false;
            }
            translation.append(wordlower.charAt(i));
        }
        System.out.println("'" + word + "' in Ubbi Dubbi is " + translation);

    }
}
