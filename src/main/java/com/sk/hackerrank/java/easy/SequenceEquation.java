/*
Copyright [2024] Shreyans Dilip Khobare
Proof of concept for Code Template
*/
package com.sk.hackerrank.java.easy;

import java.util.ArrayList;
import java.util.List;

/**
* @author - Shreyans Khobare
* Hackerrank link: https://www.hackerrank.com/challenges/permutation-equation/problem
*/
public class SequenceEquation {

    /*
     * Complete the 'permutationEquation' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY p as parameter.
     */

    public List<Integer> permutationEquation(List<Integer> p) {
    	// Write your code here
    	
    	List<Integer> response = new ArrayList<Integer>();
    	
    	for (int i=1; i<=p.size();i++) {
    	
    		int first = p.indexOf(i);
    		int second = p.indexOf(first+1);
    		response.add(second+1);
    		
    	}
    	
    	return response;

    }

	
}
