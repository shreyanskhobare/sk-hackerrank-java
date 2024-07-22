/*
Copyright [2024] Shreyans Dilip Khobare
Proof of concept for Code Template
*/
package com.sk.hackerrank.java.easy.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.sk.hackerrank.java.easy.FindDigits;

/**
* @author - Shreyans Khobare
* Hackerrank Link: https://www.hackerrank.com/challenges/find-digits/problem
*/
class FindDigitsTest {
	
	private FindDigits subjectUnderTest;

	@BeforeEach
	void setUp() throws Exception {
		
		subjectUnderTest = new FindDigits();
		
	}

	@Test
	void testFindDigits_One() {
		
		assertEquals(2, subjectUnderTest.findDigits(12));
		assertEquals(3, subjectUnderTest.findDigits(1012));
		
	}
	
	@Test
	void testFindDigits_Two() {
		
		assertEquals(1, subjectUnderTest.findDigits(1000000));
		assertEquals(3, subjectUnderTest.findDigits(014025003));
		
	}

}
