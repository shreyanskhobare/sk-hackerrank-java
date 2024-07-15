/*
Copyright [2024] Shreyans Dilip Khobare
Proof of concept for Code Template
*/
package com.sk.hackerrank.java.easy;

import java.util.List;

/**
* @author - Shreyans Khobare
*/
/**
 * Hackerrank link: https://www.hackerrank.com/challenges/picking-numbers/problem?isFullScreen=true
 */
public class LongestSubArrayWithOneDigitDifference {

    public int pickingNumbers(List<Integer> a) {
    // Write your code here
    
        a.sort((i, j) -> Integer.compare(i, j));
        int maximum = 0;
        for (int outer=0; outer<a.size();outer++) {
            
            int subset = 0;
            for (int inner = outer; inner < a.size(); inner++) {
                
                if ((a.get(inner) - a.get(outer)) > 1) {
                    break;
                }
                subset++;
                
            }
            
            if (subset > maximum) {
                maximum = subset;
            }
            
        }
        
        return maximum;

    }
	
}
