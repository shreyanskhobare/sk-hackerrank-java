/*
Copyright [2024] Shreyans Dilip Khobare
Proof of concept for Code Template
*/
package com.sk.hackerrank.java.regex.easy.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.sk.hackerrank.java.regex.easy.MatchingStartAndEnd;

/**
* @author - Shreyans Khobare
* Hackerrank: https://www.hackerrank.com/challenges/matching-start-end/problem
*/
class MatchingStartAndEndTest {
	
	private MatchingStartAndEnd subjectUnderTest;

	@BeforeEach
	void setUp() throws Exception {
		
		subjectUnderTest = new MatchingStartAndEnd();
		
	}
	
	/**
	 * String of Format: Xxxxx. where ‘x' denotes word and ‘X’ denotes digit. 
	 * String ends with '.’ and should be 6 character only
	 */

	@Test
	void testValidateRegex_One() {
		assertEquals(true, subjectUnderTest.validateRegex("0qwer."));
	}
	
	
	@Test
	void testValidateRegex_Two() {
		assertEquals(true, subjectUnderTest.validateRegex("9AsEe."));
	}
	
	@Test
	void testValidateRegex_Three_FirstNonDigit() {
		assertEquals(false, subjectUnderTest.validateRegex("aqwer."));
	}
	
	@Test
	void testValidateRegex_Four_Length() {
		assertEquals(false, subjectUnderTest.validateRegex("7qer."));
	}
	
	@Test
	void testValidateRegex_Five_LastNotDot() {
		assertEquals(false, subjectUnderTest.validateRegex("7qert7"));
	}
	
	@Test
	void testValidateRegex_Five_LastNotDot2() {
		assertEquals(false, subjectUnderTest.validateRegex("7qerta"));
	}

}
