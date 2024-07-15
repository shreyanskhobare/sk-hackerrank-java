/*
Copyright [2024] Shreyans Dilip Khobare
Proof of concept for Code Template
*/
package com.sk.hackerrank.java.medium;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.sk.hackerrank.java.medium.MagicSquare;

/**
* @author - Shreyans Khobare
*/
class MagicSquareTest {

	/* Hackerrank Link:
	 * https://www.hackerrank.com/challenges/magic-square-forming/problem?isFullScreen=true
	 */
	
	private MagicSquare subjectUnderTest;
	
	@BeforeEach
	void setUp() throws Exception {
		
		subjectUnderTest = new MagicSquare();
		
	}

	@Test
	void test_One() {
		
		List<List<Integer>> input = new ArrayList<List<Integer>>();
		Integer[] oneArray = {4,8,2};
		List<Integer> one = Arrays.asList(oneArray);
		input.add(one);
		
		Integer[] twoArray = {4,5,7};
		List<Integer> two = Arrays.asList(twoArray);
		input.add(two);
		
		Integer[] threeArray = {6,1,6};
		List<Integer> three = Arrays.asList(threeArray);
		input.add(three);
		
		int response = subjectUnderTest.formingMagicSquare(input);
		assertEquals(response, 4);
		
	}
	
	@Test
	void test_Two() {
		
		List<List<Integer>> input = new ArrayList<List<Integer>>();
		Integer[] oneArray = {4,9,2};
		List<Integer> one = Arrays.asList(oneArray);
		input.add(one);
		
		Integer[] twoArray = {3,5,7};
		List<Integer> two = Arrays.asList(twoArray);
		input.add(two);
		
		Integer[] threeArray = {8,1,5};
		List<Integer> three = Arrays.asList(threeArray);
		input.add(three);
		
		int response = subjectUnderTest.formingMagicSquare(input);
		assertEquals(response, 1);
		
	}

}
