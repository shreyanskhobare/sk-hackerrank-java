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
 * Hackerrank Link:
 * https://www.hackerrank.com/challenges/java-2d-array/problem?isFullScreen=true
 */
public class Hourglass2DArray {

	public int maximumHourglassValue(List<List<Integer>> arr) {
		
        int maximumValue = -999999;
        for (int outer=0; outer<4; outer++) {
            List<Integer> outerListRowOne = arr.get(outer); 
            List<Integer> outerListRowTwo = arr.get(outer+1);
            List<Integer> outerListRowThree = arr.get(outer+2);                   
            for (int inner=0; inner<4; inner++) {
                int rowOne = outerListRowOne.get(inner) + outerListRowOne.get(inner+1) + outerListRowOne.get(inner+2);
                int rowTwo = outerListRowTwo.get(inner+1);
                int rowThree = outerListRowThree.get(inner) + outerListRowThree.get(inner+1) + outerListRowThree.get(inner+2);
               
                if (maximumValue < (rowOne + rowTwo + rowThree)) {
                    maximumValue = rowOne + rowTwo + rowThree;
                }
            }
                    
        }

        return maximumValue;
		
	}
	
}
