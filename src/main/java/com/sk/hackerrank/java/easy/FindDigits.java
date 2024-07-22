/*
Copyright [2024] Shreyans Dilip Khobare
Proof of concept for Code Template
*/
package com.sk.hackerrank.java.easy;

/**
* @author - Shreyans Khobare
* Hackerrank Link: https://www.hackerrank.com/challenges/find-digits/problem
*/
public class FindDigits {

	 /*
     * Complete the 'findDigits' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER n as parameter.
     */

    public int findDigits(int n) {
    	// Write your code here
    	
    	String[] integers = String.valueOf(n).split("");
    	int response = 0;
    	
    	for (String integer : integers) {
    		
    		int number = Integer.valueOf(integer);
    		if (0 != number) {
    		
    			if (n % number == 0)
    				response++;
    			
    		}
    		
    	}
    	
    	return response;

    }

	
}
