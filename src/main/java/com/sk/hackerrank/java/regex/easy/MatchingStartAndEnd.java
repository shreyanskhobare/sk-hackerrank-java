/*
Copyright [2024] Shreyans Dilip Khobare
Proof of concept for Code Template
*/
package com.sk.hackerrank.java.regex.easy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
* @author - Shreyans Khobare
* Hackerrank: https://www.hackerrank.com/challenges/matching-start-end/problem
*/
public class MatchingStartAndEnd {
	
	public boolean validateRegex(String input) {
		
		/**
		 * String of Format: Xxxxx. where ‘x' denotes word and ‘X’ denotes digit. 
		 * String ends with '.’ and should be 6 character only
		 */
		Pattern pattern = Pattern.compile("^\\d(\\w){4}\\.$");
		Matcher matcher = pattern.matcher(input);
		return matcher.find();
		
	}

}
