/*
Copyright [2024] Shreyans Dilip Khobare
Proof of concept for Code Template
*/
package com.sk.hackerrank.java.easy;

/**
* @author - Shreyans Khobare
* Hackerrank link: https://www.hackerrank.com/challenges/sherlock-and-squares/problem?isFullScreen=true
*/
public class SherlockAndSquares {

    /*
     * Complete the 'squares' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER a
     *  2. INTEGER b
     */

    public int squares_MySolution(int a, int b) {
    	
    	/**
    	 * Extremely bad performance wise! Not recommended
    	 */
    	
    	int count = 0;
    	
    	for (int i=a; i<=b;i++) {
    		double root = Math.sqrt(i);
    		if (root % 1 == 0) {
    			count++;
    		}
    		
    	}
    	
    	return count;

    }
    
    /*
     * Complete the 'squares' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER a
     *  2. INTEGER b
     */

    public int squares_BetterSolution1(int a, int b) {
    	// Write your code here
    	int count = 0;
        int num = 0;
       
        while(true) {
            int pow = (int) Math.pow(num++, 2);
            if(pow >=a && pow <= b) count++;
            if(pow > b) {
            	return count;
            }
        }

    }
    
    /*
     * Complete the 'squares' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER a
     *  2. INTEGER b
     */

    public int squares_BetterSolution2(int a, int b) {
    	// Write your code here
        int sqrtA = (int) Math.ceil(Math.sqrt(a)); 
        int sqrtB = (int) Math.floor(Math.sqrt(b));
        return sqrtB - sqrtA + 1;

    }
	
}
