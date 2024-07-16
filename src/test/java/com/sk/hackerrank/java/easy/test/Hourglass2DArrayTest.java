/*
Copyright [2024] Shreyans Dilip Khobare
Proof of concept for Code Template
*/
/**
Copyright [2024] Shreyans Khobare
Proof of concept for Copyright Statement
 */
package com.sk.hackerrank.java.easy.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.sk.hackerrank.java.easy.Hourglass2DArray;

/**
* @author - Shreyans Khobare
*/
/**
 * Hackerrank Link:
 * https://www.hackerrank.com/challenges/java-2d-array/problem?isFullScreen=true
 */
class Hourglass2DArrayTest {
	
	private Hourglass2DArray subjectUnderTest;
	
	@BeforeEach
	public void setup() {
		subjectUnderTest = new Hourglass2DArray();
	}
	
	@Test
	void testMaximumHourglassValue_1() {
		List<List<Integer>> input = new ArrayList<List<Integer>>();
		Integer[] oneArray = {1,1,1,0,0,0};
		List<Integer> one = Arrays.asList(oneArray);
		input.add(one);
		
		Integer[] twoArray = {0,1,0,0,0,0};
		List<Integer> two = Arrays.asList(twoArray);
		input.add(two);
		
		Integer[] threeArray = {1,1,1,0,0,0};
		List<Integer> three = Arrays.asList(threeArray);
		input.add(three);
		
		Integer[] fourArray = {0,9,2,-4,-4,0};
		List<Integer> four = Arrays.asList(fourArray);
		input.add(four);
		
		Integer[] fiveArray = {0,0,0,-2,0,0};
		List<Integer> five = Arrays.asList(fiveArray);
		input.add(five);
		
		Integer[] sixArray = {0,0,-1,-2,-4,0};
		List<Integer> six = Arrays.asList(sixArray);
		input.add(six);
		
		int response = subjectUnderTest.maximumHourglassValue(input);
		assertEquals(response, 13);
		
		
	}
	
	@Test
	void testMaximumHourglassValue_2() {
		List<List<Integer>> input = new ArrayList<List<Integer>>();
		Integer[] oneArray = {1,1,1,0,0,0};
		List<Integer> one = Arrays.asList(oneArray);
		input.add(one);
		
		Integer[] twoArray = {0,1,0,0,0,0};
		List<Integer> two = Arrays.asList(twoArray);
		input.add(two);
		
		Integer[] threeArray = {1,1,1,0,0,0};
		List<Integer> three = Arrays.asList(threeArray);
		input.add(three);
		
		Integer[] fourArray = {0,0,2,4,4,0};
		List<Integer> four = Arrays.asList(fourArray);
		input.add(four);
		
		Integer[] fiveArray = {0,0,0,2,0,0};
		List<Integer> five = Arrays.asList(fiveArray);
		input.add(five);
		
		Integer[] sixArray = {0,0,1,2,4,0};
		List<Integer> six = Arrays.asList(sixArray);
		input.add(six);
		
		int response = subjectUnderTest.maximumHourglassValue(input);
		assertEquals(response, 19);
		
		
	}

}
