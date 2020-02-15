/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countingduplicatewords;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class CountingDuplicateWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter A Sentence: ");
        
        String sentence = input.nextLine(), word, modified;
        int count = 0;
        char ch;
        
        Map<String, Integer> map = new HashMap<>();
        Scanner sent = new Scanner(sentence);
        while(sent.hasNext()){
            word = sent.next();
            modified = "";
        for(int i = 0; i < word.length(); ++i){
            ch = word.charAt(i);
            if(Character.isAlphabetic(ch) || Character.isDigit(ch)){
                modified += Character.toLowerCase(ch);
            }
        }
        
        if(map.containsKey(modified)){
            count++;
        }
        map.put(modified, 0);
    }
    System.out.println("Number of duplicate words: " + count);
    }
}