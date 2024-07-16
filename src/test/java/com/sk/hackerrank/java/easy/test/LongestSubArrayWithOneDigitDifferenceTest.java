/*
Copyright [2024] Shreyans Dilip Khobare
Proof of concept for Code Template
*/
package com.sk.hackerrank.java.easy.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.sk.hackerrank.java.easy.LongestSubArrayWithOneDigitDifference;

/**
* @author - Shreyans Khobare
*/
/**
 * Hackerrank link: https://www.hackerrank.com/challenges/picking-numbers/problem?isFullScreen=true
 */
class LongestSubArrayWithOneDigitDifferenceTest {

	private LongestSubArrayWithOneDigitDifference subjectUnderTest;
	
	@BeforeEach
	void setUp() throws Exception {
		subjectUnderTest = new LongestSubArrayWithOneDigitDifference();
	}

	@Test
	void test_One() {
		
		Integer[] array = {1,2,2,3,1,2};
		int response = subjectUnderTest.pickingNumbers(Arrays.asList(array));
		assertEquals(response, 5);
		
	}
	
	
	@Test
	void test_Two() {
		
		Integer[] array = {4,6,5,3,3,1};
		int response = subjectUnderTest.pickingNumbers(Arrays.asList(array));
		assertEquals(response, 3);
		
	}

}
