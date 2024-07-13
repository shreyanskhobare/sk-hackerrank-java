/*
Copyright [2024] Shreyans Dilip Khobare
Proof of concept for Code Template
*/
package com.sk.hackerrank.java;

import java.util.List;
import java.util.stream.IntStream;

/**
* @author - Shreyans Khobare
*/
/**
 * Hackerrank link: https://www.hackerrank.com/challenges/designer-pdf-viewer/problem
 */
public class DesignerPdfAlphabetValueBasedOnIndexLocation {

    public int designerPdfViewer(List<Integer> h, String word) {
    // Write your code here
    
        String[] alphabets = word.split("");
        int maximum = 0;
        for (int i=0; i<alphabets.length;i++) {
            int index = alphabets[i].toCharArray()[0] - 'a';
            int val = h.get(index);
            if (val > maximum) {
                maximum = val;
            }
        }
        
        int value = maximum * alphabets.length;
        
        /**
         * Better Simpler Solution using Lambda below
         * 
         */
        //IntStream.range(0, word.length()).map(c->h.get(word.charAt(c)-97)).max().getAsInt()*word.length();
		value = IntStream.range(0, word.length()).map(c -> h.get(word.charAt(c) - 97))
				.max().getAsInt()* word.length();
        
        return value;

    }

}
