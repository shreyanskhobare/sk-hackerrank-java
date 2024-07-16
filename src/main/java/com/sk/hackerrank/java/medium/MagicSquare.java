/*
Copyright [2024] Shreyans Dilip Khobare
Proof of concept for Code Template
*/
package com.sk.hackerrank.java.medium;

import java.util.List;

/**
* @author - Shreyans Khobare
*/
/** Hackerrank Link:
 * https://www.hackerrank.com/challenges/magic-square-forming/problem?isFullScreen=true
 */
public class MagicSquare {
	
	/**
	 * The key here is to know that only 8 possible magic squares are possible with a 3x3 matrix having numbers 1-9. If this is not known we can still find the constand by adding 1-9 (45) and dividing it by 3(number of rows) to get the constant 15. So instead of creating a function to find lowest cost magic square for any given input of 's' we need to instead compare the given 's' with the possible 8 magic squares.

		There is really only 1 magic square possible; all the versions are just the rotations and the mirrored rotations (therefore 8 total).
		
		Pretty much these are the "rules":
		
		5 is in the center
		
		1 and 9 are opposite within a middle line
		
		3 and 7 are opposite within the other middle line
		
		8 is between 1 and 3
		
		4 is between 3 and 9
		
		2 is between 9 and 7
		
		6 is between 1 and 7
		
		(You could solve the rest from here)
	 * @param s
	 * @return
	 */
	
	public int formingMagicSquare(List<List<Integer>> s) {
		
		 int[][] magicSquares = new int[8][9];
	        int[] square1 = {8, 1, 6, 3, 5, 7,  4, 9, 2};
	        magicSquares[0] = square1;
	        
	        int[] square2 = {6, 1, 8, 7, 5, 3, 2, 9, 4};
	        magicSquares[1] = square2;
	        
	        int[] square3 = {2, 9, 4, 7, 5, 3, 6, 1, 8};
	        magicSquares[2] = square3;
	        
	        int[] square4 = {4, 9, 2, 3, 5, 7, 8, 1, 6};
	        magicSquares[3] = square4;
	        
	        int[] square5 = {8, 3, 4, 1, 5, 9, 6, 7, 2};
	        magicSquares[4] = square5;    
	    
	        int[] square6 = {6, 7, 2, 1, 5, 9, 8, 3, 4};
	        magicSquares[5] = square6; 
	    
	        int[] square7 = {4, 3, 8, 9, 5, 1, 2, 7, 6};
	        magicSquares[6] = square7; 
	    
	        int[] square8 = {2, 7, 6, 9, 5, 1, 4, 3, 8};
	        magicSquares[7] = square8; 
	        
	        int minimum = 99999;
	        for (int outer=0; outer<8;outer++) {
	            
	            int magicIndex = 0;
	            int difference = 0;
	            int[] square = magicSquares[outer];
	            for (List<Integer> list : s) {
	            
	                for (Integer i : list) {
	                    
	                    if (i != square[magicIndex]) {
	                        difference += Math.abs(square[magicIndex] - i);
	                    }
	                    
	                    magicIndex++;
	                    
	                }    
	                
	            }
	            if (minimum > difference) {
	                minimum = difference;
	            }
	            
	        }
	        
	        return minimum;
		
	}

}
